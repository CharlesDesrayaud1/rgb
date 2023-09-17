package com.example.Oui.Service;

import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.DAO.Event.Penalty;
import com.example.Oui.DAO.Event.PenaltyType;

import com.example.Oui.Repository.PenaltyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PenaltyService {
    private PenaltyRepository penaltyRepository;
    private FixtureService fixtureService;
    public List<Penalty> getAllPenalty(){
        return penaltyRepository.findAll();
    }

    public List<Penalty> getPenaltiesByTeamByMatch(int id, String team){
        Fixture fixture = fixtureService.getByID(id);
        return penaltyRepository.findByFixtureAndTeam(fixture, team)
                .stream()
                .filter(penalty -> penalty.getPenaltyType() != PenaltyType.ForwardPass)
                .collect(Collectors.toList());
    }

    public List<Penalty> getForwardPassByTeamByMatch(int id, String team){
        Fixture fixture = fixtureService.getByID(id);
        return penaltyRepository.findByFixtureAndTeam(fixture, team)
                .stream()
                .filter(penalty -> penalty.getPenaltyType() == PenaltyType.ForwardPass)
                .collect(Collectors.toList());
    }

    public String getPenaltyCount(int id){
        Fixture fixture = fixtureService.getByID(id);
        String teamHome = fixture.getTeam_home();
        String teamAway = fixture.getTeam_away();
        List<Penalty> penaltyListHome = penaltyRepository.findByFixtureAndTeam(fixture, teamHome)
                .stream()
                .filter(penalty -> penalty.getPenaltyType() != PenaltyType.ForwardPass)
                .collect(Collectors.toList());
        List<Penalty> penaltyListAway = penaltyRepository.findByFixtureAndTeam(fixture, teamAway)
                .stream()
                .filter(penalty -> penalty.getPenaltyType() != PenaltyType.ForwardPass)
                .collect(Collectors.toList());
        return teamHome+" : "+penaltyListHome.size() + " Penalties\n"
                + teamAway +" : "+ penaltyListAway.size() + " Penalties";
    }

}

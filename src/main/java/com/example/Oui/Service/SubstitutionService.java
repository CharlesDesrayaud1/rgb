package com.example.Oui.Service;

import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.DAO.Event.Penalty;
import com.example.Oui.DAO.Event.Substitution;
import com.example.Oui.Repository.PenaltyRepository;
import com.example.Oui.Repository.SubstitutionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubstitutionService {
    private SubstitutionRepository substitutionRepository;
    private FixtureService fixtureService;
    public List<Substitution> getAllSubstitution(){
        return substitutionRepository.findAll();
    }

    public List<Substitution> getByTeamAndMatch(int id, String team){
        Fixture fixture = fixtureService.getByID(id);
        return substitutionRepository.findByFixtureAndTeam(fixture, team);
    }
}

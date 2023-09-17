package com.example.Oui.Service;


import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.DAO.Event.Mark;
import com.example.Oui.Repository.MarkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MarkService {
    private MarkRepository markRepository;
    private FixtureService fixtureService;
    public List<Mark> getAllMark(){
        return markRepository.findAll();
    }

    public String getResult(int id){
        Fixture fixture = fixtureService.getFixtureByID(id);
        String teamHome = fixture.getTeam_home();
        String teamAway = fixture.getTeam_away();
        List<Mark> markListHome = markRepository.findByTeam(teamHome);
        List<Mark> markListAway = markRepository.findByTeam(teamAway);
        return markListAway.toString();
    }
}

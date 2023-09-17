package com.example.Oui.Service;


import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.DAO.Event.Mark;
import com.example.Oui.DAO.Event.MarkType;
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
        Fixture fixture = fixtureService.getByID(id);
        String teamHome = fixture.getTeam_home();
        String teamAway = fixture.getTeam_away();
        List<Mark> markListHome = markRepository.findByFixtureAndTeam(fixture, teamHome);
        List<Mark> markListAway = markRepository.findByFixtureAndTeam(fixture, teamAway);
        int scoreHome = 0;
        int scoreAway = 0;
        for(Mark mark : markListHome){
            scoreHome = scoreHome + pointCalculation(mark.getMarkType());
        }
        for(Mark mark : markListAway){
            scoreAway = scoreAway + pointCalculation(mark.getMarkType());
        }
        return teamHome+" "+scoreHome + "-" + scoreAway+" "+teamAway;
    }

    private int pointCalculation(MarkType markType){
        switch (markType){
            case tri:
                return 5;
            case drop:
            case penalty:
                return 3;
            case conversion:
                return 2;
        }
        return 0;
    }

}

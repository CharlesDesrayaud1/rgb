package com.example.Oui.Controller;

import com.example.Oui.DAO.Event.Mark;
import com.example.Oui.DAO.Event.Penalty;
import com.example.Oui.Service.MarkService;
import com.example.Oui.Service.PenaltyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/penalty")
@AllArgsConstructor
public class PenaltyController {
    private PenaltyService penaltyService;
    @GetMapping
    public List<Penalty> getAll(){
        return penaltyService.getAllPenalty();
    }

    @GetMapping("/penbyteam")
    public List<Penalty> getPenaltiesByFixtureAnTeam(@RequestParam(name = "id") int id, @RequestParam(name = "team") String team){
        return penaltyService.getPenaltiesByTeamByMatch(id, team);
    }

    @GetMapping("/forwardbyteam")
    public List<Penalty> getForwardPassByFixtureAnTeam(@RequestParam(name = "id") int id, @RequestParam(name = "team") String team){
        return penaltyService.getForwardPassByTeamByMatch(id, team);
    }

    @GetMapping("/countpenalties")
    public String getPenaltiesCountByTeam(@RequestParam(name = "id") int id){
        return penaltyService.getPenaltyCount(id);
    }

}

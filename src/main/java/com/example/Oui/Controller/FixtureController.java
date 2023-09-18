package com.example.Oui.Controller;

import com.example.Oui.DAO.Event.Fixture;
import com.example.Oui.Service.FixtureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fixture")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class FixtureController {
    private FixtureService fixtureService;

    @GetMapping
    public List<Fixture> getAll(){
        return fixtureService.getAll();
    }
}

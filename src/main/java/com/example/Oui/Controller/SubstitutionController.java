package com.example.Oui.Controller;

import com.example.Oui.DAO.Event.Mark;
import com.example.Oui.DAO.Event.Substitution;
import com.example.Oui.Service.MarkService;
import com.example.Oui.Service.SubstitutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/substitution")
@AllArgsConstructor
public class SubstitutionController {

    private SubstitutionService substitutionService;
    @GetMapping("/all")
    public List<Substitution> getAll(){
        return substitutionService.getAllSubstitution();
    }
}

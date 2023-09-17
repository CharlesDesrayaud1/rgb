package com.example.Oui.Controller;

import com.example.Oui.DAO.Event.Mark;
import com.example.Oui.Service.MarkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/mark")
@AllArgsConstructor
public class MarkController {

    private MarkService markService;
    @GetMapping("/all")
    public List<Mark> getAll(){
        return markService.getAllMark();
    }

    @GetMapping("/result")
    public String getResult(@RequestParam(name = "id") int id){
        return markService.getResult(id);
    }

}

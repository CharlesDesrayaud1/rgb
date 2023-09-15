package com.example.Oui;

import com.example.Oui.DAO.Event.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class EventController {

    @GetMapping
    public void getEvent(){
        System.out.println("Hello World");
    }

}

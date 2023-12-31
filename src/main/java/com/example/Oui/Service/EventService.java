package com.example.Oui.Service;



import com.example.Oui.DAO.Event.Event;
import com.example.Oui.DAO.Event.EventList;
import com.example.Oui.Repository.EventRepository;
import com.example.Oui.Repository.FixtureRepository;
import com.example.Oui.Repository.MarkRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class EventService {

    @Autowired
    private WebClient webClient;
    private EventRepository eventRepository;
    private MarkRepository markRepository;
    private FixtureRepository fixtureRepository;
    @Bean
    public void getEvents() throws JsonProcessingException {
        String string = this.webClient
                .get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
        //System.out.println(string);
        ObjectMapper objectMapper = new ObjectMapper();
        EventList eventList = objectMapper.readValue(string, EventList.class);
        //Event event = objectMapper.readValue(string, Event.class);
        //fixtureRepository.save(event.getFixture());
        //eventRepository.save(event);
        //System.out.println(event.getFixture());
        saveAllEvent(eventList);
        System.out.println(eventList);
    }

    public void saveAllEvent(EventList eventList){
        List<Event> eventList1 = eventRepository.findAll();
        int sizeInput = eventList.getEventList().size();
        int sizeDB = eventList1.size();
        if(sizeInput - sizeDB>0){
            eventRepository.saveAll(eventList.getEventList().subList(sizeDB, sizeInput));
        }
    }

}

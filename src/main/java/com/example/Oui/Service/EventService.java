package com.example.Oui.Service;



import com.example.Oui.DAO.Event.Event;
import com.example.Oui.Repository.EventRepository;
import com.example.Oui.Repository.MarkRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Data
@AllArgsConstructor
public class EventService {

    @Autowired
    private WebClient webClient;
    private EventRepository eventRepository;
    private MarkRepository markRepository;
    @Bean
    public void getEvents() throws JsonProcessingException {
        String string = this.webClient
                .get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println(string);
        ObjectMapper objectMapper = new ObjectMapper();
        Event event = objectMapper.readValue(string, Event.class);
        saveEvent(event);
    }

    public void saveEvent(Event event){
        eventRepository.save(event);
        //System.out.println(markRepository.findById(2).getClass());
    }

}

package com.example.Oui.DAO.Event;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
public class EventList {
    private List<Event> eventList;

    @JsonCreator
    public EventList(List<Event> eventList){
        this.eventList = eventList;
    }

}

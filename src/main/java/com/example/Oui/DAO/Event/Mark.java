package com.example.Oui.DAO.Event;

import javax.persistence.Entity;

@Entity(name = "mark")
public class Mark extends Event {
    private MarkType markType;
    public Mark(int id, String player, String fixture, String team, int timer, MarkType markType){
        super(id, timer, player, fixture, team);
        this.markType = markType;
    }
}

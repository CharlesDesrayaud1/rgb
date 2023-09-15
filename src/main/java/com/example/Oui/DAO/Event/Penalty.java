package com.example.Oui.DAO.Event;

import javax.persistence.Entity;

@Entity(name = "penalty")
public class Penalty extends Event {
    private PenaltyType penaltyType;
    public Penalty(int id, PenaltyType penaltyType, String player, String fixture, String team, int timer) {
        super(id, timer, player, fixture, team);
        this.penaltyType = penaltyType;
    }
}

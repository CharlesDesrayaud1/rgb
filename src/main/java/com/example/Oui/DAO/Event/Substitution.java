package com.example.Oui.DAO.Event;

import javax.persistence.Entity;

@Entity(name = "substitution")
public class Substitution extends Event {
    private String playerSub;
    public Substitution(int id, String playerSub, String player, String fixture, String team, int timer){
        super(id, timer, player, fixture, team);
        this.playerSub = playerSub;
    }
}

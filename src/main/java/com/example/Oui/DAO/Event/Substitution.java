package com.example.Oui.DAO.Event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;

@Entity(name = "substitution")
public class Substitution extends Event {
    private String playerSub;
    @JsonCreator
    public Substitution(@JsonProperty("player") String player,
                @JsonProperty("fixture") String fixture,
                @JsonProperty("team") String team,
                @JsonProperty("timer") int timer,
                @JsonProperty("playerSub") String playerSub){
        super(0, timer, player, fixture, team);
        this.playerSub = playerSub;
    }

    public Substitution(){
        super();
    }
}

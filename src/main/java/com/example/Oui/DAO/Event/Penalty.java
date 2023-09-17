package com.example.Oui.DAO.Event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "penalty")
@Data
public class Penalty extends Event {
    private PenaltyType penaltyType;
    @JsonCreator
    public Penalty(@JsonProperty("player") String player,
                @JsonProperty("fixture") Fixture fixture,
                @JsonProperty("team") String team,
                @JsonProperty("timer") int timer,
                @JsonProperty("penaltyType") PenaltyType penaltyType){
        super(0, timer, player, fixture, team);
        this.penaltyType = penaltyType;
    }
    public Penalty(){
        super();
    }
}

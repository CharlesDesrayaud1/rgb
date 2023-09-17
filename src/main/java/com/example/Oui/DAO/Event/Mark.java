package com.example.Oui.DAO.Event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import java.beans.ConstructorProperties;

@Entity(name = "mark")
@Data
public class Mark extends Event {

    private MarkType markType;
    @JsonCreator
    public Mark(@JsonProperty("player") String player,
                @JsonProperty("fixture") Fixture fixture,
                @JsonProperty("team") String team,
                @JsonProperty("timer") int timer,
                @JsonProperty("markType") MarkType markType){
        super(0, timer, player, fixture, team);
        this.markType = markType;
    }

    public Mark(){
        super();
    }
}

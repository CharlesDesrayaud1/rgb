package com.example.Oui.DAO.Event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fixture")
@Data
@NoArgsConstructor
public class Fixture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;
    private String team_home;
    private String team_away;
    private String match_type;
    private String stadium;
    private String referee;
    private Date date;

    @JsonCreator
    public Fixture(@JsonProperty("id") int id,
                @JsonProperty("team_home") String team_home,
                @JsonProperty("team_away") String team_away,
                @JsonProperty("match_type") String match_type,
                @JsonProperty("stadium") String stadium,
                @JsonProperty("referee") String referee,
                @JsonProperty("date") Date date
    ){
        this.id = id;
        this.team_home = team_home;
        this.team_away = team_away;
        this.match_type = match_type;
        this.stadium = stadium;
        this.referee = referee;
        this.date = date;
    }

}

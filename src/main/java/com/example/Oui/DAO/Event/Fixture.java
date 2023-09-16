package com.example.Oui.DAO.Event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fixture")
@AllArgsConstructor
public class Fixture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private int id;
    private String team_home;
    private String team_away;
    private String match_type;
    private String stadium;
    private String referee;
    private Date date;
}

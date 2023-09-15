package com.example.Oui.DAO.Event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "event")
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "timer")
    @JsonProperty("timer")
    private int timer;

    @Column(name = "player")
    @JsonProperty("player")
    private String player;

    @Column(name = "fixture")
    @JsonProperty("fixture")
    private String fixture;

    @Column(name = "team")
    @JsonProperty("team")
    private String team;
}

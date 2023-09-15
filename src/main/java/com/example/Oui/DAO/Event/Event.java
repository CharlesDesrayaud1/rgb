package com.example.Oui.DAO.Event;

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
    private int timer;

    @Column(name = "player")
    private String player;

    @Column(name = "fixture")
    private String fixture;

    @Column(name = "team")
    private String team;
}

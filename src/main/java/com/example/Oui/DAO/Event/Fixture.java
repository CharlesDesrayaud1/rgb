package com.example.Oui.DAO.Event;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
public class Fixture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String team_home;
    private String team_away;
    private String match_type;
    private String stadium;
    private String referee;
    private Date date;
}

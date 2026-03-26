package com.example.FootyFocusFinal.entity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.transaction.*;

@Entity
@Transactional
@Setter
@Getter
public class LeagueStandings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //for competition - Primier league, Ligue 1, la liga
    //under competition
    private String competitionName;
    private String competitionEmblem;

    //for season start and end date
    private String seasonStartDate;
    private String seasonEndDate;
    private int currentMatchDay;

    //For actual standings
    //from table
    private int position;

    //from team
    private String teamName;
    private String teamCrest;
    private String teamShortName;

    //from table
    private int matchesPlayed;
    private  String teamForm;
    private int gamesWon;
    private int gamesLost;
    private int gamesDrew;
    private int noOfPoints;
    private int goalDifference;
}

package com.example.mobileappdevelop.fragmentdemo.activity;

import com.example.mobileappdevelop.fragmentdemo.R;

import java.util.ArrayList;

/**
 * Created by AL ASIF on 8/6/2016.
 */
public class Team {
    private String teamNameText;
    private String teamPhoneText;
    private  String teamEmailText;
    private int teamImageId;

    public String getTeamPhoneText() {
        return teamPhoneText;
    }

    public String getTeamEmailText() {
        return teamEmailText;
    }

    public Team(String teamName, int teamImageId, String teamEmail, String teamPhone) {
        this.teamNameText = teamName;
        this.teamImageId = teamImageId;
        this.teamEmailText = teamEmail;
        this.teamPhoneText = teamPhone;

    }

    public Team() {
    }

    public String getTeamNameText() {
        return teamNameText;
    }

    public int getTeamImageId() {
        return teamImageId;
    }

    public ArrayList<Team> getAllTeam(){
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team("Mondoay", R.drawable.sun,"10","90"));

        return  teams;
    }
}

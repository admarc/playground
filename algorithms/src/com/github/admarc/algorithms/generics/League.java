package com.github.admarc.algorithms.generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private ArrayList<T> teams = new ArrayList<>();

    public void addTeam(T team) {
        this.teams.add(team);
    }

    public ArrayList getRanking() {
        Collections.sort(teams);
        return teams;
    }

}

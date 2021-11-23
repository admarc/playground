package com.github.admarc.algorithms.generics;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int compareTo(Team comparableTeam) {
        int comparePoints = comparableTeam.getPoints();
        return comparePoints - this.points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}

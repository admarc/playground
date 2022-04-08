package com.github.admarc.algorithms.generics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LeagueTest {
     @Test
     public void itShouldReturnFootballTeamsRanking() {
          Team team1 = new FootballTeam("Juventus", 100);
          Team team2 = new FootballTeam("Napoli", 90);
          Team team3 = new FootballTeam("Inter", 98);
          Team team4 = new FootballTeam("Milan", 94);
          League league = new League();
          league.addTeam(team1);
          league.addTeam(team2);
          league.addTeam(team3);
          league.addTeam(team4);

          ArrayList<Team> ranking = league.getRanking();

          Assert.assertEquals("Juventus", ranking.get(0).getName());
          Assert.assertEquals("Inter", ranking.get(1).getName());
          Assert.assertEquals("Milan", ranking.get(2).getName());
          Assert.assertEquals("Napoli", ranking.get(3).getName());
     }
}

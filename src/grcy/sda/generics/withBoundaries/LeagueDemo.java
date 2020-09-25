package grcy.sda.generics.withBoundaries;

import grcy.sda.generics.FootballTeam;
import grcy.sda.generics.Team;
import grcy.sda.generics.VolleyballTeam;

public class LeagueDemo {
    public static void main(String[] args) {
        League<FootballTeam> league = new League("Primiera Division");

        Team team1 = new FootballTeam("FC Barcelona");
        Team team2 = new FootballTeam("Real Madrid CF");
        FootballTeam team3 = new FootballTeam("Valencia CF");
        team1.setPoints(20);
        team2.setPoints(18);
        team3.setPoints(25);
        league.addTeam((FootballTeam) team1);
        league.addTeam((FootballTeam) team2);
        league.addTeam(team3);
        league.printTable();

        System.out.println("=================================");
        Team team4 = new VolleyballTeam("Asseco Resovia");
        team4.setPoints(22);

        //league.addTeam((VolleyballTeam) team4);
        //league.printTable();
    }
}

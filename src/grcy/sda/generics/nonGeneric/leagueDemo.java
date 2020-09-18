package grcy.sda.generics.nonGeneric;

import grcy.sda.generics.FootballTeam;
import grcy.sda.generics.Team;
import grcy.sda.generics.VolleyballTeam;

public class leagueDemo {
    public static void main(String[] args) {
        League league = new League("Primiera Division");

        Team team1 = new FootballTeam("FC Barcelona");
        Team team2 = new FootballTeam("Real Madrit");
        Team team3 = new FootballTeam("Valencia CF");
        team1.setPoints(20);
        team2.setPoints(18);
        team3.setPoints(25);
        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam(team3);
        league.printTable();

        System.out.println("===================");
        Team team4 = new VolleyballTeam("Asseco Resovia");


    }
}

package grcy.sda.generics.nonGeneric;

import grcy.sda.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {
    private String leagueName;
    private List<Team> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        teams = new ArrayList<>();
    }

    public void addTeam(Team team){
        if(!teams.contains(team)){
            teams.add(team);
        }
    }

    public void printTable() {
        Collections.sort(teams);
        System.out.println(leagueName + " table:");
        teams.forEach((x-> System.out.println(x.getName() +" : "+x.getPoints())));
    }
}

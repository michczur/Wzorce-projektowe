package grcy.sda.generics.withBoundaries;

import grcy.sda.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private String leagueName;
    private List<T> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        teams = new ArrayList<>();
    }

    public void addTeam(T team) {
        if(!teams.contains(team)) {
            teams.add(team);
        }
    }

    //przy generyku z ograniczeniami poniższy kod jest ok bo wiadomo
    //że wywołamy metodę na jakimś typie pochodnym po Team
    public void printTable() {
        Collections.sort(teams);
        System.out.println(leagueName + " table:");
        teams.forEach(x -> System.out.println(x.getName() + " : " + x.getPoints()));
    }
}

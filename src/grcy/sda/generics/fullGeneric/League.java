package grcy.sda.generics.fullGeneric;

import grcy.sda.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T> {
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

    //=================================================================
    //ta metoda nie pasuje do pisania generycznego bo wymaga kastowania
    public void printTable() {
        Collections.sort((List<Team>) teams);
        System.out.println(leagueName + " table:");
        teams.forEach(x -> System.out.println(((Team) x).getName() + " : " + ((Team) x).getPoints()));
    }
}

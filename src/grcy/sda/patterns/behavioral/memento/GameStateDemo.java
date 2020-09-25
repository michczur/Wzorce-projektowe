package grcy.sda.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class GameStateDemo {
    public static void main(String[] args) {

        List<GameStateMemento> saves = new ArrayList<>();
        GameState witcher = new GameState(1, "Bialy Sad");
        System.out.println(witcher);
        saves.add(witcher.saveGame());

        witcher.changeGameState(2, "Wyzima");
        System.out.println(witcher);
        witcher.changeGameState(3, "Velen");
        System.out.println(witcher);

        witcher.restore(saves.get(0));
        System.out.println("After restore:");
        System.out.println(witcher);
    }
}

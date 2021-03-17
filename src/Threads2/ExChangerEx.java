package Threads2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;

public class ExChangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendAction = new ArrayList<>();
        friendAction.add(Action.STONE);
        friendAction.add(Action.PAPER);
        friendAction.add(Action.PAPER);

        List<Action> friendAction2 = new ArrayList<>();
        friendAction2.add(Action.PAPER);
        friendAction2.add(Action.STONE);
        friendAction2.add(Action.SCISSORS);

        new BestFriend("Talka", friendAction, exchanger);
        new BestFriend("Bakyt", friendAction2, exchanger);
    }

}
enum Action{
    STONE, SCISSORS, PAPER;
}
class BestFriend extends Thread {
    private String name;
    List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins(Action myAction, Action friendsAction) {
        if((myAction == Action.STONE && friendsAction == Action.SCISSORS)
        ||(myAction == Action.SCISSORS && friendsAction == Action.PAPER)
        ||(myAction == Action.PAPER && friendsAction == Action.STONE)) {
            System.out.println(name + " wins");
        }
    }
    public void run() {
        Action reply;
        for(Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action,reply);
                sleep(2000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

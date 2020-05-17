import players.Player;

import java.util.ArrayList;

public class Team<T>{
    private ArrayList<T> roster;
    private int won;
    private int lost;

    public Team(ArrayList<T> roster) {
        this.roster = roster;
    }

    public ArrayList<T> getRoster() {
        return roster;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }
}

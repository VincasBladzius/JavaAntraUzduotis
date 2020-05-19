import players.Player;

import java.util.ArrayList;


public class Team<T extends Player>implements Comparable<Team>{

    private ArrayList<T> roster;
    private int won;
    private int lost;
    private int gamesPlayed;
    private String teamNationality;

    public  Team(ArrayList<T> roster) {
        this.roster = roster;
        setTeamNationality();
    }
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed() {
        this.gamesPlayed = this.won + this.lost;
    }
    public ArrayList<T> getRoster() {
        return roster;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won += won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost += lost;
    }

    public String getTeamNationality() {
        return teamNationality;
    }

    public void setTeamNationality() {
        this.teamNationality = this.getRoster().get(0).getNationality();
    }


    @Override
    public int compareTo(Team o) {
        this.getTeamNationality().compareTo(o.getTeamNationality());
        return 0;
    }
}

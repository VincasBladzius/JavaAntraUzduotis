import players.*;

import java.util.*;

public class Team <T>{

    private int matchScore;
    ArrayList<? extends Player> roster;

    public Team(ArrayList<? extends Player> roster) {
            this.roster = roster;
        }

    public int getMatchScore() {
        return matchScore;
    }

    public void setMatchScore() {
        this.matchScore = playMatch();
    }

    public <T extends Player> void display(T player){
            System.out.println(player.getFirstName() + " " + player.getLastName() + " " + player.getNationality());
        }


    public <T> int playMatch(){
        int score = 0;
        int matchPoints = 0;
        for(Player<T> player : roster){
            display(player);
            player.setMatchPoints();
            matchPoints = player.getMatchPoints();
            System.out.println("Scored this match : " + matchPoints);
            score += matchPoints;
            player.setTotalPoints(matchPoints);
            System.out.println("Scored so far :" + player.getTotalPoints());
        }
        System.out.println("Matchscore: " + score);
        return score;
    }

    }





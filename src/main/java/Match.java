import players.*;

import java.util.*;

public class Match{

    private int HostScore;
    private int VisitorScore;

    public Match() {
        System.out.println("Match");
        }

    public int getHostScore() {
        return HostScore;
    }

    public <T extends Player> void setHostScore(ArrayList<T> roster) {
        HostScore = setMatchScore(roster);
    }

    public int getVisitorScore() {
        return VisitorScore;
    }

    public <T extends Player> void setVisitorScore(ArrayList<T> roster) {
        VisitorScore = setMatchScore(roster);
    }

    public <T extends Player> int setMatchScore(ArrayList<T> roster) {
        int matchPoints;
        int matchScore = 0;
        for(Player<T> player : roster){
            display(player);
            player.setMatchPoints();
            matchPoints = player.getMatchPoints();
            System.out.println("Scored this match : " + matchPoints);
            matchScore += matchPoints;
            player.setTotalPoints(matchPoints);
            System.out.println("Scored so far :" + player.getTotalPoints());
        }
        System.out.println("Matchscore: " + matchScore);
        return matchScore;
    }

    public <T extends Player> void display(T player){
            System.out.println(player.getFirstName() + " " + player.getLastName() + " " + player.getNationality());
        }


    }





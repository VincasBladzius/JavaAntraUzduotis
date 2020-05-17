import players.*;

import java.util.*;

public class Match{

    private int HostScore;
    private int VisitorScore;

    public <T extends Player> Match(Team homeTeam, Team visitorTeam) {
            playMatch(homeTeam, visitorTeam);
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
//            display(player);
            player.setMatchPoints();
            matchPoints = player.getMatchPoints();
//            System.out.println("Scored this match : " + matchPoints);
            matchScore += matchPoints;
            player.setTotalPoints(matchPoints);
//            System.out.println("Scored so far :" + player.getTotalPoints());
        }
//        System.out.println("Matchscore: " + matchScore);
        return matchScore;
    }

    public <T extends Player> void display(T player){
            System.out.println(player.getFirstName() + " " + player.getLastName() + " " + player.getNationality());
        }
    public <T extends Player> void playMatch(Team<T> homeTeam, Team<T> visitorTeam){
        fullTime(homeTeam, visitorTeam);
        System.out.println(homeTeam.getRoster().get(0).getNationality() + ": " + getHostScore() + " " + visitorTeam.getRoster().get(0).getNationality() + ": " + getVisitorScore());
        System.out.println(homeTeam.getRoster().get(0).getNationality() + " Won: " + homeTeam.getWon() + " Lost: " + homeTeam.getLost());
        System.out.println(visitorTeam.getRoster().get(0).getNationality() + " Won: " + visitorTeam.getWon() + " Lost: " + visitorTeam.getLost());
    }
    public <T extends Player> void fullTime(Team<T> homeTeam, Team<T> visitorTeam){
        setHostScore(homeTeam.getRoster());
        setVisitorScore(visitorTeam.getRoster());
        if(getHostScore() > getVisitorScore()){
            homeTeam.setWon(1);
            visitorTeam.setLost(1);
        }else if (getHostScore() < getVisitorScore()){
            homeTeam.setLost(1);
            visitorTeam.setWon(1);
        }else if (getHostScore() == getVisitorScore()){
            homeTeam.setWon(1);
            visitorTeam.setLost(1);
        }
    }

}





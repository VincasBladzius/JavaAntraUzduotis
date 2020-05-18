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
        HashSet<Player> scorersSet = new HashSet<>();
        for(Player<T> player : roster){
            //display(player);
            player.setMatchPoints();
            matchPoints = player.getMatchPoints();
            //System.out.println("Scored this match : " + matchPoints);
            matchScore += matchPoints;
            player.setTotalPoints(matchPoints);
            scorersSet.add(player);
//            System.out.println("Scored so far :" + player.getTotalPoints());
        }
        ArrayList<Player> scorers = new ArrayList<>(scorersSet);
//        System.out.println("Matchscore: " + matchScore);
        Collections.sort(scorers, new SortScorers());
        Collections.reverse(scorers);
//        System.out.println(scorers.get(0).getFirstName() + " " + scorers.get(0).getLastName() + " " + scorers.get(0).getMatchPoints() + " " + scorers.get(0).getNationality());
        return matchScore;
    }

    public <T extends Player> void display(T player){
            System.out.println(player.getFirstName() + " " + player.getLastName() + " " + player.getNationality() + " " + player.getAvgPoints());
        }
    public <T extends Player> void playMatch(Team<T> homeTeam, Team<T> visitorTeam){
        fullTime(homeTeam, visitorTeam);
//        System.out.println(homeTeam.getRoster().get(0).getNationality() + ": " + getHostScore() + " " + visitorTeam.getRoster().get(0).getNationality() + ": " + getVisitorScore());
//        System.out.println(homeTeam.getRoster().get(0).getNationality() + " Won: " + homeTeam.getWon() + " Lost: " + homeTeam.getLost() + " Played:  " + homeTeam.getGamesPlayed());
//        System.out.println(visitorTeam.getRoster().get(0).getNationality() + " Won: " + visitorTeam.getWon() + " Lost: " + visitorTeam.getLost());
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
        homeTeam.setGamesPlayed();
        visitorTeam.setGamesPlayed();
    }
}





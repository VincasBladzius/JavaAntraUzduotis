import players.*;

import java.util.*;

public class Team <T extends Player>{
    private ArrayList <T> roster = new ArrayList();
    private int matchScore;

    public Team() {

    }

    public ArrayList getRoster() {
        return roster;
    }

    public int getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(int matchScore) {
        this.matchScore = matchScore;
    }

    public void draftTeam(T player) {
       roster.add(player);
    }

    public <E extends Player> void display(E player){
            System.out.println(player.getFirstName() + " " + player.getLastName() + " " + player.getNationality());
        }

    public <T extends Team> int playMatch(ArrayList<Player> roster){
        int score = 0;
        for(Player player : roster){
            this.display(player);
            player.setMatchPoints();
            score += player.getMatchPoints();
            System.out.println(score);
        }
        return score;
    }

    }





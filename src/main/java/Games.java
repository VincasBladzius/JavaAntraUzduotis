import players.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Games {

    public Games() {
        performTournament();
    }

    public void performTournament(){
        TournamentTeams teams = new TournamentTeams();
        Match match = new Match();
        for (int i = 0; i < teams.getMatches().size(); i++) {
            for (int j = 0; j < teams.getMatches().size(); j++) {
                if(i != j) {
                    match.playMatch(teams.getMatches().get(i), teams.getMatches().get(j));
                }
            }
        }
        Collections.sort(teams.getMatches());
        for (Team team : teams.getMatches()){
            System.out.println(team.getTeamNationality());
        }
        sortByScoring(match.getAllPlayers());
        sortByWins(teams, new SortTeamsByWins());
    }//performMatch

    private void sortByScoring(HashSet<Player> allPlayersSet){
        ArrayList<Player> allPlayers = new ArrayList<>(allPlayersSet);
        Collections.sort(allPlayers);
        for (Player player : allPlayers){
            System.out.println(player.getLastName() + " " + player.getNationality() + " " + player.getTotalPoints());
        }
    }//sortByScoring

    private void sortByWins(TournamentTeams teams, SortTeamsByWins sortTeamsByWins){
        Collections.sort(teams.getMatches(), new SortTeamsByWins());
        Collections.reverse(teams.getMatches());
        int i = 0;
        for (Team team : teams.getMatches()) {
            System.out.println("Nr." + (i+1) + " is " + teams.getMatches().get(i).getTeamNationality() + " with " + teams.getMatches().get(i).getWon() + " victories");
            i++;
        }
    }//sortByWins

}

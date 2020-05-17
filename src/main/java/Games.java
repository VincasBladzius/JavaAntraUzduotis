import players.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Games {

    public Games() {
        performTournament();
    }

    public void performTournament(){
        TournamentTeams teams = new TournamentTeams();
        for (int i = 0; i < teams.getMatches().size(); i++) {
            for (int j = 0; j < teams.getMatches().size(); j++) {
                if(i != j) {
                    Match match = new Match(teams.getMatches().get(i), teams.getMatches().get(j));
                }
            }
        }
        Collections.sort(teams.getMatches(), new SortTeamsByWins());
        Collections.reverse(teams.getMatches());
        for (int i = 0; i < teams.getMatches().size(); i++) {
            System.out.println("Nr." + (i+1) + " is " + teams.getMatches().get(i).getTeamNationality() + " with " + teams.getMatches().get(i).getWon() + " victories");
        }
    }


}

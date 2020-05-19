import players.*;

import java.util.*;

public class Games {

    private Map<String, String> podium = new HashMap<>();

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
        sortByAlphabet(teams.getMatches());
        sortByScoring(match.getAllPlayers());
        sortByWins(teams, new SortTeamsByWins());
        createPodium(teams);
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

    private void sortByAlphabet(ArrayList<Team> teams){
        Collections.sort(teams);
        for (Team team : teams){
            System.out.println(team.getTeamNationality());
        }
    }//sortByAlphabet

    private void createPodium(TournamentTeams teams){
        podium.put("Gold", teams.getMatches().get(0).getTeamNationality());
        podium.put("Silver", teams.getMatches().get(1).getTeamNationality());
        podium.put("Bronze", teams.getMatches().get(2).getTeamNationality());
    }

}

import players.Greece;
import players.Player;
import players.Spain;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        TournamentTeams teams = new TournamentTeams();
        Team<Greece> greeks = new Team<>(teams.getGreekSquad());
        greeks.playMatch();

    }
}

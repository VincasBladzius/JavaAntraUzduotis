import players.Greece;
import players.Player;
import players.Slovenia;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//
               Team <Greece> team = new Team();
                int i = 0;
                while(i<5) {
                    team.draftTeam(new Greece());
                    i++;
                }
                ArrayList<Player> roster = new ArrayList<Player>();
                roster = team.getRoster();
                team.playMatch(roster);





    }
}

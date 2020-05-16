import players.*;

import java.util.ArrayList;
import java.util.Set;

public class Games {
    TournamentTeams teams;


    public Games() {
        setTeams();


    }

    public TournamentTeams getTeams() {
        return teams;
    }
    public void setTeams() {
        this.teams = new TournamentTeams();
    }



}

import players.*;

import java.util.*;

public class Team <T extends Player>{
    private ArrayList <T> members = new ArrayList();

    public Team() {

    }

    public void setMembers(T player) {
        members.add(player);
    }

    public ArrayList <T> getMembers() {
        return members;
    }

//    public ArrayList CreateRoster(){
//        Player<T> player = new Player();
//        members.add(player);
//
//        return members;
//       }
    }



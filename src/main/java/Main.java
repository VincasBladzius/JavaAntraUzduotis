import players.Center;
import players.Player;
import players.PointGuard;
import players.ShootingGuard;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        pavyzdys.FootballPlayer joe = new pavyzdys.FootballPlayer("Joe");
//        pavyzdys.BaseballPlayer pat = new pavyzdys.BaseballPlayer("Pat");
//        pavyzdys.SoccerPlayer beckham = new pavyzdys.SoccerPlayer("Beckham");
//
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
//
//        System.out.println(adelaideCrows.numPlayers());
//
//        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
//        baseballTeam.addPlayer(pat);
//
//        pavyzdys.Team<pavyzdys.SoccerPlayer> brokenTeam = new pavyzdys.Team<>("This won't work");
//        brokenTeam.addPlayer(beckham );
//
//        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
//        pavyzdys.FootballPlayer banks = new pavyzdys.FootballPlayer("Gordon");
//        melbourne.addPlayer(banks);
//
//        Team<FootballPlayer> hawtorn = new Team<>("Hawtorn");
//       Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//
//       hawtorn.matchResult(fremantle, 1, 0);
//       hawtorn.matchResult(adelaideCrows, 3, 8);
//       adelaideCrows.matchResult(fremantle, 2, 1);
//       adelaideCrows.matchResult(baseballTeam, 1, 1);
//
//        System.out.println("Rankings");
//        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
//        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//        System.out.println(hawtorn.getName() + ": " + hawtorn.ranking());
//
//        System.out.println(adelaideCrows.compareTo(melbourne));
//        System.out.println(adelaideCrows.compareTo(hawtorn));
//        System.out.println(hawtorn.compareTo(adelaideCrows));
//        System.out.println(melbourne.compareTo(fremantle));
//
//            League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
//            footballLeague.add(adelaideCrows);
//            footballLeague.add(melbourne);
//            footballLeague.add(hawtorn);
//            footballLeague.add(fremantle);
//
//            footballLeague.showLeagueTable();
               Team <Center> team = new Team();
               team.setMembers(new Center());
               //Team <PointGuard> Pointteam = new Team(new PointGuard<>());
               for (Player player : team.getMembers()){
                   System.out.println(player.getPosition());
               }
//               for (Player player : Pointteam.getMembers()){
//                   System.out.println(player.getPosition());
//               }


    }
}

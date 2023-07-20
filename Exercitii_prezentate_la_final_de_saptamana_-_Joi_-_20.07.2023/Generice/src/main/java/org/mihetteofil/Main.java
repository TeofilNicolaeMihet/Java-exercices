package org.mihetteofil;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Team> teams;
        // Collections.sort(teams);
        // Create generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only yeams of the same type sould be added to any particular
        // instance of the league class - the program sould fail to compile
        // if an attempt is made to add incompatible team.

        // Creating the League //
        League<Team<BasketballPlayer>> basketballLeague = new League<>("U21");

        // Creating Players //
        BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant");
        BasketballPlayer lebron = new BasketballPlayer("Lebron James");
        BasketballPlayer richie = new BasketballPlayer("Richie Rich");
        BasketballPlayer teo = new BasketballPlayer("Teo M");
        BasketballPlayer luan = new BasketballPlayer("Luan Lyle");
        BasketballPlayer joe = new BasketballPlayer("Joe Rogan");

        // Creating Teams, Adding the Teams to the League and Adding the //
        // Created Players to Them //
        System.out.println("Players picked for each team are: ");
        Team<BasketballPlayer> lakers = new Team<>("Lakers");
        lakers.addPlayer(kobe);
        lakers.addPlayer(lebron);
        basketballLeague.add(lakers);
        System.out.println("Lakers player count: " + lakers.numPlayers());
        System.out.println("Lakers belong to " + basketballLeague.name + " League");
        System.out.println("");

        Team<BasketballPlayer> bulls = new Team<>("Chicago Bulls");
        bulls.addPlayer(richie);
        bulls.addPlayer(teo);
        basketballLeague.add(bulls);
        System.out.println("Chicago Bulls player count: " + bulls.numPlayers());
        System.out.println("Chicago Bulls belong to " + basketballLeague.name + " League");
        System.out.println("");

        Team<BasketballPlayer> raiders = new Team<>("Raiders");
        raiders.addPlayer(luan);
        raiders.addPlayer(joe);
        basketballLeague.add(raiders);
        System.out.println("Raiders player count: " + raiders.numPlayers());
        System.out.println("Raiders belong to " + basketballLeague.name + " League");
        System.out.println("");

        // Creating Matches for the Teams //
        System.out.println("Match results: ");
        lakers.matchResult(bulls,24, 15);
        lakers.matchResult(raiders, 56, 37);
        System.out.println("");

        bulls.matchResult(lakers, 31, 31);
        bulls.matchResult(raiders, 45, 68);
        System.out.println("");

        raiders.matchResult(lakers, 9, 14);
        raiders.matchResult(bulls, 27, 27);
        System.out.println("");

        System.out.println("Rankings:");
        System.out.println(lakers.getName() + ": " + lakers.ranking());
        System.out.println(bulls.getName() + ": " + bulls.ranking());
        System.out.println(raiders.getName() + ": " + raiders.ranking());

        System.out.println("");
        System.out.println("Lakers ranking compared to Chicago Bulls: " + lakers.compareTo(bulls));
        System.out.println(lakers.compareTo(raiders));
        System.out.println(bulls.compareTo(lakers));
        System.out.println(bulls.compareTo(raiders));
        System.out.println(raiders.compareTo(lakers));
        System.out.println(raiders.compareTo(bulls));
    }
}
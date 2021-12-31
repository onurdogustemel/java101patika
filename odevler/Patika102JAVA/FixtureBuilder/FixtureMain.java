package FixtureBuilder;
import java.util.*;

public class FixtureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> teams = new ArrayList<>();
		
		teams.add("Fenerbahçe");
		teams.add("Trabzonspor");
		teams.add("Beşiktaş");
		teams.add("Galatasaray");
		teams.add("Bursaspor");
		teams.add("Başakşehir");
		
		System.out.println("Teams: ");
		for(String t : teams) {
			System.out.println("- " + t);
		}
		
		if(teams.size()%2 != 0) {
			teams.add("Bay");
		}
		Collections.shuffle(teams, new Random());
		
		List<Teams> newT = new ArrayList<>();
		
		for (int i = 1; i <= teams.size(); i++) {
            for (int k = 1; k <= teams.size(); k++) {
                if (!teams.get(i-1).equals(teams.get(k-1)))
                    newT.add(new Teams(teams.get(i-1), teams.get(k-1)));
            }
        }
		
		int matches = teams.size()/2;
        int roundCount = newT.size()/matches;

        LinkedHashMap<Integer, Rounds> rounds = new LinkedHashMap<>();
        for (int i = 1; i <= roundCount; i++) {
            Rounds round = new Rounds(matches, teams);
            for (int counter = 0; counter < matches; counter++) {
                List<Teams> clonedGames = new ArrayList<>(newT);
                for (Teams game : clonedGames) {
                    if (round.addTeams(game)) {
                        newT.remove(game);
                        break;
                    }
                    else continue;
                }
            }
            rounds.put(i, round);
        }

        for (int key : rounds.keySet()) {
            System.out.println();
            System.out.println("Round " + key);
            rounds.get(key).printRound();
        }

		
	}

}

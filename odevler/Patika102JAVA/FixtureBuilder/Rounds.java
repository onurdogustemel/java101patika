package FixtureBuilder;

import java.util.ArrayList;
import java.util.List;

public class Rounds {
	private List<Teams> round = new ArrayList<>();
	public int length;
	public List<String> team = new ArrayList<>();
	
	public Rounds(int length, List<String> team) {
		this.length = length;
		this.team.addAll(team);
	}

	public List<Teams> getRound() {
		return round;
	}

	public void setRound(List<Teams> round) {
		this.round = round;
	}

	public boolean addTeams(Teams t) {
		if(!team.contains(t.getT1()) || !team.contains(t.getT2())) {
			return false;
		}
		team.remove(t.getT1());
		team.remove(t.getT1());
		round.add(t);
		return true;
	}
	
	public void printRound() {
        for (Teams t : round)
            t.printMatch();
    }
}

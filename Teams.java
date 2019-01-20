/**
 * 
 */
package com.challenge;

import java.util.ArrayList;

/**
 * @author razva
 *
 */
public class Teams<T extends Player> implements Comparable<Teams<T>> {
	
	private String teamName;
	int gamesPlayed = 0;
	int gamesWon = 0;
	int gamesLost = 0;
	int gamesTied = 0;

	private ArrayList<T> members = new ArrayList<>();

	public Teams(String teamName) {
		super();
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public boolean addPlayer(T player) {
		if (members.contains(player)) {
			System.out.println(player.getNameOfPlayer() + " is already on this team");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getNameOfPlayer() + " picked for team " + this.teamName);
			return true;
		}
	}
	
	public void matchResult(Teams<T> opponent, int ourScore, int theirScore) {

		String message;

		if (ourScore > theirScore) {
			gamesWon++;
			message = " beat ";
		} else if (ourScore == theirScore) {
			gamesTied++;
			message = " drew with ";
		} else {
			gamesLost++;
			message = " lost to ";
		}
		gamesPlayed++;
		if (opponent != null) {
			System.out.println(this.getTeamName() + message + opponent.getTeamName());
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	public int ranking() {
		return (gamesWon * 2) + gamesTied;
	}

	@Override
	public int compareTo(Teams<T> team) {
		if (this.ranking() > team.ranking()) {
			return -1;
		} else if (this.ranking() < team.ranking()) {
			return 1;
		} else {
			return 0;
		}
	}
}

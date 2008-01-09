package com.skype.diceroller.model;

import java.util.Set;

import com.skype.Chat;

public class GameSession {

	
	
	private Player 			narrator;
	
	private Set<Player> 	players;
	
	private Chat 			chatRoom;
	
	private boolean			diceRollEnabled;
	

	public Chat getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(Chat chatRoom) {
		this.chatRoom = chatRoom;
	}

	public Player getNarrator() {
		return narrator;
	}

	public void setNarrator(Player narrator) {
		this.narrator = narrator;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	public boolean isDiceRollEnabled() {
		return diceRollEnabled;
	}

	public void setDiceRollEnabled(boolean diceRollEnabled) {
		this.diceRollEnabled = diceRollEnabled;
	}

	
	
	
	public boolean addPlayer(Player player){
		return this.players.add(player);
	}
}

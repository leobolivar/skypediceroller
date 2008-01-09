package com.skype.diceroller.model;

import java.util.Set;

import com.skype.User;

public class Player {
	
	
	
	private User   				user;
	
	private Boolean				narrator;
	
	private String				character;
	
	private Set<GameSession>	narratorSessions;
	
	private Set<GameSession>	playerSessions; 	
	

}

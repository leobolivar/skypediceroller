package com.skype.diceroller.controller.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.skype.diceroller.controller.resources.DiceRollRequest;
import com.skype.diceroller.controller.resources.Resource;
import com.skype.diceroller.model.GameSession;

public class RollDiceCommand extends Command {

	public Object execute(List<Resource> resources) {
		
		for (Iterator iter = resources.iterator(); iter.hasNext();) {
			DiceRollRequest request = (DiceRollRequest) iter.next();
			rollDice(request);
		}

		return resources;
	}

	public Object execute(Object resources) {
		
		Map  			resourcesMap = (HashMap)resources;
		List  			diceRollRequests = (ArrayList) resourcesMap.get("diceRollRequests");
		GameSession		gameSession = (GameSession) resourcesMap.get("gameSession");
		
		if (gameSession.isDiceRollEnabled()) {
			for (Iterator iter = diceRollRequests.iterator(); iter.hasNext();) {
				DiceRollRequest request = (DiceRollRequest) iter.next();
				rollDice(request);
			}
		}
		
		return resources;
	}
	
	private int rollDice(DiceRollRequest request){
		
		final int ammount = request.getAmmount();
		final int dice = request.getDice();
		final int modifier = request.getModifier();
		
		int result = 0;
		int roll = 0;
		
		for (int i = 0; i < ammount; i++) {
			roll += (int)((Math.random()*100)%dice +1);
		}
		
		request.setRoll(roll);
		result = roll + modifier;
		request.setResult(result);
		
		
		return result;
	}

}

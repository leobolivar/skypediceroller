package com.skype.diceroller.controller.commands;

import java.util.HashMap;

import com.skype.ChatMessage;
import com.skype.Skype;
import com.skype.SkypeException;

public class SendMessageCommand {

	public Object execute (Object resource) throws SkypeException{
		
		final HashMap  resources = (HashMap) resource;
		final String   message = (String) resources.get("message");
		final String[]   recipientUserID = (String[]) resources.get("recipient");

		ChatMessage send = Skype.chat(recipientUserID).send(message);
		 
		
		return resource;
	}
}

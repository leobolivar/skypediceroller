import java.util.HashMap;

import com.skype.Skype;
import com.skype.SkypeClient;
import com.skype.SkypeException;
import com.skype.diceroller.controller.commands.SendMessageCommand;
import com.skype.diceroller.model.GameSession;


public class SendMessageTest {
	
    public static void main(String[] args) throws SkypeException {
        	HashMap resources = new HashMap();
        	DiceRollerTest diceRoller = new DiceRollerTest();
        	
        	resources.put("recipient", "skypedevelopertestid");
        	resources.put("message", diceRoller.rollDice());
        	
        	execute(resources);
        	
    }
    
	public static Object execute (Object resource) throws SkypeException{
		
		final HashMap  	resources = (HashMap) resource;
		final String   	message = (String) resources.get("message");
		final String 	recipient = (String) resources.get("recipient");
		
		Skype.chat(recipient).send(message);
		SkypeClient.showChatWindow(recipient);
		
		return resource;
	}

}

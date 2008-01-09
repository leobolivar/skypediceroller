import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.skype.Chat;
import com.skype.Skype;
import com.skype.SkypeClient;
import com.skype.SkypeException;
import com.skype.User;
import com.skype.connector.Connector;
import com.skype.diceroller.controller.commands.RollDiceCommand;
import com.skype.diceroller.controller.commands.SendMessageCommand;
import com.skype.diceroller.controller.resources.DiceRollRequest;
import com.skype.diceroller.model.Dice;


public class Main {
	
    public static void main(String[] args) {
        try {
            
        	HashMap resources = new HashMap();
        	DiceRollerTest diceRoller = new DiceRollerTest();
        	
        	resources.put("recipient", "skypedevelopertestid");
        	resources.put("message", diceRoller.rollDice());
        	
        	SendMessageCommand command = new SendMessageCommand();
        	//command.execute(resources);
        	
        	Chat chat = Skype.chat("skypedevelopertestid");
        	//chat.setTopic("   Dice Roller v. 1.0 -- Output Chat Window");
        	//SkypeClient.showChatWindow("skypedevelopertestid");
        	//chat.send(diceRoller.rollDice());
        	
        	ArrayList<DiceRollRequest> diceRollRequests = new ArrayList<DiceRollRequest>();
        	
        	DiceRollRequest requestD4 = new DiceRollRequest();
        		requestD4.setAmmount(3);
        		requestD4.setDice(Dice.d4);
        		requestD4.setModifier(4);
        	
        	diceRollRequests.add(requestD4);	
        		
        	RollDiceCommand rollDiceCommand = new RollDiceCommand();
        	rollDiceCommand.execute((List)diceRollRequests);
        	
        	System.out.println("Roll ["+diceRollRequests.get(0).getAmmount()+"d"+diceRollRequests.get(0).getDice()+"+"+diceRollRequests.get(0).getModifier()+"]: "+diceRollRequests.get(0).getRoll()+"+("+diceRollRequests.get(0).getModifier()+") = "+diceRollRequests.get(0).getResult());
        	//System.out.println(diceRollRequests.get(0).getResult());
        	
        } catch (SkypeException ex) {
            ex.printStackTrace();
        }
    }

}

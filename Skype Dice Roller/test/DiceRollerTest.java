import com.skype.Chat;
import com.skype.Skype;
import com.skype.diceroller.model.Dice;


public class DiceRollerTest {

	public static void main(String[] args) {
	  //for (int i = 0; i < 31; i++) {
		  int roll = (int)((Math.random()*100)%Dice.d10 +1);
		  int modifier = (int)((Math.random()*100)%Dice.d4 +1);
		  System.out.println("Rolagem [ 1d10+"+modifier+" ] : "+roll+"+("+modifier+") = "+(modifier+roll) );
	//  }
	}
	
	public String rollDice(){
		int roll = (int)((Math.random()*100)%Dice.d10 +1);
		  int modifier = (int)((Math.random()*100)%Dice.d4 +1);
		  String message = "";
		  message+="###### Dice Roller v. 1.0 ####################################\n\n";
		  message +="Rolagem [ 1d10+"+modifier+" ] : "+roll+"+("+modifier+") = "+(modifier+roll);
		  return(message);
	}
}

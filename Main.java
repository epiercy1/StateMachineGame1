import java.util.ArrayList;
import java.util.HashMap;
public class Main {
	
	private HashMap<StateType, State> states = new HashMap<StateType, State> ();
	
	public static void main(String[] args) {
		Main main = new Main();
		main.go();
	}
	public void go(){
		createStates(model);
		//Prompt the user if they want to load a previous game
		while(currentStateType != StateType.EndOfGame) {
			State currentState = states.get(currentStateType);
					
			String description = currentState.getDescription();
			System.out.println(description);
			
			ArrayList<String>options = currentState.getOptions();
			//print out the options
			//get the user's choice
			//Ask user if they want to save the game
		}
	}
	
	public void createStates(Model model) {
		
	}

}

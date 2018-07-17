import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String answer= JOptionPane.showInputDialog("What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for(int i=0;i<10;i++) {
			int task = JOptionPane.showOptionDialog(null, "What makes your pet happy?", "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Take a walk", "Food" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			choice(task);
			if(happinessLevel>=5) {
				break;
			}
			JOptionPane.showMessageDialog(null, happinessLevel);
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void choice(int task) {
		if(task == 2) {
			JOptionPane.showMessageDialog(null, "Your pet will get fat");
			happinessLevel+=2;
		}
		else if(task ==1) {
			JOptionPane.showMessageDialog(null, "Your pet can walk faster than you");
			happinessLevel+=1;
		}
		else if(task ==0) {
			JOptionPane.showMessageDialog(null, "Your pet doesnt want to cuddle with your ugly face");
			happinessLevel-=1;
		}
	}
}
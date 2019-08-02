package halloweenScene_Doesnt_Work;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.Timer;

public class Halloween implements ActionListener{


	/*
	 * -----|BREAKDOWN|-----
	 * 1)
	 * 	Create a class that holds an x and y position, and image.
	 * 
	 * 2)
	 * 	Create two classes that install a move method that is unique to itself. It will extend 
	 * 	the class created in part 1 of this breakdown.
	 * 
	 * 3)
	 * 	Create a move method that will be used on the images. It will take in a "CommandKeys" enum. Based 
	 * 	on the enum, it will the move the designated image in that direction. (Within the classes in
	 * 	part 2 of breakdown)
	 */

	private Ghost1 ghost1;
	private Ghost2 ghost2;
	private SpecialGhost spGhost;
	private Timer time;
	private int timeForMoving;
	private CommandKeys command;


	public Halloween(){

		//This will create the first ghost (on left side of the screen)
		ghost1 = new Ghost1(50,50,"ghost1.png");

		//This will create the second ghost (on right side of the screen)
		ghost2 = new Ghost2(300,50,"ghost2.png");
		
		//This 'int' is for the movement of the ghosts. They will move 50 units before allowing the user
		//to input again.
		timeForMoving = 10;
		
		command = CommandKeys.A;

		System.out.println("Welcome to My Halloween Scene!\n"+
							"To move the ghost on the left, press: A,S,W,or D\n"
							+ "To move the ghost on the right, press: J,K,I,or L\n"
							+ "Pressing F does something special... Oooh");
		Magic.updateImages();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		boolean correct = true;
		String keyPress = "";
		Scanner scan = new Scanner(System.in);

			while(correct && timeForMoving == 10){
				System.out.println("Please press a key.");
				keyPress = scan.nextLine();
				switch(keyPress.toLowerCase()){
				case "a":
					command = CommandKeys.A;
					correct = false;
					timeForMoving = 0;
					break;
				case "s":
					command = CommandKeys.S;
					correct = false;
					timeForMoving = 0;
					break;
				case "w":
					command = CommandKeys.W;
					correct = false;
					timeForMoving = 0;
					break;
				case "d":
					command = CommandKeys.D;
					correct = false;
					timeForMoving = 0;
					break;
				case "j":
					command = CommandKeys.J;
					correct = false;
					timeForMoving = 0;
					break;
				case "k":
					command = CommandKeys.K;
					correct = false;
					timeForMoving = 0;
					break;
				case "i":
					command = CommandKeys.I;
					correct = false;
					timeForMoving = 0;
					break;
				case "l":
					command = CommandKeys.L;
					correct = false;
					timeForMoving = 0;
					break;
				case "f":
					command = CommandKeys.F;
					correct = false;
					timeForMoving = 0;
					break;

				}
			}

		//These statements will move the left ghost
		if((command == CommandKeys.A || command == CommandKeys.S || command == CommandKeys.W || command == CommandKeys.D) && timeForMoving < 10){
			ghost1.move(command);
		}

		//These statements will move the left ghost
		if((command == CommandKeys.J || command == CommandKeys.K || command == CommandKeys.I || command == CommandKeys.L) && timeForMoving < 10){
			ghost1.move(command);
		}
		
		timeForMoving++;
		Magic.updateImages();
	}
}


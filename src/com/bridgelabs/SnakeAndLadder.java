/****************************************************************
 * Purpose : To simulate a snake and ladder game
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Random;

public class SnakeAndLadder {
	
	// Declaring constant variables.
	public static int PLAYER_1 = 0;
	public static int PLAYER_2 = 0;
	public static int WINNING_POSITION = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");

		Random random = new Random();
		int count = 0;
		int count1 = 0;
		
		
		// Repeating till any 1 player reaches winning position.
		while (PLAYER_1 != WINNING_POSITION && PLAYER_2 != WINNING_POSITION ) {

			int dice_num = 1 + random.nextInt(6);
			int dice_num1 = 1 + random.nextInt(6);
			
			//To get the count of die rolled
			count++;
			count1++;
			System.out.println("Dice number of player1 is: " + dice_num);
			System.out.println("Dice number of player2 is: " + dice_num1);
			
			// Generated random numbers to get the options.
			int option = random.nextInt(3);
			int option1 = random.nextInt(3);

			switch (option) {

			case 0:
				System.out.println("No play for player1");
				System.out.println("");
				break;

			case 1:
				PLAYER_1 = PLAYER_1 + dice_num;
				
				if (PLAYER_1 > WINNING_POSITION) {
					
					PLAYER_1 = PLAYER_1-dice_num;
				}
				System.out.println("Position of player1 after ladder is: " + PLAYER_1);
				System.out.println("");
				break;

			default:
				PLAYER_1 = PLAYER_1 - dice_num;

				// Player position will be set to 0, if position is less than 0.
				if (PLAYER_1 < 0) {
					PLAYER_1 = 0;
				}
				System.out.println("Position of player1 after snake  is: " + PLAYER_1);
				System.out.println("");
				break;

			}
			
			// options for player2
			switch (option1) {

			case 0:
				System.out.println("No play for player2");
				System.out.println("");
				break;

			case 1:
				PLAYER_2 = PLAYER_2 + dice_num1;
				
				if (PLAYER_2 > WINNING_POSITION) {
					
					PLAYER_2 = PLAYER_2-dice_num1;
				}
				System.out.println("Position of player2 after ladder is: " + PLAYER_2);
				System.out.println("");
				break;

			default:
				PLAYER_2 = PLAYER_2 - dice_num1;

				// Player position will be set to 0, if position is less than 0.
				if (PLAYER_2 < 0) {
					PLAYER_2 = 0;
				}
				System.out.println("Position of player2 after snake is: " + PLAYER_2);
				System.out.println("");
				break;
			}
			
		}
		
		if (PLAYER_1 == WINNING_POSITION) {
			System.out.println("Player1 is winner");
			System.out.println("Number of times die rolled by player1: " + count);
		}
		else {
			System.out.println("Player2 is winner");
			System.out.println("Number of times die rolled by player1: " + count1);		
		}
	
	}

}

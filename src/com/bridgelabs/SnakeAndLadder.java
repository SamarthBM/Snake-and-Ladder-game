/****************************************************************
 * Purpose : To simulate a snake and ladder game
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Random;

public class SnakeAndLadder {
	
	// Declaring constant variables.
	public static int PLAYER_1 = 0;
	public static int WINNING_POSITION = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");

		Random random = new Random();
		int count = 0;
		
		// Repeating till player reaches winning position.
		while (PLAYER_1 != WINNING_POSITION) {

			int dice_num = 1 + random.nextInt(6);
			
			//To get the count of die rolled
			count++;
			System.out.println("Your dice number is: " + dice_num);	
			
			// Generated random numbers to get the options.
			int option = random.nextInt(3);

			switch (option) {

			case 0:
				System.out.println("There are no play");
				System.out.println("");
				break;

			case 1:
				System.out.println("Ladder");
				PLAYER_1 = PLAYER_1 + dice_num;
				
				if (PLAYER_1 > WINNING_POSITION) {
					
					PLAYER_1 = PLAYER_1-dice_num;
				}
				System.out.println("Your position is: " + PLAYER_1);
				System.out.println("");
				break;

			default:
				System.out.println("Snake");
				PLAYER_1 = PLAYER_1 - dice_num;

				// Player position will be set to 0, if position is less than 0.
				if (PLAYER_1 < 0) {
					PLAYER_1 = 0;
				}
				System.out.println("Your position is: " + PLAYER_1);
				System.out.println("");
				break;

			}
		}
		System.out.println("Number of times die rolled: " + count);

	}

}

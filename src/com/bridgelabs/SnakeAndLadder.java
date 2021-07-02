/****************************************************************
 * Purpose : To simulate a snake and ladder game
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Random;

public class SnakeAndLadder {
	// Initializing first player position to 0
		public static int PLAYER_1 = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");

		Random random = new Random();

		int dice_num = 1 + random.nextInt(6);
		System.out.println("Your dice number is: " + dice_num);
		
		// Generated random numbers to get the options.
		int option = random.nextInt(3);

		switch (option) {

		case 0:
			System.out.println("There are no play");
			break;

		case 1:
			System.out.println("Ladder");
			PLAYER_1 = PLAYER_1 + dice_num;
			System.out.println("Your position is: " + PLAYER_1);
			break;

		default:
			System.out.println("Snake");
			PLAYER_1 = PLAYER_1 - dice_num;
			
			// Player position will be set to 0, if position is less than 0.
			if (PLAYER_1 < 0) {
				PLAYER_1 = 0;
			}
			System.out.println("Your position is: " + PLAYER_1);
			break;

		}

	}

}

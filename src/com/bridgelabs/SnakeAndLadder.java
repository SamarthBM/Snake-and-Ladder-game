/****************************************************************
 * Purpose : To simulate a snake and ladder game
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game");

		// Initializing first player position to 0
		int player1 = 0;

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
			player1 = player1 + dice_num;
			System.out.println("Your position is: " + player1);
			break;

		default:
			System.out.println("Snake");
			player1 = player1 - dice_num;
			
			// Player position will be set to 0, if position is less than 0.
			if (player1 < 0) {
				player1 = 0;
			}
			System.out.println("Your position is: " + player1);
			break;

		}

	}

}

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
		
		int dice_num = 1+random.nextInt(6);
		System.out.println("Your dice number is: " + dice_num);

	}

}

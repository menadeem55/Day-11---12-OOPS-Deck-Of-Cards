package com.DeckOfCard.java;

import java.util.Random;

public class DeckOfCard {

	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace " };
	String[][] cards = new String[4][13];
	String[][] player = new String[4][9];

	public void getCardCombination() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[i][j] = ranks[j] + suits[i];

			}
		}
	}

	public void getPlayer() {

		// this method is shuffle the cards distribute among 4 player with 9 cards each
		// randomly

		int i;
		int j;
		for (i = 0; i < 4; i++) {
			System.out.println("\n Cards for Player " + (i + 1) + "\n");
			for (j = 0; j < 9; j++) {
				Random random = new Random();
				int randomSuit = random.nextInt(4);
				int randomRank = random.nextInt(13);
				player[i][j] = cards[randomSuit][randomRank];
				System.out.println(player[i][j] + "  \n");

			}
		}

	}

}

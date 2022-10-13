package com.DeckOfCard.java;

import java.util.Scanner;

public class DeckOfCardMain {
	public static void main(String[] args) {

		// calling Deck of card to main methods

		System.out.println("\nPress 1 for view 4 Players cards");
		DeckOfCard play = new DeckOfCard();
		Scanner sc = new Scanner(System.in);
		int press = sc.nextInt();

		switch (press) {
		case 1:
			play.getCardCombination();
			play.getPlayer();
			break;
		}
		sc.close();
	}
}

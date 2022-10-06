package com.StockAccount.java;

import java.util.*;
public class Portfolio extends StockAccount {
	
		
		public static void main(String[] args) {
			
			System.out.println("Enter the total number of Stocks");
			Scanner sc = new Scanner(System.in);
			
			setNoOfStocks(sc.nextInt());
			for (int i = 1; i <= getNoOfStocks(); i++) {
				StockAccount st = new StockAccount();
				st.addShare();
				TotalValue += StockPrice;
			}
			System.out.println("\nTotal Value is " + TotalValue);
		}
	}
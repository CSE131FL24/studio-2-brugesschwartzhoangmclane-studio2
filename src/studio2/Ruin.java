package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("enter starting amount of money: ");
		int startAmount = in.nextInt();

		System.out.println("enter the probability that you win a single play: ");
		double winChance = in.nextDouble();

		System.out.println("enter your win limit: ");
		int winLimit = in.nextInt();

		System.out.println("How many simulations?");
		int totalSimulations = in.nextInt();

		int plays = 0;
		int currentAmount = startAmount;
		int loses = 0;

		for (int currentSimulations = 1; currentSimulations <= totalSimulations; currentSimulations++) {
			while (currentAmount < winLimit && currentAmount > 0) {
				if (Math.random() < winChance) {
					currentAmount++;
					plays++;

				} else {
					currentAmount--;
					plays++;
				}

			}
			if (currentAmount == 0) {
				System.out.println("Simulation " + currentSimulations +": " + plays + " RUIN");
				loses++;

			} else {
				System.out.println("Simulation " + currentSimulations +": " + plays + " SUCCESS");

			}

			plays = 0;
			currentAmount = startAmount;

		}
		
		System.out.println("Simulations: " + totalSimulations);
		System.out.println("Losses: " + loses);
		System.out.print("Ruin rate = " + ((double) loses/totalSimulations));
	
		
		
		

	}

}

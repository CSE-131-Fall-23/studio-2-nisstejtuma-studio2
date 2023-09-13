package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	
		System.out.println("How much money are you starting with?");
		int startAmount = in.nextInt();
		
		System.out.println("Choose your percent chance of winning!");
		int winChance = in.nextInt();
		
		System.out.println("Choose your win limit!");
		int winLimit = in.nextInt();
		
		
		int randomNumber = (int) (Math.random()*101);
		System.out.println(randomNumber);
		
		int currentBalance = startAmount;
		
		while (int totalSimulation = 1;)
		
		if (currentBalance < winLimit)
		{
		
			if (randomNumber <= winChance)
			{
				System.out.println("Success! You Won!");
				currentBalance = startAmount + 1;
				System.out.println("Your current balance is $" + currentBalance + "!");
			}
			
			else if (randomNumber > winChance)
			{
				System.out.println("Ruin! You lost :(");
				currentBalance = startAmount - 1;
				System.out.println("Your current balance is $" + currentBalance + "!");
			}
		}
	
		else if (currentBalance >= winLimit)
		{
			System.out.print("Game over. You have reached your win limit!");
		}
	}

}

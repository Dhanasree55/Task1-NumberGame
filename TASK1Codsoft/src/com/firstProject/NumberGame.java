package com.firstProject;
import java.util.*;
public class NumberGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chances=10;
		int finalscore=0;
		boolean playagain=true;
		System.out.println("Welcome to Number Game");
		System.out.println("You have " + chances + " chances to win the game");
		while(playagain) {
			int rand=getrandN(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++) {
				System.out.println("chance " + (i+1) + ":  Enter your guess");
				int user=sc.nextInt();
				if(user==rand) {
					guess=true;
					finalscore+=1;
					System.out.println("You won it");
					break;
				}
				else if(user>rand) {
					System.out.println("Too High");
				}
				else {
					System.out.println("Too low");
				}
			}
			if(guess==false) {
				System.out.println("Sorry you lost the chances.The number is"+rand);
			}
			System.out.println("Do you want to play again (y/n)");
			String S=sc.next();
			playagain=S.equalsIgnoreCase("y");
		}
		System.out.println("That's it,hope you have enjoyed it ");
		System.out.println("Here is your final score " + finalscore );
	}
		public static int getrandN(int i, int j) {
		return (int)(Math.random()*(j-i+1)+i);
		}
}



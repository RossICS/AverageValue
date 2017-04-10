/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package averagevalue;

import java.util.Scanner;
 
 /**
 * Displays the average of a set of numbers
 */
 public class AverageValue {

	public static void main(String[] args) {
		final int SENTINEL = -1;
		int newValue;
		int numValues = 0;
		int sumOfValues = 0;
		double avg;
		Scanner input = new Scanner(System.in);
		
		/* Get a set of numbers from user */
		System.out.println("Calculate Average Program");
//		System.out.print("Enter a value (" + SENTINEL + " to quit): ");
//		newValue = input.nextInt();
//		//int num = -1;
//		while (newValue != SENTINEL) {
//			numValues += 1;
//			sumOfValues += newValue;
//			System.out.print("Enter a value (" + SENTINEL + " to quit): ");
//			newValue = input.nextInt();
//		}
                for (int i=1;i<=4;i++){
                    System.out.print("Enter a value:  ");
                    newValue = input.nextInt();
                    numValues += 1;
                    sumOfValues += newValue;
                }
		input.close();
		
		/*Calculate average of numbers entered by user */
		avg = (double)sumOfValues / (double)numValues;
		System.out.println("Average is " + avg);
	}

}

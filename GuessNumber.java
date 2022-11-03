package project;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
       GuessNumber();
    }


    public static void GuessNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number oof trial you want to play:");
        int k = in.nextInt();

        int  i;
        int randomNo = 1 + (int) (100 * Math.random());
        System.out.println("Enter the a number between 1 to 100 and Guess the number between "+ k+" trials");
        for( i =0; i<k ; i++) {

            System.out.println("Guess the number");
            int  number = in.nextInt();

            if (randomNo == number) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (randomNo > number && i != k - 1) {
                System.out.println("The number is greater than " + number);

            } else if (randomNo < number && i != k - 1) {
                System.out.println("The number is less than " + number);
            }
        }
        if (i == k) {
            System.out.println("You have exhausted "+ k+" trials.");

            System.out.println("The number was " + randomNo);
        }

    }
}

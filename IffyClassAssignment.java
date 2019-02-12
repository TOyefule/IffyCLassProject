package com.company;

import java.util.Scanner;

public class Main {
    public static String continuePlay = "true";
    public static void main(String[] args) {

        while(continuePlay.equalsIgnoreCase("true")){

                System.out.println("Are your eyes red?");
                Scanner keyboard = new Scanner(System.in);
                String response = keyboard.nextLine();
                if (response.equalsIgnoreCase("Y")|| response.equalsIgnoreCase("YES")) {
                    Boolean redEyes = true;
                    System.out.println("Get some Sleep!");
                } else{
                    Boolean redEyes = false;
                    System.out.println("You look great!");
                }
                //   playAgain();
            continuePlay = playAgain();
            }
    }

    public static String playAgain(){
        System.out.println("Do you want to try again? (True|False)");
        Scanner play = new Scanner(System.in);
        String userInput = play.nextLine();
        return userInput;
         // System.exit(0);
    }



}

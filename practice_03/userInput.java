package practice_3;

import java.util.Scanner;

public class userInput {
    public static void   main(String[] args){
        //For Integer input
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Some number");
        int user_input = scan.nextInt();
        System.out.println("The entered Value is: ");
        System.out.println(user_input);

        //for character Input
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Some Character");
        String user_input1 = scan1.next();
        System.out.println(user_input1);





    }

}

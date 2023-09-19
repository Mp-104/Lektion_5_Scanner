package com.maksim.scanner;


import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("app is running");

        // Scanner scanner = new Scanner(System.in);

        //input sequence//
        //System.out.println("Please insert a random sentence: ");
        //scanner.nextLine();

        //System.out.println("this is unrelated ");
        //scanner.nextLine();

        // scanner0(); kallar på metoden

        /*while (true) {
            scanner0();
            //return; eller break;   break bryter nuvarande loop om nestlad, return bryter hela loop komplexet
            break;
        }*/

        boolean isPlaying = true;


        do {

            //String result = scanner0();
            //System.out.println(result);

            /*if(result.equals("hi")){
                System.out.println("it's true");
            }*/

            int result = scannerNumber();

            //if (result==0) {
            //    System.out.println("The number is zero");
            //}

            if (result > 1000) {
                isPlaying = false;
                break;
            }


            for (int i = 0; i < result; i++) {
                System.out.println(i);
                System.out.println("looping...");
            }



        } while (isPlaying);

        //System.exit(0);  //funkar inte med en oändlig while loop
    }

    public static int scannerNumber (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert a number");

        return sc.nextInt();

    }

    // static ska inte finnas med om det är i annan klass än main
    public static String scannerText(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert some sentence:");
        String input = scanner.nextLine();

        return input;
    }


}

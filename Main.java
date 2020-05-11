package JavaProject;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AsciiChars.printNum();
        AsciiChars.printLC();
        AsciiChars.printUC();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name :  ");
        String name = scan.next();
        System.out.println("Hello " + name
                + " do you wish to continue to the interactive portion? \nEnter 'y' or 'n', continue :  ");
        String answer = scan.next();

        switch (answer) {
            
            case "y":
                break;

            case "n":
                System.out.println("Okay, Goodbye!");
                System.exit(0);
            default:
                System.out.println("Please Enter a valid response. Goodbye!");
                System.exit(0);
        }

        String playAgain;
        do {
            System.out.println("What is your favorite pet's name? :  ");
            String pet = scan.next();
            System.out.println("what is that pet's age? :  ");
            int petAge = scan.nextInt();
            System.out.println("What is your lucky number? :  ");
            int luckyNum = scan.nextInt();
            System.out.println("Your favorite quarterback? :  ");
            String qb = scan.next();

            int qbNum;
            switch (qb) {
                case "y":
                    System.out.println("What is their jersey number? :  ");
                    qbNum = scan.nextInt();
                    break;
                case "n":
                    break;
                default:
                    break;
            }
            System.out.println("What is the two-digit model year of your car? :  ");
            int modelYear = scan.nextInt();
            System.out.println("What is the first name of the your favorite actor or actress? :  ");
            String actName = scan.next();
            System.out.println("Enter a random number between 1 and 50 :  ");
            int userNum = scan.nextInt();

            Random rand = new Random();
            int upperbound = 76;
            int int1 = rand.nextInt(upperbound);
            int int2 = rand.nextInt(upperbound);
            int int3 = rand.nextInt(upperbound);

            int magicBall = (int1 * luckyNum);
            while (magicBall > 75) {
                magicBall = magicBall - 75;
            }
            System.out.println(magicBall);

            int petNum = pet.charAt(2);
            while (petNum > 65) {
                petNum = petNum - 65;
            }
            int value = 42;
            int random = userNum - int3;
            if (random < 1) {
                random = random + 64;
            }
            int luckCar = luckyNum + modelYear;
            int lastNum = petAge + modelYear;
            System.out.println("These are your PowerBall Numbers: " + magicBall + ", " + petNum + ", " + value + ", " + random + ", "
                    + luckCar + " " + lastNum);
            System.out.println("Play again? :  ");

            playAgain = scan.next();

        } while (playAgain.equals("y"));
        System.out.print("Thanks for Playing!");
        System.exit(0);

    }

}
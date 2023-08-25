import java.util.Scanner;

public class Number_guessing_game {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
       int random= (int)(100*Math.random());
        System.out.println(" \n  Before going to game go through instruction \n " +
                 "    1  you have to guess number between 10 to 100 \n"+
                "     2  you have a five chance to guess the  number \n " +
                "     3  In every enter if your choice is wrong  then  program will give clue \n  " +
                "        like you enter number is less than real number or greater than real number " +
                "     \n        ");
        System.out.println(" press enter to start the game ");
        String enter=input.nextLine();
        checking_number(random);
    }
    static int  asking_input(int guesscount){
        System.out.println("you have "+guesscount+" chance to guess the number");
        System.out.println(" Enter the guess  number  : ");
        return input.nextInt();
    }
    static void checking_number(int random){
        for (int guesscount =5; guesscount >=0; guesscount--) {
            if (guesscount==0){
                System.out.println("  :) sorry you have lost game better luck next time  ");
                System.out.println("  actual number  is :  "+random);
                break;
            }
            int number=asking_input(guesscount);

            if (number==random){
                System.out.println(" ! congrats you entered correct number ");
                break;
            }
            if (guesscount!=1) {
                if (number > random) {
                    System.out.println( " higher then real number ");
                } else System.out.println("  lower then real number ");
            }
        }

    }

}

package rank;

import java.util.Scanner;

public class Bit {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input:");
        String input = sc.nextLine();
        //int newN = Integer.parseInt(input);
        switch (input){
            case "jan":
                System.out.println("Month January is one ");
            break;
            case "Feb":
                System.out.println("Month Feb");
                break;
                default:
                    System.out.println("Another month");
        }

        int num  = 10;
      if(num >= 5 && num <= 7){
          System.out.println("Num is here");
      } else if(num >= 9 && num <=11){
          System.out.println("it is here");
      } else{
          System.out.println("Nothing found");
      }
    }
    //switch statement code for practice
}

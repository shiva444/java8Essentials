package challenge;

import challenge.utlities.MathHelper;

import java.util.Scanner;

public class Main {
    public static void main (String args []) {
       Main calc = new Main();
        calc.Calculate();
    }

    protected  void Calculate() {
        Input in = new Input();
        String s1 =in.getInput("Enter a numberic val");
        String s2 = in.getInput("Num val");
        String op = in.getInput("Choose opeartor(+ , - , *, /):");
        double result = 0;
        try {
            switch (op){
                case "+":
                    result = MathHelper.addVal(s1, s2);
                    System.out.println(result);
                    break;
                case "-":
                    result = MathHelper.subVal(s1, s2);
                    System.out.println(result);
                    break;
                case "*":
                    result = MathHelper.mulVal(s1, s2);
                    System.out.println(result);
                    break;
                case "/":
                    result = MathHelper.divVal(s1, s2);
                    System.out.println(result);
                    break;
                    default:
                        System.out.println("unkown");
                        return;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    // Adding value

    class Input{
        private  String getInput(String input){
            System.out.println(input);
            Scanner sc= new Scanner(System.in);
            return sc.nextLine();
        }
    }

}

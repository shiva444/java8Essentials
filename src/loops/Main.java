package loops;

import java.util.Scanner;

public class Main {
   public static void main(String args[]){
       String s1 = getInput("Enter 1 value:");
       String s2 = getInput("Enter 2 value:");
       String s3 = getInput("Value 3");
       double result = addVal(s1, s2);
       System.out.println(result);
       double result1 = addVal(s1, s2, s3);
       System.out.println(result1);
       double result2 = addVal(s1, s2, s3, s1, s2);
       System.out.println(result2);
   }

   static String getInput(String input){
       System.out.println(input);
       Scanner sc = new Scanner(System.in);
       return sc.nextLine();
   }

   static double addVal(String s1, String s2){
       double d1 = Double.parseDouble(s1);
       double d2 = Double.parseDouble(s2);
       double res = d1 + d2;
       return res ;
   }

    static double addVal(String s1, String s2, String s3){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double res = d1 + d2 + d3;
        return res ;
    }

    static double addVal(String ... values){
       double result = 0;
        for (String value: values) {
            double d = Double.parseDouble(value);
            result += d;
        }
        return result;
    }

}

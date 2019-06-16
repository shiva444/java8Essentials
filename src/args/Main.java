package args;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from myFavLang: ");
        // Java always use array based 0 Indexing
        /* Scanner is used to scan objects, System.in is used to provide user
        input value */
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        // String literals are instance of class.
        String uName = myName.next();
        System.out.println("My name is  :" + uName + " I am a super passoniateDeveloper");
        int myInt = 5;
        System.out.println("The  value of myInt is " + myInt);
    }
}

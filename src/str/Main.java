package str;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String args []){
        String s1 = "God Please help me in improving ";
        String s2 = "Myskills, Please save me ";
        System.out.println("FinalResult:" +  " " +  s1 + s2);
        String s3 = "myShirtsize";
        String s4 = "M";
        String s5 = s3 + s4 + ", QTY" + 4;
        System.out.println("All:" +  s5);
        System.out.println("uppercase:" + s3.toUpperCase());

        char[] chars = {'O', 'M', 'S', 'h', 'i'};
        String s6 = new String(chars);
        System.out.println(s6);
        char[] chars1 = s6.toCharArray();
       for (char c: chars1){
           System.out.println(c);
       }

       int intVal = 42;
       String cVal = Integer.toString(intVal);
       System.out.println(cVal);

       boolean bVal = true;
       String bB = Boolean.toString(bVal);
       System.out.println(bB);

       long lVal = 1881999190;
        NumberFormat format = NumberFormat.getNumberInstance();
        String fomatted = format.format(lVal);
        System.out.println(fomatted);

        //ranther than concatinating use string builder to avoid memory
        StringBuilder sb = new StringBuilder("I am developer")
                .append(",")
                .append(s2);
        System.out.println("withBuilder:" + sb);
        System.out.println("Length:" + sb.length());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:" + scanner);
        String input = scanner.nextLine();
        // to delete a stringbuilder
        sb.delete(0, sb.length());
        for (int i = 0; i < 4 ; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }
}

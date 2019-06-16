package arr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[][] states = new String[3][2];
        states[0][0] = "Denver";
        states[0][1] = "CO";
        states[1][0] = "India";
        states[1][1] = "Delhi";
        states[2][0] = "Hyd";
        states[2][1] = "Tel";
        for (int i = 0; i < states.length ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Captial is " )
                    .append(states[i][0])
                    .append(":")
                    .append(states[i][1])
                    .append(".");
            System.out.println(sb);
        }
        System.out.println("Array of primitives:");
        //integer array
        int[] ints = {2, 1, 3, 4};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length ; i++) {
            System.out.println("IntegerArray:" + ints[i]);
        }
        //Arrays with string
        String[] str = {"Karthik", "weds", "Sha"};
        Arrays.sort(str);
        for (String val:str ) {
            System.out.println("Lets See:" + val.toUpperCase());
        }
        //Arrays init size

        int[] size = new int[12];
        for (int i = 0; i < size.length ; i++) {
            size[i] = i * 50;
        }
        for (int val: size) {
            System.out.println(val);
        }
        //copying array
        int[] copy = new int[3];
        System.arraycopy(size, 3, copy, 0, 3);
        for (int val: copy) {
            System.out.println("Copied array:" + val);
        }
        // 2D array

    }
}

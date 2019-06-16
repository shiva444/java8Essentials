package test;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){
        int sum = 0;
        int[] studentArray = {0, 1, 2, 1, 0, 0, 3, 1, 5};
        int students = studentArray.length;
        System.out.println(Arrays.toString(studentArray ));
        System.out.println("Lenght of array:" + students + "Index" + studentArray[3] );
        // to each access each element in an array
//        for (int val: studentArray) {
//            System.out.println("Each loop Value:" + val);
//            //to find sum of array elements
//            sum = (sum + val);
//        }
        System.out.println("sum of value:" + sum);
        int average = sum / students;
        System.out.println("Average value:" + average);

        // multi-dimensional array
        String[][] ch = {
                {"Salad", "Soup", "Cheese" },
                {"Chicken", "Veg", "Salmon"}
        };
        int appIndex = 0;
        int mainIndex = 1;
        String sP = ch[appIndex][0];
        System.out.println("testing:" + sP);
        String sP1 = ch[mainIndex][2];
        System.out.println("Testing 2:" + sP1);
        System.out.println("appIndex: " + sP +  " MainIndex: " + sP1);
        ch[mainIndex][0] = "Pappu";
        System.out.println(ch[mainIndex][0]);
//        for (String[] val: ch) {
//            System.out.println("Each loop testing:" + val[2]);
//        }

        for (int i = 0; i < ch.length ; i++) {
            for (int j = 0; j < ch.length; j++) {
                System.out.println("Dono Result:" + ch[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(ch));

        //jagged array, colum is not fixed
        int [][] jagged = new int[4][];
        // to create a new jagged array
        jagged[0] = new int[1];
        jagged[1] = new int[21];
        jagged[2] = new int[3];
        /* assigning a value to jagged array */
        jagged[1] = new int[] { 1, 2, 3 };
        jagged[2] = new int[] {14, 2};
        jagged[3] = new int[] {14, 21};
        jagged[1] = new int[] { 1, 2, 3, 5, 8};
        jagged[0][0] = 9;

        System.out.println("jagged:" +  Arrays.deepToString(jagged) + jagged[2][0]);

        StringBuffer sb  = new StringBuffer("Shiva Prasad");
        sb.reverse();
        System.out.println("Reverse:" + sb);



    }
}

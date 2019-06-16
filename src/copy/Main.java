package copy;

public class Main {
    public static void main(String args[]){
        //This is a primitive ,it only make a copy .
        int val1 = 56;
        int Val2 = 42;
        int val2 = val1;
        System.out.println("new value: ->" + val2);
        short s = (short) val1;
        System.out.println("This shot value is :" + s);
        long lval3 = val1;
        System.out.println("long :" + lval3);
        int val4 =  1236;
        byte bVal3 = (byte) val1;
        System.out.println("Byte Val:" + bVal3);
        double dVal = 3.991213d;
        int dval4 = (int) dVal;
        System.out.println("dVal:" + dval4);
        int res1 = val1 + Val2;
        System.out.println("addition:" + res1);
        int res2 = val1 - Val2;
        System.out.println("Sub:" + res2);
        double res3 =  val1 / Val2;
        System.out.println("divi:" + res3);
        int res4 = val1 * Val2;
        System.out.println("into:" + res4);
        double res5 = (double)val1 % Val2;
        System.out.println("into:" + res5);

        double doubleVal = -3.12356;
        long rounded = Math.round(doubleVal);
        System.out.println("doble:" + rounded);
        double absVal = Math.abs(doubleVal);
        System.out.println("absVal:" + absVal);
    }

}

package args;

public class maxValue {
    public static void main(String[] args){
        byte b = 127;
        System.out.println("Byte value is :" + b);
       if(b < Byte.MAX_VALUE) {
           b++;
       }
        System.out.println("Increase byte:" + b);
       short sh = 2;
        System.out.println("Shortvalue is :" + sh);
        sh++;
        System.out.println("increased value:" + sh);
    }
}

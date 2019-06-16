package charcter;

public class Main {
    public static void main(String[] args){
        char c1 = '2';
        char c2 = 3;
        char c3 = 4;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        char dollarSign = '\u0024';
        System.out.println(dollarSign);
        // to manipulate char using helper class
        char c4 = 'a';
        char c5 = 'b';
        char c6 = 'c';
        System.out.print(Character.toUpperCase(c4));
        System.out.print(Character.toUpperCase(c5));
        System.out.println(Character.toUpperCase(c6));
    }
}

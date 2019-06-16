package equal;

public class Main {
    public static void main(String args []) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 + " " + s2);
        if(s1 == s2){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(s1.length() + s2.length());
        String s3 = "hello";
        if(s1 == s3){
            System.out.println("String: They Match");
        } else {
            System.out.println("Not a macth");
        }
        String p1 = "Hello";
        String p2 = "World";
        String p4 = p1 + p2;
        String p5 = "Hello World";
        System.out.println(p4 + "Length of p4: " + p4.length());
        if(p4.equalsIgnoreCase(p5)){
            System.out.println("They match");
        } else {
            System.out.println("They dont");
        }
    }
}

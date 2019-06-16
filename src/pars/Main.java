package pars;

public class Main {
    public static void main(String args []){
        String s1 = "Thank you God!";
        System.out.println("Len:" + s1.length());
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb.reverse());
        // to find position of substring
        int pos = s1.indexOf("God");
        System.out.println("Position of god: " + pos);

        String sub = s1.substring(10);
        System.out.println(sub);

        String s2 = " heyhey          ";
        int len = s2.length();
        System.out.println(len);
        String s3 = s2.trim();
        System.out.println(s3.length());


    }
}

package challenge.utlities;


public class MathHelper {
    public static double addVal(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double res = d1 + d2;
        return res ;
    }
    public static double subVal(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double res = d1 - d2;
        return res ;
    }
    public static double mulVal(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double res = d1 * d2;
        return res ;
    }
    public static double divVal(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double res = d1 / d2;
        return res ;
    }

}

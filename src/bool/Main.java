package bool;

public class Main {
    static boolean bDef;
    public static void main(String args[]) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(bDef);
        boolean b3 = !b1;
        System.out.println(b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("hhah:" + b4);
        // boolean convert to string

        String sBool = "true";
        // String parsed to booolean with boolean helper class
        boolean parsed = Boolean.parseBoolean(sBool);
        System.out.println("pVal:" + parsed);
    }
}

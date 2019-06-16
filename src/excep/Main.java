package excep;

public class Main {
    public static void main(String [] args){
        String s = "Welcome";
        char[] chars = s.toCharArray();
        try {
            if(chars.length < 10){
                throw (new Exception("my customr message"));
            }
            char lC = chars[chars.length - 1];
            System.out.println(lC);
            String sub = s.substring(10);
            System.out.println("sub:" + sub);
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array index problem");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Custom error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

    }
}

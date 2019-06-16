//package file;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//public class Main {
//    public static void main(String args []) {
//        String sFile = "";
//        System.out.println(sFile);
//        String tFile = ("file.target.txt");
//        try (
//                FileReader fR = new FileReader(sFile);
//                BufferedReader bR = new BufferedReader(fR);
//                FileWriter writer = new FileWriter(tFile)
//                ){
//
//            while(true){
//                String line  =  bR.readLine();
//                if(line == null ){
//                    break;
//                } else {
//                    writer.write(line + "\n");
//                }
//            }
//            System.out.println("FileCopied!");
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//}

package ishilmiozcelik;
//static, final

import java.io.*;

public class _11_File {

    public static final String URL = "D:\\TechCareer_FullStack\\File_Try\\File.txt";

    public static void getUserWriter(){
    try (BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(URL,true))){
        bufferedWriter.write("First Row");
        bufferedWriter.flush();
    }catch (ArithmeticException | IOException e){
        System.out.println(e.getMessage());

    }
    }

    public static void getUserReader(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(URL,true))){

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (Exception e){
            e.printStackTrace();

        }
    }


/*
     try{
     int number1= 5/0;
     System.out.println(number1);
     }catch (ArithmeticException e){
     System.out.println(e.getMessage());
     }finally{
         System.out.println("db.close");
     }

     System.out.println("last row");
     //throw new ArithmeticException("An error occurred");
    }
    */


        public static void main (String[]args) throws IOException {
            getUserWriter();
        }
    }

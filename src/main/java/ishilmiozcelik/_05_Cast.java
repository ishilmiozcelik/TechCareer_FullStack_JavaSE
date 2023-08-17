package ishilmiozcelik;

public class _05_Cast {

    public static void main(String[] args) {
        //String - word
            System.out.println(16+14);
            System.out.println("16"+14);

            String str1="16";
            String str2="13";

            int number1=14;
            int cast1=Integer.valueOf(str2);
            int cast11=Integer.parseInt(str2);
            System.out.println(str1);
            System.out.println(cast1+number1);
            System.out.println(cast11+number1);

            int number2=60;
            String str3=String.valueOf(number2);
            String str4=Integer.toString(number2);


    }
}

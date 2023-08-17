package ishilmiozcelik;

public class _07_String {

    public static void main(String[] args) {

        String word="Java, I am learning Java ";
        System.out.println(word.length());
        System.out.println(word.trim().length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.startsWith("J"));
        System.out.println(word.endsWith(" "));

        System.out.println(word.concat("44"));
        System.out.println(word.replace(word, "NEW WORD"));

        System.out.println(word.charAt(1));
        System.out.println(word.indexOf("Java"));
        System.out.println(word.lastIndexOf("Java"));
        System.out.println(word.substring(2));
        System.out.println(word.substring(2,7));
        System.out.println(word.isEmpty());
        System.out.println(word.hashCode());
        System.out.println(word.contains("Java"));
        System.out.println(word.contains("Teaching"));



    }
}

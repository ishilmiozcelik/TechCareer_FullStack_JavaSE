package ishilmiozcelik;

public enum _09_Enum {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
class TryEnum{
    public static void main(String[] args) {
        String data = _09_Enum.FRIDAY.toString();
        System.out.println(data);
        System.out.println(_09_Enum.FRIDAY.name());
        System.out.println(_09_Enum.FRIDAY.ordinal());
    }
}








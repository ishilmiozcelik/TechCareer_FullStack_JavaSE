package ishilmiozcelik;

    //Inner Class
    //If a class is used in another class - inner class
    //Bir class'ın içinde başka bir class'ın kullanılması//
    //in Java, we can use "public class" for one time, we can not write any other public class besides this
    //However, inner class is an exception

    //we have "static" type for classes, but actually we can not write the classes static (EXCEPT INNER CLASSES)
    //SOLID: Sometimes we might want to put everything in one class, unfortunately this structure is against to the SOLID principle

    //IF THE VARIABLE HAS GETTER AND SETTER, WE CALL IT INNER POJO
    //IN THIS CASE: WE USE "private String countryName". countryName is our variable, and it has getter and setter.
    //So it is INNER POJO

    import javax.swing.plaf.PanelUI;

    public class Country {
    // Field

    //private is accessible only for the elements in the same class
    //from different classes, it can be accessible but with getters and setter
    //encapsulation: I only need to know what I need to know, I don't have to know the rest in detail


    private String countryName;
    //private String countryCode;
    //In order to use this class outside of this one, we need to create getter/setter


    public String getCountryName() {
        return countryName;
        //what getter does: bringing
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
        //what setter does: setting, changing
    }

    //public String getCountryCode() {
    //return countryCode;
    //}

    //public void setCountryCode(String countryCode) {
    //this.countryCode = countryCode;
    //}

    //CONSTRUCTORS
    //CONSTRUCTORS should be given public and with class name.
    //CONSTRUCTORS are not returning any value.
    //WE HAVE 2 CONSTRUCTOR TYPE: WITH PARAMETER, WITHOUT PARAMETER


     // public Country(){}

    //public Country(String countryName) {
    //this.countryName = countryName;
    //}
    //NOTE: As shown there are 2 constructors, same name (Country), but parameters are different.
    //(It can be number of parameters, of name of the parameter)
    // THIS IS OVERLOADING
    // Aynı metodun sadece parametre veya türünün değişik olmasına OVERLOADING


     //CLASSES
     //PUBLIC - WORKS EVERYWHERE
     //PRIVATE - IT ONLY WORKS IN THE RELEVANT CLASS, WE CAN NOT ACCESS IT FROM OUTSIDE OF THE CLASS
     //PROTECTED - IT IS SIMILAR WITH THE PUBLIC AND PRIVATE AT THE SAME TIME, WE USE "EXTEND" STRUCTURE
     //default, friendly
     //GENERALLY WE USE PRIVATE OR PROTECTED


    //INNER CLASS
    public static class City{

    private String cityName;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
         }
      }

    public static void main(String[] args) {

    Country country = new Country(); //I am alive, book a place
    country.setCountryName("Turkiye");

    City city = new City();
    city.setCityName("Istanbul");

    System.out.println(country.getCountryName()+" "+city.getCityName());

    }
    }



package oop.abstractx;

//POJO
//POJO + Constructor: BEAN


public class Student extends Person {


    @Override
    public void govdesizMethod() {

        System.out.println("Student Gövdesiz");

    }
}




/* implements Serializable {

    public static final Long serialVersionUID=1L;

    //FIELD
    private Long id;

    private String name;



    //CONSTRUCTOR
    public Student() {
        id=0L;
        name="You did not enter your name";

    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }




        //toString
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name=" + name +
                    '}';
        }



    //METHOD

    public void getData(){
        System.out.println("ID:" + id + "NAME:" + name);

    }




        //GETTER AND SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
*/
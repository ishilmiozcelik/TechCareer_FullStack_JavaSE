package oop.abstractx;


public class MainAbstract {

    public static void main(String[] args) {

        System.out.println("************************");
        Person person = new Teacher();      //polymorphism
        person.setId(44L);
        person.setName("Person Name");
        person.setSurname("Person Surname");
        person.getData();       //polymorphism
        person.govdesizMethod();
        System.out.println(person.hashCode());
        System.out.println(person);

        System.out.println("************************");
        oop.abstractx.Teacher teacher = new Teacher();
        teacher.setId(44L);
        teacher.setName("Teacher Name");
        teacher.setSurname("Teacher Surname");
        teacher.getData();
        teacher.govdesizMethod();
        System.out.println(teacher.hashCode());
        System.out.println(teacher);


        System.out.println("************************");
        oop.abstractx.Student student = new Student();
        student.setId(44L);
        student.setName("Student Name");
        student.setSurname("Student Surname");
        student.getData();
        student.govdesizMethod();
        System.out.println(student.hashCode());
        System.out.println(student);

    }

}

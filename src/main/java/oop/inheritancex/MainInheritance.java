package oop.inheritancex;

public class MainInheritance {

    public static void main(String[] args) {

        System.out.println("************************");
        Teacher teacher = new Teacher();
        teacher.setId(44L);
        teacher.setName("Teacher Name");
        teacher.setSurname("Teacher Surname");
        teacher.getData();
        System.out.println(teacher.hashCode());
        System.out.println(teacher);


        System.out.println("************************");
        Student student = new Student();
        student.setId(44L);
        student.setName("Student Name");
        student.setSurname("Student Surname");
        student.getData();
        System.out.println(student.hashCode());
        System.out.println(student);

    }

}

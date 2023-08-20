package oop.inheritancex;

import java.io.Serializable;

public class Person implements Serializable {

    public static final Long serialVersionUID=1L;

    //FIELD
    private Long id;

    private String name;

    private String surname;



    //CONSTRUCTOR
    public Person() {
        id=0L;
        name="You did not enter your name";
        surname="You did not enter your surname";

    }

    public Person(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }




    //toString
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                '}';
    }



    //METHOD

    public void getData(){
        System.out.println("ID:" + id + "NAME:" + name + "SURNAME" + this.surname);

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
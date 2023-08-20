package oop.interfacex;

public class MainInterface implements ICrud {
    @Override
    public void create() {
        System.out.println("Create");

    }

    @Override
    public void list() {
        System.out.println("List");

    }

    @Override
    public void update() {
        System.out.println("Update");


    }

    @Override
    public void delete() {
        System.out.println("Delete");


    }
}

package collections;

import java.util.*;

public class SetData {

    public static void main(String[] args) {

        Set<Integer> mylist = new HashSet<>();
        mylist.add(5);
        mylist.add(1);
        mylist.add(3);
        mylist.add(9);
        mylist.add(9);
        mylist.add(9);
        mylist.add(9);


        mylist.stream().forEach((temp)-> System.out.print(temp + " "));

        System.out.println("\n");


    }





}

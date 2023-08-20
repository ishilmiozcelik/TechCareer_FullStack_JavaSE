package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListData {

    public static void main(String[] args) {

        List<Integer> mylist = new ArrayList<>();
        mylist.add(5);
        mylist.add(1);
        mylist.add(3);
        mylist.add(9);
        mylist.add(9);
        mylist.add(9);
        mylist.add(9);

        for (int i = 0; i < mylist.size(); i++) {

            System.out.print(mylist.get(i) + " ");
        }
        System.out.println("\n");
        for (Integer temp:mylist){

            System.out.print(temp + " ");
        }

        mylist.stream().forEach((temp)-> System.out.print(temp + " "));

        System.out.println("\n");

        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){

            System.out.println(iterator.next()+ " ");
        }


    }
}

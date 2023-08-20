package collections;

import java.util.*;

public class MapData {

    public static void main(String[] args) {

        Map<String, String> maplist = new LinkedHashMap<>();

        for (int i = 0; i <= 9; i++) {
        maplist.put(UUID.randomUUID().toString(), i + " ");
        }

        for (String temp : maplist.keySet() ) {
            System.out.print(temp+" ");
        }
        System.out.println("\n");

        for (String key : maplist.keySet() ) {
            System.out.println(key+ " "+ maplist.get(key));
        }

        System.out.println("\n");
        maplist.entrySet().forEach(System.out::println);

        }

}

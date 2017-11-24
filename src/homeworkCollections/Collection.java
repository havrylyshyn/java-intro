package homeworkCollections;

import java.util.*;

public class Collection {
    public static void main(String args[]) {
        String string1 = "Vasia";
        String string2 = "Vania";
        String string3 = "Roma";
        String string4 = "Bohdan";
        String string5 = "Leko";

        ArrayList<String> str = new ArrayList<>();
        str.add(string2);
        str.add(string3);
        str.add(string4);
        str.add(string1);
        str.add(string5);

        str.remove(string2);

        if (str.contains(string2) == false) {
            System.out.println("List str does not contain " + string2);
        } else {
            System.out.println("List str contains " + string2);
        }

        System.out.println("Unsorted List:");
        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        java.util.Collections.sort(str);

        System.out.println("Sorted List:");
        Iterator<String> iterator2 = str.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}

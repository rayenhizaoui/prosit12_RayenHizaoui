package seance12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] a){


        List<String> s = new ArrayList<>();
        s.add("Ahmed");
        s.add("Amine");
        s.add("Abdeslam");
        s.add("Aymen");

        Comparator<String> expert = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.length()-o2.length();
            }
        };
        Collections.sort(s,expert);


    }
}

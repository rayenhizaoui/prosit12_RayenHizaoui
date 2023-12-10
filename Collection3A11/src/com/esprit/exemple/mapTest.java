package com.esprit.exemple;

import java.util.*;

public class mapTest {

    public static void main (String[] args){
        Map<String, Integer> studentScores = new HashMap<>();

          // Adding key-value pairs
        studentScores.put("Alice", 12);
        studentScores.put("Bob", 15);
        studentScores.put("Charlie", 14);
        studentScores.put("David", 20);



        if(studentScores.containsKey("sarah")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


        Set<String> setStudent=studentScores.keySet();
        Iterator<String> i = setStudent.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        studentScores.remove("Alice");
        System.out.println(studentScores);

        Collection<Integer> integers = studentScores.values();
        for(Integer x:integers){
            System.out.println(x);

        }

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        Map<Personne,String>test = new HashMap<>();
        Personne p = new Personne(2,"AA","dd");
        test.put(p,"BB");


   
    }
}

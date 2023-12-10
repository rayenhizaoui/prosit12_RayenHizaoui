package com.esprit.exemple;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {

    public static void main(String[] arg){

        Set<Personne> pers = new HashSet<>();
        pers.add(new Personne(1,"Samir","Tamtem"));
        pers.add(new Personne(2,"Jamila","Abdelkader"));
        pers.add(new Personne(3,"Ghaith","Ouesleti"));
        pers.add(new Personne(3,"Ghaith","Ouesleti"));


        System.out.println(pers);

        System.out.println("*********");

        Set<Personne> personnes = new TreeSet<>(new Comparator<Personne>() {
            @Override
            public int compare(Personne o1, Personne o2) {
                return o1.nom.compareTo(o2.nom);
            }
        });
        personnes.add(new Personne(234,"Samir","Tamtem"));
        personnes.add(new Personne(65,"Jamila","Abdelkader"));
        personnes.add(new Personne(90,"Arij","Abdellaoui"));
        System.out.println(personnes);



    }
}

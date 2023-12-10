package com.esprit.exemple;

public class Personne implements Comparable<Personne>{
    int id;
    String nom , prenom;

    public Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
       int result = 12;
       result = 25 + result +nom.hashCode();
       result = 25 + result +prenom.hashCode();
       return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null)return false;
        if(obj instanceof Personne e){
            return e.nom.equals(this.nom)&&e.prenom.equals(this.prenom);

        }
        return false;
    }

    @Override
    public int compareTo(Personne o) {
        return this.id-o.id;
    }
}

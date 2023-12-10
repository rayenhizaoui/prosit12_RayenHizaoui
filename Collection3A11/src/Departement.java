public class Departement implements Comparable<Departement> {
    int id ;
    String nomDepartement;
    int nbEmploye;

    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nbEmploye) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbEmploye = nbEmploye;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbEmploye=" + nbEmploye +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(obj==this)return true;
        if(obj instanceof Departement d){
            return this.id ==d.id && this.nomDepartement.equals(d.nomDepartement);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int x =13;
        x = x + 31 + id;
        x = x + 31 + nomDepartement.hashCode();
        return x ;
    }

    @Override
    public int compareTo(Departement o) {
        return  this.id-o.id;
    }
}

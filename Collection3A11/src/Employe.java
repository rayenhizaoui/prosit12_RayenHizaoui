public class Employe implements Comparable<Employe> {

    int id;
    String nom , prenom , nomDepartement;
    int grade;


    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)return true;
        if(obj==null)return false;
        if(obj instanceof Employe e){
            return e.id==this.id&& e.nom.equals(this.nom);
        }
        return false;
    }

    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
    }
}

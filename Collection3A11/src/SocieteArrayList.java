import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{

    List<Employe> employeList;

    public  SocieteArrayList(){
        employeList = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe employe) {
        employeList.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe e : employeList){
            if(e.nom.equals(nom))return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        if(employeList.contains(employe))return true;
        else return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employeList.remove(employe);

    }

    @Override
    public void displayEmploye() {
        for(Employe e:employeList){
            System.out.println(e);
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employeList);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comparatorDepartement =new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.nomDepartement.compareTo(o2.nomDepartement);
            }
        };

        Comparator<Employe> comparatorGrade =new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.grade - o2.grade;
            }
        };


        Collections.sort(employeList,comparatorDepartement.thenComparing(comparatorGrade));
    }
}

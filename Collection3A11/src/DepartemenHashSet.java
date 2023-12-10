import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartemenHashSet implements IDepartment<Departement>{


    Set<Departement> hashDep;


    public DepartemenHashSet(){
        hashDep=new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        hashDep.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d:hashDep){
            if(d.nomDepartement.equals(nom))return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
      if(hashDep.contains(departement))return true;
      else return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
         hashDep.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for(Departement d : hashDep){
            System.out.println(d);
        }

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        Set<Departement> treeSet= new TreeSet<>(hashDep);

        return (TreeSet<Departement>) treeSet;

    }
}

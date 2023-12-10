import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    //
    Map<Employe,Departement> map;
    public AffectationHashMap(){
        map=new HashMap<>();
    }
    public void ajouterEmployerDepartement (Employe e,Departement d){
        map.put(e, d);

    }
    public void afficherEmployerDep()
    {
        for (Map.Entry<Employe,Departement> Entry:map.entrySet()){
            System.out.println(Entry.getKey()+" value "+ Entry.getValue());
    }
    }

    public boolean supprimerEmpolye (Employe e){
        if(map.remove(e)==null){
            return false;
        }
            return true;
    }

    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        if(map.remove(e,d)){
            System.out.println("Employé et département supprimé");
        }else {
            System.out.println("Impossible de supprimer");
        }
    }

    public void afficherEmploye(){
        for (Employe e : map.keySet()){
            System.out.println("Employe est"+e.getNom());}
    }

    public void afficherDepart(){
        for(Departement d :map.values()){
            System.out.println("departement "+d);
        }

    }

    public boolean rechercherEmplye(Employe e){
        if(map.containsKey(e))return true;
        return false;
    }


    public boolean rechercherDepartement(Departement d){
        if(map.containsValue(d))return true;
        return false;
    }


    public TreeMap<Employe,Departement> trierMap(){

        TreeMap<Employe,Departement>emp= new TreeMap<>(map);
        return emp ;
    }



}

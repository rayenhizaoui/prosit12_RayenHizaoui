public class Main {

    public static void main(String[]args){

/*
        Employe e1 = new Employe(1,"Dora","Tkaya","TIC",2);
        Employe e2 = new Employe(2,"Ghaith","ben othmen","Dev",3);
        Employe e3 = new Employe(3,"Khalil","Aloui","Dev",1);
        Employe e4 = new Employe(4,"Jamila","Ben Abdelkader","RH",5);


        SocieteArrayList sc=new SocieteArrayList();
        sc.ajouterEmploye(e1);
        sc.ajouterEmploye(e2);
        sc.ajouterEmploye(e3);
        sc.ajouterEmploye(e4);


        sc.displayEmploye();

       sc.supprimerEmploye(e1);

        System.out.println("************");
       sc.displayEmploye();

       sc.ajouterEmploye(e1);
        System.out.println("************");

        sc.trierEmployeParNomDépartementEtGrade();

        sc.displayEmploye();*/

        Departement d1 = new Departement(465,"Finance",10);
        Departement d2 = new Departement(2333,"Marketing",6);
        Departement d3 = new Departement(309,"TIC",10);
        Departement d6 = new Departement(309,"TIC",10);
        Departement d4 = new Departement(45,"RH",1);

        DepartemenHashSet dhset = new DepartemenHashSet();
        System.out.println("***************");

        dhset.ajouterDepartement(d1);
        dhset.ajouterDepartement(d2);
        dhset.ajouterDepartement(d3);
        dhset.ajouterDepartement(d4);
        dhset.ajouterDepartement(d6);

        dhset.displayDepartement();

        System.out.println(dhset.rechercherDepartement("RH"));
        System.out.println(dhset.rechercherDepartement("Dev"));

        dhset.supprimerDepartement(d4);

        dhset.displayDepartement();

        System.out.println(dhset.trierDepartementById());







    }
}

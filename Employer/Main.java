import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Employer E1=new Employer();
        Employer E2=new Employer(123,"hamed","sbz",8);
        System.out.println("saisir un nom");
        E1.setNom(scanner.nextLine());
        System.out.println("saisir un id");
        E1.setId(scanner.nextInt());
        System.out.println("saisir un adresse");
        E1.setadresse(scanner.next());
        System.out.println("saisir un nbr");
        E1.setnbr_heures(scanner.nextInt());
        E1.affiche();
        E2.affiche();
        System.out.println(E1);
        Caissiers c1=new Caissiers();
        Caissiers c2=new Caissiers();
        Vendeur v1=new Vendeur(80,"hama",12);
        Responsable r1=new Responsable(500,"hamed","sbz");


    }
}
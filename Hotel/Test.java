
public class Test {
    public static void main(String[] args) {

      Hotel h1=new Hotel("horchani","sidi bouzid",20,3);
        Hotel h2=new Hotel("mariem","Benzaret",30,7);
        Hotel h3=new Hotel("Paris","Hammet",21,5);
        h1.afficher();
        h2.afficher();
        h3.afficher();
        System.out.println("le nombre total de hotel est "+Hotel.nombre);
        Reservation R1=new Reservation(1,h1,3);

        R1.afficherreser();
        Reservation R2=new Reservation(8,h2,5);
        R2.afficherreser();
        Reservation R3=new Reservation(4,h3,2);
R3.afficherreser();



    }
}
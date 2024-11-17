public class Hotel {
    private String nom;
    private String lieu;
    private int nbr_chbr_disp;
    private int nbr_hotel;
    public static  int nombre;
    public Hotel(String nom, String lieu, int nbr1, int nbr2) {
        this.nom = nom;
        this.lieu = lieu;
        this.nbr_chbr_disp = nbr1;
        this.nbr_hotel = nbr2;
        nombre++;
    }
    public void afficher(){
        System.out.println("le nom de hotel est "+nom+" il existe a "+lieu+
                " il contient "+nbr_chbr_disp+" chambre et son nombre "+nbr_hotel);
    }
    public boolean reserver(int n){
        if (n>nbr_chbr_disp){
            return false;
        }else{
            return true;

        }
    }


































}

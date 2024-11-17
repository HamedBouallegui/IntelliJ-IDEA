public class Reservation {
    private int id;
    private Hotel hotel;
    private int  nbr_chbr_res;
    public Reservation(int id, Hotel hotel, int nbr) {
        this.id = id;
        this.hotel = hotel;
        this.nbr_chbr_res = nbr;
    }
    public void afficherreser(){
        System.out.println("votre id de reservation est "+id+" dans hotel "+hotel+
                " qui contient "+nbr_chbr_res+" chambre reserver ");
    }















}

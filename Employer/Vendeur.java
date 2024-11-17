public class Vendeur extends Employer {
private double tauxvente;
public Vendeur(int id, String nom, int nbr_heures){
    this.tauxvente=tauxvente;
}
public double calculesalaire(){
    return 450*tauxvente;
}
}

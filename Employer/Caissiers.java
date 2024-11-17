public class Caissiers extends Employer{
private int NumCassier;
public Caissiers(int id,String nom,String adresse,int nbr_heures,int NumCassier){
    super(id,nom,adresse,nbr_heures);
    this.NumCassier=NumCassier;
}

    public Caissiers() {

    }

    public double calculeSalaire(){
    double salaire=nbr_heures*5;
    if(nbr_heures>180){
        salaire+=(nbr_heures-180)*5*0.15;
    }
    return salaire;
}
}

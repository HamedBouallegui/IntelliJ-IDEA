public class Responsable extends Employer {
    private double prime;
    public Responsable(int id,String nom,String adresse){
        super(id,nom,adresse,nbr_heures);
        this.prime=prime;
    }
    public double calculerSalaire(){
        double salaire=nbr_heures*10+prime;
        if(nbr_heures>160){
            salaire+=(nbr_heures-160)*10*0.20;
        }
        return salaire;
    }
}

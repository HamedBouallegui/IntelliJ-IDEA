public class Employer {
    private int id;
    private String nom;
    private String adresse;
    protected int nbr_heures;
    public Employer(){

    }
    public Employer(int id,String nom,String adresse,int nbr_heures){
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
        this.nbr_heures=nbr_heures;
    }
    public void setId(int i){
         id=i;
    }
    public int getId(){
        return id;
    }
    public void setNom(String x){
        nom=x;
    }
    public String getNom(){
        return nom;
    }
    public void setadresse(String y){
         adresse=y;
    }
    public String getadresse(){
        return adresse;
    }

    public void setnbr_heures(int n) {
         nbr_heures=n;
    }
    public int getnbr_heures(){
        return nbr_heures;
    }

    public void affiche(){
        System.out.println("id:"+id+"nom"+nom+"adresse:"+adresse+"nbr_heures:"+nbr_heures);
    }
   @Override
    public String toString(){
        return "Employer{"+
                   "id=" + id +
                   ", nom='" + nom + '\'' +
                   ", adresse='" + adresse + '\'' +
                   ", nbr_heures='" + nbr_heures +
                   '}';

       }
}

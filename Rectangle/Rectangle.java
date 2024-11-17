public class Rectangle {
    private double longueur,largeur;
    public Rectangle(double lo, double la) {

        longueur = lo;
        largeur = la;

    }
    public Rectangle(double cote) {
        longueur=largeur=cote;

    }
    public double perimeter() {
        return 2*(longueur+largeur);
    }
    public double diagonal() {
        return Math.sqrt(longueur*longueur+largeur*largeur);
    }
    public void affiche(String message) {
        System.out.println("longueur :"+longueur);
        System.out.println("largeur : "+largeur);
        System.out.println("perimetre : "+perimeter());
        System.out.println("diagonal : "+diagonal());
    }


}

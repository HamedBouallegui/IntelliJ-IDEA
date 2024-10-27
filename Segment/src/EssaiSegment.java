public class EssaiSegment {
    public static void main(String[] args) {


        Segment segment = new Segment(10, 20);

        System.out.println("Segment créé: " + segment.toString());

        System.out.println("Longueur du segment: " + segment.longueur());


        if (segment.appartient(15)) {
            System.out.println("Le point " + 15+ " appartient au segment.");
        } else {
            System.out.println("Le point " + 15+ " n'appartient pas au segment.");
        }
    }
}
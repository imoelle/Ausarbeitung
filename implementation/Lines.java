import utilities.Vector2D;

public class Lines {
    public static void main(String[] args) {
        System.out.println("Semesterbegleitende Ausarbeitung: Aufgabe 4 - Design Patterns der OOP");

        Vector2D v1 = new Vector2D(2, 1);
        Vector2D v2 = new Vector2D(6, 3);
        Vector2D v3 = v1;

        System.out.println("V1: " + v1);
        System.out.println("V2: " + v2);
        System.out.println("Hash V1: " + v1.hashCode());
        System.out.println("Hash V2: " + v2.hashCode());
        System.out.println("v1 = v2: " + v1.equals(v2));
        System.out.println("v1 = v3: " + v1.equals(v3));
        System.out.println("v1x: " + v1.getX());
        System.out.println("v1y: " + v1.getY());




    }
}

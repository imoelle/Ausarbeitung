import geometrics.Rectangle;
import utilities.Vector2D;

public class Lines {
    public static void main(String[] args) {
        System.out.println("Semesterbegleitende Ausarbeitung: Aufgabe 4 - Design Patterns der OOP");

        Vector2D v1 = new Vector2D(5, 3);
        Rectangle r1 = new Rectangle(v1, 4, 2);

        System.out.println("diagonale: " + r1.diagonal());
        System.out.println("umfang: " + r1.outline());
        System.out.println("middle: " + r1.middleAnchorPoint());
        System.out.println("top: " + r1.topAnchorPoint());
        System.out.println("right: " + r1.rightAnchorPoint());
        System.out.println("bottom: " + r1.bottomAnchorPoint());
        System.out.println("left: " + r1.leftAnchorPoint());
    }
}

package geometrics;

import utilities.Vector2D;

public class Rectangle {
    private final double width;
    private final double height;
    private Vector2D location;

    // ----- Rectangle constructors ------------------------------------------------------------- //
    // Rectangle(Vector2D, double, double);
    // Rectangle(double, double);
    // ----------------------------------------------------------------------------------------- //

    /**********************************************************************************************
     * Creates a new Rectangle with given values.
     * @param location The Rectangle starting point defined by x, y coordinates (Vector2D)
     * @param width The Rectangle width
     * @param height The Rectangle height
     *****/
    public Rectangle(Vector2D location, double width, double height) {
        this.location = location;
        this.width = width;
        this.height = height;
    }

    /**********************************************************************************************
     * Creates a new Rectangle with given width and height on location (0, 0)
     * @param width The Rectangle width
     * @param height The Rectangle height
     *****/
    public Rectangle(double width, double height) {
        this(new Vector2D(0, 0), width, height);
    }

    /**********************************************************************************************
     * Creates a new Rectangle defined by two Vector2D.
     * @param startPoint Starting point on top-left
     * @param endPoint Ending point on bottom-right
     *****/
    public Rectangle(Vector2D startPoint, Vector2D endPoint) {
        Vector2D distance = endPoint.subtractAndCreate(startPoint);
        this.width = distance.getX();
        this.height = distance.getY();
        this.location = startPoint;
    }

    /**********************************************************************************************
     *
     * @param sx Test 1
     * @param sy Test 2
     * @param ex Test 3
     * @param ey Test 4
     *****/
    public Rectangle(double sx, double sy, double ex, double ey) {
        this(new Vector2D(sx, sy), new Vector2D(ex, ey));
    }

    // ----- Rectangle specific operations (public) -------------------------------------------- //
    //
    // ----------------------------------------------------------------------------------------- //

    public Vector2D middleAnchorPoint() {
        return new Vector2D();
    }

    public Vector2D topAnchorPoint() {
        return new Vector2D();
    }

    public Vector2D rightAnchorPoint() {
        return new Vector2D();
    }

    public Vector2D bottomAnchorPoint() {
        return new Vector2D();
    }

    public Vector2D leftAnchorPoint() {
        return new Vector2D();
    }
}

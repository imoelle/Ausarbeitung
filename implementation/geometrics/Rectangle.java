package geometrics;

import utilities.Vector2D;

/**************************************************************************************************
 * <h2>A class for Rectangles in 2D vector space.</h2>
 * <p>
 * An Object of the Rectangle class describes elements that could be mirrored to an graphical Interface
 * inside a 2D space. Furthermore the class provides methods to calculate anchor points, areas and
 * collisions between objects of rectangles.
 * </p>
 *
 * @author Ingo M&ouml;ller
 * @version 01.00 (current)
 * <h3>Version history:</h3>
 * <ul>
 *     <li>
 *         <i>Version: 01.00:&nbsp;</i>Create Rectangle class as standalone solution for mirroring
 *          2D Java Swing graphics inside a frame.
 *     </li>
 * </ul>
 *****/
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
     * Creates a new Rectangle with given coordinates start(x, y), end(x, y) : (sx, sy, ex, ey).
     * @param sx Start coordinate (x)
     * @param sy Start coordinate (y)
     * @param ex End coordinate (x)
     * @param ey End coordinate (y)
     *****/
    public Rectangle(double sx, double sy, double ex, double ey) {
        this(new Vector2D(sx, sy), new Vector2D(ex, ey));
    }

    // ----- Rectangle geometric methods (public) ---------------------------------------------- //
    // public Fläche
    // public Umfang
    // public diagonale
    // public Seite
    //

    /**********************************************************************************************
     * Calculates the rectangle area by with and height.
     * <p>Note: Basic geometric operation on Rectangle.</p>
     * @param width Rectangle width
     * @param height Rectangle height
     * @return The area calculates by rectangle width and height
     *****/
    public double area(double width, double height) {
        return magnitude(width) * magnitude(height);
    }

    /**********************************************************************************************
     * Calculates the rectangle area by location and a given end point.
     * <p>Note: Basic geometric operation on Rectangle.</p>
     * @param endPoint End point of rectangle as Vector2D
     * @return The area calculates by location and end position from rectangle
     *****/
    public double area(Vector2D endPoint) {
        Vector2D area = this.location.subtractAndCreate(endPoint);
        return magnitude(area.x) * magnitude(area.y);
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

    // ----- Rectangle specific operations (private) ------------------------------------------- //
    // private double magnitude(double)

    /**********************************************************************************************
     * Calculates the absolute value for dates that cannot be negative.
     * <p>Note: Rectangle specific operation with class access only (private)</p>
     * @param value The value whose absolut value is to be calculated
     * @return The magnitude from value
     */
    private double magnitude(double value) {
        return Math.sqrt(value * value);
    }

}

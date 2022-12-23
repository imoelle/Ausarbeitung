package utilities;

import java.awt.geom.Point2D;
import java.util.Objects;

/**************************************************************************************************
 * <h2>A class for vectors in 2D vector space.</h2>
 * <p>
 * An object of the Vector2D class describes elements that additional to the numerical description <br>
 * inside 2D space do a statement about his direction and orientation. Therefore, Vectors are directional <br>
 * quantities in space. Furthermore, the class provides methods for calculating individual vectors or methods <br>
 * for calculating vectors among themselves.
 * </p>
 * The following books was used to create this class: <br>
 * <ul>
 *  <li><i>Alexander Roux - <b>Das kleine Buch der Vektorrechnung</b></i>
 *    <ul><li>ISBN-13: 978-3737 5923 90</li>
 *        <li>ISBN-10: 37 3759 239X</li>
 *    </ul></li>
 *    <li><i>Daniel Shiffman - <b>The Nature of Code</b></i>
 *      <ul><li>ISBN-13: 978-0985 9308 06</li>
 *          <li>ISBN-10: 09 8593 0802</li>
 *          <li><a href="https://natureofcode.com/book/" target="_blank">online available</a></li>
 *      </ul></li>
 * </ul>
 * @author Ingo M&ouml;ller
 * @version 01.01 (current)
 * <h3>Version history:</h3>
 * <ul>
 *     <li><i>Version: 01.00:&nbsp;</i>Create Vector2D class as standalone solution for 2D Java Swing graphics</li>
 *     <li><i>Version: 01.01:&nbsp;</i>Create Vector2D as Point2D extension.</li>
 * </ul>
 *****/
public class Vector2D extends Point2D.Double {

    // ----- Vector2D constructors ------------------------------------------------------------- //
    // Vector2D(double, double);
    // Vector2D();
    // ----------------------------------------------------------------------------------------- //

    /**********************************************************************************************
     * Create a Vector2D with given coordinates (x, y)
     * @param x Vector2D x coordinate
     * @param y Vector2D y coordinate
     *****/
    public Vector2D(double x, double y) {
        super(x, y);
    }

    /**********************************************************************************************
     * Create a Vector2D with coordinates (0, 0)
     *****/
    public Vector2D() {
        this(0, 0);
    }

    // ----- Vector2D basic arithmetic operations (public) ------------------------------------- //
    // void add(Vector2D);
    // Vector2D addAndCreate(Vector2D);
    // void subtract(Vector2D);
    // Vector2D subtractAndCreate(Vector2D);
    // void multiply(double);
    // Vector2D multiplyAndCreate(double);
    // void divide(double);
    // Vector2D divideAndCreate(double);
    // ----------------------------------------------------------------------------------------- //

    /**********************************************************************************************
     * Adds a Vector2D to current Vector2D.
     * <p> Note: Basic arithmetic operation with two Vectors2D.</p>
     * @param addend Vector2D to add.
     * @since 01.00
     *****/
    public void add(Vector2D addend) {
        this.x += addend.x;
        this.y += addend.y;
    }

    /**********************************************************************************************
     * Creates a new Vector2D by adding another Vector2D to current Vector2D.
     * <p> Note: Basic arithmetic operation with two Vector2D.</p>
     * @param addend Vector2D to add
     * @return A new Vector2D by adding both Vectors2D.
     * @since 01.00
     *****/
    public Vector2D addAndCreate(Vector2D addend) {
        return new Vector2D(this.x + addend.x,
                this.y + addend.y);
    }

    /**********************************************************************************************
     * Subtract a Vector2D from current Vector2D.
     * <p>Note: Basic arithmetic operation with two Vector2D</p>
     * @param subtrahend Vector2D to subtract
     * @since 01.00
     *****/
    public void subtract(Vector2D subtrahend) {
        this.x -= subtrahend.x;
        this.y -= subtrahend.y;
    }

    /**********************************************************************************************
     * Creates a new Vector2D by subtracting another Vector2D from current Vector2D.
     * <p>Note: Basic arithmetic operation with two Vector2D</p>
     * @param subtrahend Vector2D to subtract
     * @return A new Vector2D by subtracting both Vector2D
     * @since 01.00
     *****/
    public Vector2D subtractAndCreate(Vector2D subtrahend) {
        return new Vector2D(this.x - subtrahend.x,
                this.y - subtrahend.y);
    }

    /**********************************************************************************************
     * Multiplied a scalar to current Vector2D.
     * <p>Note: Basic arithmetic operation with single Vector2D</p>
     * @param scalar Scalar to multiply
     * @since 01.00
     *****/
    public void multiply(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    /**********************************************************************************************
     * Create a new Vector2D by multiplying a Scalar to current Vector2D.
     * <p>Note: Basic arithmetic operation with single Vector2D</p>
     * @param scalar Scalar to multiply
     * @return A new Vector2D by multiplying both parameters
     * @since 01.00
     */
    public Vector2D multiplyAndCreate(double scalar) {
        return new Vector2D(this.x * scalar,
                this.y * scalar);
    }

    /**********************************************************************************************
     * Divide a Vector2D by a scalar.
     * <p>Note: Basic arithmetic operation with single Vector2D</p>
     * @param scalar Vector2D divider
     * @since 01.00
     *****/
    public void divide(double scalar) {
        if(checkForNotEqualZero(scalar)) {
            this.x /= scalar;
            this.y /= scalar;
        } else {
            throw new ArithmeticException("Vector2D: Division by zero");
        }
    }

    /**********************************************************************************************
     * Create a new Vector2D by dividing the current Vector2D by scalar.
     * <p>Note: Basic arithmetic operation with single Vector2D</p>
     * @param scalar Vector2D divider
     * @return A new Vector2D by dividing both parameter
     * @since 01.00
     *****/
    public Vector2D divideAndCreate(double scalar) {
        if(checkForNotEqualZero(scalar)) {
            return new Vector2D(this.x / scalar,
                    this.y / scalar);
        } else {
            throw new ArithmeticException("Vector2D: Division by zero");
        }
    }

    // ----- Vector2D specific operations (public) --------------------------------------------- //
    // double dotProduct(Vector2D);
    // double magnitude();
    // double angleInDegreesTo(Vector2D);
    // Vector2D normalize();
    // double angleInRadiansTo(Vector2D);
    // Vector2D headingVector(Vector2D);
    // double hasHeadingAngle(Vector2D);
    // Vector2D rotateByAngle(double);
    // Vector2D linearInterpolateTo(Vector2D, double);
    // Vector2D distanceTo(Vector2D)
    // double euclideanDistanceTo(Vector2D);
    // ----------------------------------------------------------------------------------------- //

    /**********************************************************************************************
     * Creates a new scalar by calculating the dot product of two Vector2D.
     * <p>
     *     <b>Explanation</b>: The dot product is a mathematical operation that associates two vectors with <br>
     *     a number (scalar).
     * </p>
     * <p>Note: Special Vector2D operation with two Vector2D</p>
     * @param theOther The second Vector2D
     * @return A new scalar from both Vector2D
     * @since 01.00
     *****/
    public double dotProduct(Vector2D theOther) {
        return this.x * theOther.x +
                this.y * theOther.y;
    }

    /**********************************************************************************************
     * Create the magnitude from a given Vector2D.
     * <p>
     *     <b>Explanation</b>: The absolute value (or magnitude) of a vector is the length of an arrow that
     *     represents it.
     * </p>
     * <p>Note: Special Vector2D operation with single Vector2D</p>
     * @return The magnitude from the given Vector2D
     * @since 01.00
     *****/
    public double magnitude() {
        return Math.sqrt(vectorSquareFrom(this));
    }

    /**********************************************************************************************
     * Calculates the angle in degree between the current Vector2D and another Vector2D.
     * <p>Note: Special Vector2D operation with two Vector2D</p>
     * @param theOther The corresponding Vector2D
     * @return The angle in degree between both Vector2D
     * @since 01.00
     *****/
    public double angleInDegreesTo(Vector2D theOther) {
        return Math.toDegrees(this.angleInRadiansTo(theOther));
    }

    /**********************************************************************************************
     * Calculates the angle in radians between the current Vector2D and another Vector2D.
     * @param theOther The corresponding Vector2D
     * @return The angle in radians between both Vector2D
     * @since 01.00
     *****/
    public double angleInRadiansTo(Vector2D theOther) {
        checkForNotEqualZero(this.dotProductMagnitude(theOther));
        return Math.acos(this.dotProduct(theOther) /
                this.dotProductMagnitude(theOther));
    }

    /**********************************************************************************************
     * Calculates the unit vector from current Vector2D
     * <p>
     *     A given Vector2D can be normalized by dividing it by its magnitude (absolute value). The result is a Vector2D <br>
     *     of length one whose direction is the same as the original. Complex calculations can be simplified significantly <br>
     *     by using normalized vectors.
     * </p>
     * <p>Note: Special Vector2D operation with single Vector2D</p>
     * @return A normalized Vector2D with length of one
     * @since 01.00
     *****/
    public Vector2D normalize() {
        double magnitude = this.magnitude();
        return new Vector2D(this.x * (1 / magnitude),
                this.y * (1 / magnitude));
    }

    /**********************************************************************************************
     * Calculates the heading of a Vector2D.
     * <p>
     *     The direct way from a starting point (origin) to the goal leads over a course. The connection of both points <br>
     *     could be represented as  Vector2D. In the event of a disturbance, such as a current or crosswind the direction <br>
     *     of movement is influenced. This leads to a course deviation also called heading.
     * </p>
     * <p>Note: Special Vector2D operation with two Vector2D</p>
     * @param influence The influencing Vector2D (e.g. wind, gravitation, flow direction)
     * @return The affected Vector2D
     * @since 01.00
     *****/
    public Vector2D headingVector(Vector2D influence) {
        return this.addAndCreate(influence);
    }

    /**********************************************************************************************
     * Calculates the angle between direct course and heading course.
     * <p>Note: Special Vector2D operation with two Vector2D</p>
     * @param influence The influencing Vector2D (e.g. wind, gravitation, flow direction)
     * @return The angle between direct course and deviated course
     * @since 01.00
     *****/
    public double hasHeadingAngle(Vector2D influence) {
        return Math.toDegrees(influence.magnitude() /
                this.magnitude());
    }

    /**********************************************************************************************
     * Turns the Vector2D by given angle.
     * <p>Note: Special Vector2D operation with single Vector2D</p>
     * @param angleInDegrees The rotation angle
     * @return A new Vector2D turned by given angle
     * @since 01.00
     *****/
    public Vector2D rotateByAngle(double angleInDegrees) {
        double angle = Math.toRadians(angleInDegrees);
        return new Vector2D(this.xTurnedBy(angle),
                this.yTurnedBy(angle));
    }

    /**********************************************************************************************
     * Calculates a number between two numbers at a specific increment.
     * <p>
     *     The factor parameter is the amount between the current Vector2D and the target Vector2D to be interpolated. <br>
     *     0.0 refers to the starting point (current Vector2D), 0.1 is close to the starting point, 0.5 is halfway between <br>
     *     start and goal. This method is useful to create motions along a straight path, or to draw dotted lines.
     * </p>
     * <p>Note: Special Vector2D operation with two Vector2D</p>
     * @param target The final position from Vector2D
     * @param factor Is the amount to interpolate between both Vector2D
     * @return The calculated step as Vector2D
     * @since 01.00
     *****/
    public Vector2D linearInterpolateTo(Vector2D target, double factor) {
        return createsNewVectorFrom(this, 1 - factor).
                addAndCreate(createsNewVectorFrom(target, factor));
    }

    /**********************************************************************************************
     * Calculates the distance between to Vector2D.
     * <p>Node: Special Vector2D operation with two Vector2D</p>
     * @param theOther Vector2D whose distance to be determined
     * @return The distance between both Vector2D
     * @since 01.00
     *****/
    public Vector2D distanceTo(Vector2D theOther) {
        return new Vector2D(this.x - theOther.x, this.y - theOther.y);
    }

    /**********************************************************************************************
     * Create a new Value after calculating the euclidean distance between two Vector2D.
     * <p>
     *    <b>Explanation</b>: Euclidean distance is a geometry function. When two points on a plane or in 3D space <br>
     *    are connected by a straight line, the Euclidean distance is the length of that straight line.
     * </p>
     * <p>Note: Special Vector2D operation with two Vector2D</p>
     * @param theOther Vector2D whose euclidean distance to be determined
     * @return The euclidean distance between both vectors
     * @since 01.00
     *****/
    public double euclideanDistanceTo(Vector2D theOther) {
        return Math.sqrt(squareOf(theOther.x - this.x) +
                squareOf(theOther.y - this.y));
    }

    // ----- Vector2D specific operations internal (private) ----------------------------------- //
    // Vector2D createsNewVectorFrom(Vector2D, double);
    // double xTurnedBy(double);
    // double yTurnedBy(double);
    // double vectorSquareFrom(Vector2D);
    // double squareOf(double);
    // double dotProductMagnitude(Vector2D);
    // boolean checkForNotEqualZero(double);
    // ----------------------------------------------------------------------------------------- //

    /**********************************************************************************************
     * Creates a new Vector2D from a given Vector2D and a factor.
     * <p>Note: Vector2D specific operation with class access only (private).</p>
     * @param source The Vector2D source
     * @param factor The factor which the Vector2D source is multiplied
     * @return A new Vector2D calculated with both parameters
     * @since 01.00
     *****/
    private Vector2D createsNewVectorFrom(Vector2D source, double factor) {
        return new Vector2D(source.x * factor,
                source.y * factor);
    }

    /**********************************************************************************************
     * Calculates a rotation around the x-axis by value.
     * <p>Note: Vector2D specific operation with class access only (private).</p>
     * @param angleInRadians The angle in radians which to rotate
     * @return A new value rotated x-value.
     * @since 01.00
     *****/
    private double xTurnedBy(double angleInRadians) {
        return this.x * Math.cos(angleInRadians) -
                this.y * Math.sin(angleInRadians);
    }

    /**********************************************************************************************
     * Calculates a rotation around the y-axis by value.
     * <p>Note: Vector2D specific operation with class access only (private).</p>
     * @param angleInRadians The angle in radians which to rotate
     * @return A new value rotated y-value.
     * @since 01.00
     *****/
    private double yTurnedBy(double angleInRadians) {
        return this.x * Math.sin(angleInRadians) +
                this.y * Math.cos(angleInRadians);
    }

    /**********************************************************************************************
     * Create a new Vector2D with square from the original Vector2D
     * <p>Note: Private specific Vector2D operation with single Vector2D</p>
     * @param vector Vector2D to be squared
     * @return A new Vector2D with the square from original Vector2D
     * @since 01.00
     *****/
    private double vectorSquareFrom(Vector2D vector) {
        return vector.x * vector.x +
                vector.y * vector.y;
    }

    /**********************************************************************************************
     * Calculates the square of a value.
     * <p>Note: Vector2D specific operation with class access only (private).</p>
     * @param value The value to be squared
     * @return The squared value from parameter
     * @since 01.00
     *****/
    private double squareOf(double value) {
        return value * value;
    }

    /**********************************************************************************************
     * Calculates the absolute value (magnitude) from current Vector2D and another Vector2D
     * <p>Note: Vector2D specific operation with class access only (private).</p>
     * @param vector The Vector2D wich used for calculations
     * @return The magnitude of both Vector2D
     * @since 01.00
     *****/
    private double dotProductMagnitude(Vector2D vector) {
        return this.magnitude() * vector.magnitude();
    }
    /**********************************************************************************************
     * Checks that the given value is unequal zero.
     * @param value Double value to check.
     * @return True if value is not zero, otherwise false
     * @since 01.00
     *****/
    private boolean checkForNotEqualZero(double value) {
        return value != 0;
    }



    // ----- Overridden methods (global) ------------------------------------------------------- //
    // public double getX()
    // public double getY()
    // public void setLocation(double, double)
    // public boolean equals(Object)
    // public String toString();
    // public int hashCode();
    // ----------------------------------------------------------------------------------------- //

    /**********************************************************************************************
     * Returns the x value from Vector2D
     * <p>Note: Abstract method derived from Point2D required to override</p>
     * @return The x value from Vektor2D
     * @since 01.01
     *****/
    @Override
    public double getX() {
        return this.x;
    }

    /**********************************************************************************************
     * Returns the y value from Vector2D
     * <p>Note: Abstract method derived from Point2D required to override</p>
     * @return The y value from Vector2D
     * @since 01.01
     *****/
    @Override
    public double getY() {
        return this.y;
    }

    /**********************************************************************************************
     * Set the location from Vector2D inside 2D space (window size).
     * <p>Note: Abstract method derived from Point2D required to override</p>
     * @param x the new X coordinate of this {@code Point2D}
     * @param y the new Y coordinate of this {@code Point2D}
     * @since 01.01
     *****/
    @Override
    public final void setLocation(double x, double y) {
        this.add(new Vector2D(x, y));
    }

    /**********************************************************************************************
     * Compares if the current Vector2D is equal to another Vector2D.
     * <p>Note: Required global method to override</p>
     * @param thatObject The Vector2D to be compared
     * @return True if both Vector2D are the same, otherwise false
     * @since 01.00
     *****/
    @Override
    public boolean equals(Object thatObject) {
        if(this == thatObject)
            return true;
        if(thatObject == null)
            return false;
        if (thatObject instanceof Vector2D) {
            Vector2D that = (Vector2D) thatObject;
            return (this.x == that.x) &&
                    (this.y == that.y);
        }
        return false;
    }

    /**********************************************************************************************
     * Returns a string as a representation of an object.
     * <p>Note: Required global method to override</p>
     * @return The representation of a Vector2D
     * @since 01.00
     */
    @Override
    public String toString() {
        return "[" + this.x + ", " + this.y + "]";
    }

    /**********************************************************************************************
     * Returns a numeric value that is a representation of an object.
     * <p>Note: Required global method to override</p>
     * @return A numeric value as representation of a Vector2D
     * @since 01.00
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

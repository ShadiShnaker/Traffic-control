package utilities;

import java.util.Objects;

/***
 * @author Shadi
 * Class Point
 */
public abstract class Point implements Utilities {
    /* Fields */
    private final int minVal = 0;
    private final int maxX = 800;
    private final int maxY = 600;
    private int x;
    private int y;

    /* Constructors */
    public Point(int x, int y){
        setX(x);
        setY(y);
        successMessage(toString());
    }

    public Point(){
        this.x = getRandomInt(minVal, maxX);
        this.y = getRandomInt(minVal, maxY);
    }

    /* Setters and getters */
    public int getX() {
        return x;
    }

    /***
     * set x if the token in the range else set x as a random int
     * @param x
     */
    public void setX(int x) {
        if(checkValue(x, minVal, maxX))
            this.x = x;
        else{
            errorMessage(x,"x");
            this.x = getRandomInt(minVal, maxX);
            correctingMessage(x, this.x, "x");
        }
    }

    public int getY() {
        return y;
    }

    /***
     * set y equals to the token if the token in the range else set it as a random int
     * @param y
     */
    public void setY(int y) {
        if(checkValue(y, minVal, maxY))
            this.y = y;
        else{
            errorMessage(y, "y");
            this.y = getRandomInt(minVal, maxY);
            correctingMessage(y, this.y, "y");
        }
    }
    /* Methods */

    /***
     * abstract method
     * @param other
     * @return the distance between tow points
     */
    public abstract double calcDistance(Point other);

    /* toString & equals() methods */

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return getX() == point.getX() && getY() == point.getY();
    }
}

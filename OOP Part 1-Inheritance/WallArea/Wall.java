/* exercise is to implement the Wall class, which can calculate the area of a wall.
 */
package WallArea;

public class Wall {
    //Fields
    private double height;
    private double width;

    // No-param constructor
    public Wall() {}

    //Param Constructor
    public Wall(double width, double height) {
        setWidth(width);

        setHeight(height);
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if ( width < 0 ) {
            width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if ( height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getArea() {
        return ( width * height );
    }
}

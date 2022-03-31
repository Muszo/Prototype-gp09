package buccaneer.board;


import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    private double xPosition;
    private double yPosition;
    private double width;
    private double height;
    private double center;

    public Tile(double xPosition, double yPosition, double width, double height) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.center = (height / 2) + (width / 2);
        setX(xPosition);
        setY(yPosition);
        setWidth(width);
        setHeight(height);
    }

    public double getCenter() {
        return center;
    }
}

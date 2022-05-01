package buccaneer.ui;

import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    private static final int TILE_HEIGHT = 40;

    private static final int TILE_WIDTH = 40;

    private final double xPosition;

    private final double yPosition;
    private boolean isOccupied;




    /*
    UNDER CONSTRUCTION
     */


    public Tile(double xPosition, double yPosition, String hexValueColor) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;

        setHeight(TILE_HEIGHT);
        setWidth(TILE_WIDTH);
        setPosition(this.xPosition, this.yPosition);
        relocate(xPosition * TILE_WIDTH, yPosition * TILE_HEIGHT);

        setStyle("-fx-stroke: green;-fx-stroke-width: 4;-fx-background-color: " + hexValueColor);

    }


    public double getCenterX() {

        return (this.xPosition * TILE_WIDTH) + (TILE_WIDTH / 2.0);
    }

    public double getCenterY() {

        return (this.yPosition * TILE_HEIGHT) + (TILE_HEIGHT / 2.0);
    }


    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    private void setPosition(double x, double y) {
        setX(x);
        setY(y);
    }
}
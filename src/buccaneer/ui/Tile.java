package buccaneer.ui;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    private boolean isOccupied;
    private final Image image;

    private final Label label;

    /*
    UNDER CONSTRUCTION
     */

    public Tile(double tileHeight, double tileWidth, double xPosition, double yPosition, String hexValueColor) {
        label = new Label();

        setHeight(tileHeight);
        setWidth(tileWidth);
        setX(xPosition);
        setY(yPosition);
        relocate(xPosition * tileWidth, yPosition * tileWidth);


        image = new Image("buccaneer/ui/graphics/boats/blue_boat.png");

        ImageView imageView = new ImageView(image);

        imageView.setFitHeight(35);
        imageView.setFitWidth(35);

        label.setGraphic(imageView);

        setStyle("-fx-stroke: green;-fx-stroke-width: 4;-fx-background-color: " + hexValueColor);
    }

    public Label ship() {
        return label;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
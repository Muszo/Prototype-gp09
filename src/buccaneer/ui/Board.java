package buccaneer.ui;

import buccaneer.java.Settings;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Board {

    private static final int BOARD_HEIGHT = 20;
    private static final int BOARD_WIDTH = 20;


    private final Pane pane;


    private final Tile[][] tiles;


    public Board() {
        this.pane = new Pane();
        this.tiles = new Tile[BOARD_WIDTH][BOARD_HEIGHT];


        for (int yPosition = 0; yPosition < BOARD_HEIGHT; yPosition++) {
            for (int xPosition = 0; xPosition < BOARD_WIDTH; xPosition++) {

                this.tiles[xPosition][yPosition] = new Tile(xPosition, yPosition, Settings.LIGHT_BROWN_COLOR_HEX_VALUE);
                this.pane.getChildren().add(tiles[xPosition][yPosition]);
            }

        }

        Label label = new Label("x");
        label.setLayoutX(tiles[5][5].getCenterX());
        label.setLayoutY(tiles[5][5].getCenterY());
        label.setTextFill(Color.color(1, 0, 0));
        pane.getChildren().add(label);

    }

    public Pane getPane() {
        return pane;
    }


}

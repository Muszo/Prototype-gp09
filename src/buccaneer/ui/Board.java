package buccaneer.ui;

import buccaneer.java.Settings;
import javafx.scene.layout.Pane;

public class Board {

    private static final int BOARD_HEIGHT = 20;
    private static final int BOARD_WIDTH = 20;

    private static final int TILE_HEIGHT = 35;
    private static final int TILE_WIDTH = 35;
    private final Pane pane;


    private final Tile[][] tiles;


    public Board() {
        this.pane = new Pane();
        this.pane.setPrefSize(600, 600);
        this.pane.setMaxWidth(600);
        this.pane.setMaxHeight(600);
        this.pane.setLayoutX(20);
        this.pane.setLayoutY(20);
        this.tiles = new Tile[BOARD_WIDTH][BOARD_HEIGHT];


        for (int yPosition = 0; yPosition < BOARD_HEIGHT; yPosition++) {
            for (int xPosition = 0; xPosition < BOARD_WIDTH; xPosition++) {

                this.tiles[xPosition][yPosition] = new Tile(TILE_HEIGHT, TILE_WIDTH,
                        xPosition, yPosition,
                        Settings.BLACK_COLOR_HEX_VALUE);
                this.pane.getChildren().add(tiles[xPosition][yPosition]);
            }

        }
        this.pane.getChildren().add(tiles[4][4].ship());

    }

    public Pane getPane() {
        return pane;
    }


}

package buccaneer.ui;

import buccaneer.java.Settings;
import javafx.scene.layout.VBox;

public class PlayerBoard extends VBox {

    private static final double MODULE_WIDTH = 200;
    private static final double MODULE_HEIGHT = 50;
    private static final int SPACING = 3;
    private static final NameModule PLAYERS = new NameModule("PLAYERS", MODULE_HEIGHT, MODULE_WIDTH);


    public PlayerBoard(String[] playerNames) {
        NameModule[] names = new NameModule[Settings.NUMBER_OF_PLAYERS];

        PLAYERS.centerLabelInModule();
        PLAYERS.setFrameVisible(true);
        PLAYERS.setFrameColor(Settings.ORANGE_COLOR_HEX_VALUE);

        //loop assigns names to NameModule
        for (int nameIterator = 0; nameIterator < Settings.NUMBER_OF_PLAYERS; nameIterator++) {
            names[nameIterator] = new NameModule(playerNames[nameIterator], MODULE_HEIGHT, MODULE_WIDTH);
        }
        names[0].setFrameVisible(true);
        setStyle("-fx-background-color: " + Settings.BLACK_COLOR_HEX_VALUE);
        setSpacing(SPACING);
        getChildren().add(PLAYERS);
        getChildren().addAll(names);
        setMaxSize(200, 200);
        setStyle("-fx-background-color: " + Settings.BLACK_COLOR_HEX_VALUE);
    }


}

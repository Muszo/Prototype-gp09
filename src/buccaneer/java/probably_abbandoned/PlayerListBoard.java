package buccaneer.java.probably_abbandoned;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class PlayerListBoard {

    private final static double PANE_WIDTH = 200;
    private final static double PANE_HEIGHT = 400;
    private final static double PLAYERS_LABEL_X_POSITION = (PANE_WIDTH / 2) - 20;
    private final static double PLAYERS_LABEL_Y_POSITION = (PANE_HEIGHT / 8) - 30;

    private final static double FRAME_WIDTH = PANE_WIDTH;

    private final static double FRAME_HEIGHT = (PANE_HEIGHT / 4) - 50;


    @FXML
    private static final Label PLAYERS = new Label("PLAYERS");
    private String[] playerNames;

    @FXML
    private Label[] names;


    @FXML
    private Pane pane;

    @FXML
    private Rectangle frame;


    public PlayerListBoard(String[] playerNames) {
        this.pane = new Pane();
        this.playerNames = playerNames;
        this.names = new Label[4]; //TODO number of players constant
        this.frame = new Rectangle(FRAME_WIDTH, FRAME_HEIGHT);

        PLAYERS.setLayoutX(PLAYERS_LABEL_X_POSITION);
        PLAYERS.setLayoutY(PLAYERS_LABEL_Y_POSITION);
        setupLabels(playerNames);
        setupFrame();

        this.pane.setPrefSize(PANE_HEIGHT, PANE_WIDTH);

        //this.pane.setMinSize(PANE_WIDTH, PANE_HEIGHT);
        this.pane.setMaxSize(PANE_WIDTH, PANE_HEIGHT);

        this.pane.setStyle("-fx-background-color: #d0b494");

        pane.getChildren().add(PLAYERS);
        pane.getChildren().add(frame);
        pane.getChildren().addAll(names);
    }


    public void updateFrame() {

    }

    public void updateFrame(String name) {

    }

    private void setupFrame() {
        this.frame.setLayoutY(names[1].getLayoutY() - 20);
        this.frame.setStyle("-fx-fill: transparent; -fx-stroke: red; -fx-stroke-width: 10;");
    }

    private void setupLabels(String[] playerNames) {
        for (int i = 0; i < playerNames.length; i++) {
            this.names[i] = new Label(playerNames[i]);
            this.names[i].setLayoutX(PANE_WIDTH / 80);
            this.names[i].setLayoutY(80 * (i + 1));
        }
    }

    public Pane getPane() {
        return pane;
    }

}
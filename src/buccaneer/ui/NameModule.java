package buccaneer.ui;

import buccaneer.java.Settings;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class NameModule extends Pane {

    private final double moduleHeight;
    private final double moduleWidth;
    private final Label name;
    private final Rectangle frame;


    public NameModule(String playerName, double moduleHeight, double moduleWidth) {

        this.moduleHeight = moduleHeight;
        this.moduleWidth = moduleWidth;

        this.name = new Label(playerName);


        this.name.setLayoutX(moduleHeight / 10);
        this.name.setLayoutY((moduleWidth / 8) - 10);

        this.frame = new Rectangle(moduleWidth, moduleHeight);
        this.frame.setVisible(false);
        this.frame.setStyle("-fx-fill: transparent;-fx-stroke-width: 5;-fx-stroke: red");

        setStyle("-fx-background-color:" + Settings.LIGHT_BROWN_COLOR_HEX_VALUE);
        setMinSize(moduleWidth, moduleHeight);
        setMaxSize(moduleWidth, moduleHeight);

        getChildren().add(this.frame);
        getChildren().add(this.name);

    }


    //TODO centering needs to be improved
    public void centerLabelInModule() {
        this.name.setLayoutX((this.moduleWidth / 2) - (moduleWidth / 10));
        this.name.setLayoutY(this.moduleHeight / 2);
    }

    public String getPlayerName() {
        return name.getText();
    }

    public void setFrameVisible(boolean visibility) {
        frame.setVisible(visibility);
    }

    public void setFrameColor(String hexVal) {
        this.frame.setStyle("-fx-fill: transparent;-fx-stroke-width: 5;-fx-stroke: " + hexVal);
    }

}
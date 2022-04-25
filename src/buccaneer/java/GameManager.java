package buccaneer.java;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class GameManager extends Application {
    static final double SCENE_HEIGHT = 1000;
    static final double SCENE_WIDTH = 1000;

    UserInterfaceManager userInterfaceManager;

    List<String> playerNames;

    public GameManager() {
        this.userInterfaceManager = new UserInterfaceManager();
        playerNames = new ArrayList<>();
    }

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(this.userInterfaceManager.getRoot(), SCENE_HEIGHT, SCENE_WIDTH);

        getPlayerNames();
        userInterfaceManager.assignNamesToPlayerBoard(playerNames);
        stage.setScene(scene);
        stage.show();
    }

    public void getPlayerNames() {
        while (playerNames.size() < 4) {
            String name = this.userInterfaceManager.playerEnterNameBox();

            if (isNameCorrectLength(name) && areNameCharactersValid(name)) {
                playerNames.add(name);
                System.out.println(name + "\n list size: " + playerNames.size());
            }
        }
    }


    /**
     * Checks if the name is too long
     *
     * @param name - name given by player
     * @return false if the name is too long
     */


    private boolean isNameCorrectLength(String name) {
        return name.length() < 15;
    }

    /**
     * Checks if the name does not contain special characters or numbers
     *
     * @param name - name given by player
     * @return false if the name is invalid
     */
    private boolean areNameCharactersValid(String name) {
        String pattern = "^[a-z]+$";
        return name.matches(pattern);
    }
}

package buccaneer.java;

import buccaneer.ui.Board;
import buccaneer.ui.PlayerNameBoard;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;

import java.util.List;

public class UserInterfaceManager {
    private PlayerNameBoard playerNameBoard;

    private final Board board;
    private final BorderPane root;


/*
      private final Image blueBoat;
      private final Image greenBoat;
      private final Image redBoat;
      private final Image yellowBoat;6

 */

    public UserInterfaceManager() {
        this.board = new Board();
        this.root = new BorderPane();


    }


    public void generateBoard() {

        this.root.setLeft(board.getPane());
    }


    //TODO fix to return string perhaps?
    public void displayDuplicateNameMessage(String name) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("TITLE");
        alert.headerTextProperty().unbind();

        String newName = name + "1";
        String message = "Another player already has the name " + name.toUpperCase() +
                ", your name will be " + newName + ". Click ont the tick to confirm this or click the red cross " +
                "to re-enter a different name";
        alert.setContentText(message);
        alert.showAndWait();

    }

    public void assignNamesToPlayerBoard(List<String> names) {
        String[] arrayOfNames = names.toArray(new String[0]);
        this.playerNameBoard = new PlayerNameBoard(arrayOfNames);
        this.root.setRight(playerNameBoard);

    }

    //TODO error alert type for duplicates and incorrect names

    public String playerEnterNameBox() {
        TextInputDialog textInputDialog = new TextInputDialog("Your name");
        // textInputDialog.getEditor().clear();
        textInputDialog.showAndWait();
        return textInputDialog.getEditor().getText();
    }


    public BorderPane getRoot() {
        return root;
    }
}
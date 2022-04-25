package buccaneer.java;

import buccaneer.ui.PlayerBoard;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;

import java.util.List;

public class UserInterfaceManager {
    private PlayerBoard playerBoard;
    private final BorderPane root;


/*
      private final Image blueBoat;
      private final Image greenBoat;
      private final Image redBoat;
      private final Image yellowBoat;6

 */

    public UserInterfaceManager() {

        this.root = new BorderPane();


    }



    public void assignNamesToPlayerBoard(List<String> names) {
        String[] arrayOfNames = names.toArray(new String[0]);
        this.playerBoard = new PlayerBoard(arrayOfNames);
        this.root.setRight(playerBoard);

    }

    //TODO error alert type for duplicates and incorrect names

    public String playerEnterNameBox() {
        TextInputDialog textInputDialog = new TextInputDialog("Your name");
        textInputDialog.getEditor().clear();
        textInputDialog.showAndWait();
        return textInputDialog.getEditor().getText();
    }


    public BorderPane getRoot() {
        return root;
    }
}
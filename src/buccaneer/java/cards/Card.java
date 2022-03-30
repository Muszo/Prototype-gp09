package buccaneer.java.cards;


import javafx.scene.image.Image;


/*
this whole class should be package protected
 */

public class Card {
    private String name;
    private int value;
    private Image image;

    protected Card(String name, int value, Image image) {
        this.name = name;
        this.value = value;
        this.image = image;
    }

    protected Card(String name, int value) {
        this.name = name;
        this.value = value;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}

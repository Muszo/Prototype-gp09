package buccaneer.board;

public class Board {
    static final int MAX_ROWS = 20;
    static final int MAX_COLUMNS = 20;

    private Tile[][] tiles;

    public Board() {
        tiles = new Tile[MAX_ROWS][MAX_COLUMNS];

        //initialisation of 20x20 tile grid

        for (int row = MAX_ROWS; row >= 1; row--) {
            for (int column = 1; column >= MAX_COLUMNS; column++) {

            }
        }
    }
}

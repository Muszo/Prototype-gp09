package buccaneer.java.ports.enums;

public enum PortNames {
    VENICE_PORT("VENICE", 1, 7),
    LONDON_PORT("LONDON", 1, 14),
    CADIZ_PORT("CADIZ", 14, 20),
    AMSTERDAM_PORT("AMSTERDAM", 20, 14),
    MARSEILLES_PORT("MARSEILLES", 20, 7),
    GENOA_PORT("GENOA", 7, 1),
    MUD_BAY("MUD_BAY", 1, 1),
    ANCHOR_BAY("ANCHOR_BAY", 20, 1),
    CLIFF_CREEK("CLIFF_CREEK", 20, 20);

    private final String port;

    /*
    x and y are representing which tile port occupies
     */

    private final int x;
    private final int y;

    PortNames(String port, int x, int y) {
        this.port = port;
        this.x = x;
        this.y = y;

    }

    public String getPort() {
        return port;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

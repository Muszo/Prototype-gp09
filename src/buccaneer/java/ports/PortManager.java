package buccaneer.java.ports;

import buccaneer.java.ports.enums.PortNames;

public class PortManager {
    Port[] ports;

    public PortManager() {
        ports = new Port[PortNames.values().length];
    }


}

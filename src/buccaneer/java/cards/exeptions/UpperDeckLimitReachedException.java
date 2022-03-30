package buccaneer.java.cards.exeptions;

public class UpperDeckLimitReachedException extends RuntimeException {
    public UpperDeckLimitReachedException(String message) {
        super(message);
    }
}

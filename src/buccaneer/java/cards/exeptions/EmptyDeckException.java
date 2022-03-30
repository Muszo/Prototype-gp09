package buccaneer.java.cards.exeptions;

public class EmptyDeckException extends RuntimeException{
    public EmptyDeckException(String message){
        super(message);
    }
}

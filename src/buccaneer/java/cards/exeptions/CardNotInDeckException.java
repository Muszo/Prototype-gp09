package buccaneer.java.cards.exeptions;

public class CardNotInDeckException extends RuntimeException{
    public CardNotInDeckException(String message){
        super(message);
    }
}

package ShoppingCartExercise;

public class NegativeCountException extends Exception {

    public NegativeCountException(String message){
        super(message);
    }

    public NegativeCountException(String message, Throwable exception){
        super(message, exception);
    }
}

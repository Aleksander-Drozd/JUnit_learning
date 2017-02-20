package ShoppingCartExercise;

public class NoSuchItemException extends Exception {

    public NoSuchItemException(String message){
        super(message);
    }

    public NoSuchItemException(String message, Throwable exception){
        super(message, exception);
    }
}

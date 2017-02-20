public class StackEmptyException extends Exception {

    public StackEmptyException(String message){
        super(message);
    }

    public StackEmptyException(String message, Throwable throwable){
        super(message, throwable);
    }
}


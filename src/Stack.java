import java.util.ArrayList;
import java.util.List;

public class Stack implements StackExercise{

    private List<String> list;

    public Stack() {
        list = new ArrayList<>();
    }

    @Override
    public String pop() throws StackEmptyException {
        return null;
    }

    @Override
    public void push(String item) {

    }

    @Override
    public String top() throws StackEmptyException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}


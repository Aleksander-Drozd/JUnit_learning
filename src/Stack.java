import java.util.ArrayList;
import java.util.List;

public class Stack implements StackExercise{

    private List<String> list;

    public Stack() {
        list = new ArrayList<>();
    }

    @Override
    public String pop() throws StackEmptyException {
        String item = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        return item;
    }

    @Override
    public void push(String item) {
        list.add(item);
    }

    @Override
    public String top() throws StackEmptyException {
        return list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}


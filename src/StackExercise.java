public interface StackExercise {

    public String pop() throws StackEmptyException;
    public void push(String item);
    public String top() throws StackEmptyException;
    public boolean isEmpty();
}

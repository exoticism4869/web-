import java.util.Vector;

class TodoItem {
    private String name;
    private boolean done;

    private TodoItem() { }
    TodoItem(String name) {
        this.name = name;
        this.done = false;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class TodoList {
    private Vector<TodoItem> todoItems = new Vector<TodoItem>();

    public TodoItem get(int index) {
        return todoItems.get(index);
    }
    public int size() {
        return todoItems.size();
    }
    public void add(String todo) {
        for (TodoItem t : todoItems) {
            if (t.toString().equals(todo)) {
                return;
            }
        }
        todoItems.add(new TodoItem(todo));
    }

    public static void main(String[] args) {

    }
}

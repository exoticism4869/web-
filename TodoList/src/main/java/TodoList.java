import java.util.Vector;

class TodoItem {
    private String name;
    public boolean isChecked;

    private TodoItem() { }
    TodoItem(String name) {
        this.name = name;
        this.isChecked = false;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class TodoList {
    private Vector<TodoItem> todoItems = new Vector<TodoItem>();

    public boolean check(String todo) {
        TodoItem t = get(todo);
        t.isChecked = !t.isChecked;
        return t.isChecked;
    }

    public Vector<TodoItem> getTodoItems() {
        return todoItems;
    }
    public TodoItem get(int index) {
        return todoItems.get(index);
    }
    public TodoItem get(String todo) {
        for (TodoItem t : todoItems) {
            if (t.toString().equals(todo)) {
                return t;
            }
        }
        return null;
    }
    public int size() {
        return todoItems.size();
    }
    public boolean add(String todo) {
        if (this.get(todo) != null) {
            return false;
        }
        todoItems.add(new TodoItem(todo));
        return true;
    }
    public boolean delete(String todo) {
        TodoItem t = this.get(todo);
        if (t == null) {
            return false;
        }
        todoItems.remove(t);
        return true;
    }
    public static void main(String[] args) {

    }
}

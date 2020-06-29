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
    //1.
    public boolean check(String todo) {
        TodoItem t = get(todo);
        t.isChecked = !t.isChecked;
        return t.isChecked;
    }
    //2.
    public Vector<TodoItem> getTodoItems() {
        return this.todoItems;
    }
    //3.
    public TodoItem get(int index) {
        return this.todoItems.get(index);
    }
    //4.
    public TodoItem get(String todo) {
        for (TodoItem t : this.todoItems) {
            if (t.toString().equals(todo)) {
                return t;
            }
        }
        return null;
    }
    //5.
    public int size() {
        return this.todoItems.size();
    }
    //6.
    public boolean add(String todo) {
        if (this.get(todo) != null) {
            return false;
        }
        this.todoItems.add(new TodoItem(todo));
        return true;
    }
    //7.
    public boolean delete(String todo) {
        TodoItem t = this.get(todo);
        if (t == null) {
            return false;
        }
        this.todoItems.remove(t);
        return true;
    }
    //main.
    public static void main(String[] args) {

    }
}

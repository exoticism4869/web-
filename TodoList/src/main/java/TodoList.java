import java.util.Scanner;
import java.util.Vector;

class TodoItem {
    private String name;
    public boolean isChecked;

    private TodoItem() { }
    TodoItem(String name) {
        this.name = name;
        this.isChecked = false;
    }

    //@Override
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
        TodoList todoList = new TodoList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            for (TodoItem t : todoList.getTodoItems()) {
                if (t == null) break;
                System.out.print(t);
                if (t.isChecked) {
                    System.out.println("\t(done)");
                }
                else {
                    System.out.println("");
                }
            }
            System.out.println("");
            System.out.println("1. add Todo");
            System.out.println("2. delete Todo");
            System.out.println("3. check Todo");
            String choice = sc.nextLine();
            if (choice.equals("1")) {
                System.out.print("Todo name: ");
                todoList.add(sc.nextLine());
            }
            else if (choice.equals("2")) {
                System.out.print("Todo name: ");
                todoList.delete(sc.nextLine());
            }
            else if (choice.equals("3")) {
                System.out.print("Todo name: ");
                todoList.check(sc.nextLine());
            }
        }
    }
}

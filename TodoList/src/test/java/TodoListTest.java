import org.junit.Test;

public class TodoListTest {
    @Test
    public void shouldAddNewItem() {

        TodoList todoList = new TodoList();
        String todo = "add test";
        todoList.add(todo);

        int lastIndex = todoList.size() - 1;
        TodoItem lastItem = todoList.get(lastIndex);
        assert lastItem.toString().equals(todo);
    }

    @Test
    public void shouldDeleteItem() {


        TodoList todoList = new TodoList();
        String todo = "item to delete";
        todoList.add(todo);

        todoList.delete(todo);

        for (TodoItem item : todoList) {
            assert !item.toString().equals(todo);
        }
    }

    @Test
    public void shouldCheckItem() {

        TodoList todoList = new TodoList();
        String todo = "a completed item";
        todoList.add(todo);

        todoList.check(todo);

        TodoItem item = todoList.get(0);
        assert item.isChecked;
    }
}

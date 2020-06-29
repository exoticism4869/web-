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

        for (TodoItem item : todoList.getTodoItems()) {
            assert !item.toString().equals(todo);
        }
    }

    @Test
    public void shouldCheckItem() {
        /*
        说明：测试完成代办事项方法check(String)。
              本测试创建TodoList实例，调用add(String)方法添加事项。
              通过check(String)完成内容与check()方法获得参数相同的事项。

              通过get()方法获取元素，检查TodoItem的isChecked属性，判断是否正确。
         */
        TodoList todoList = new TodoList();
        String todo = "a completed item";
        todoList.add(todo);

        todoList.check(todo);

        TodoItem item = todoList.get(0);
        assert item.isChecked;
    }
}

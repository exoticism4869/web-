import org.junit.Test;

public class TodoListTest {
    @Test
    public void shouldAddNewItem() {
        /*
        说明：TodoList为需要实现的类，该类包含add方法用于添加事项。
              本测试创建TodoList实例，调用add(String)方法添加事项。

              为测试添加是否成功，本测试调用TodoList中get(int)方法，获取类型为TodoItem的元素lastItem，比较与添加元素是否相同。
         */
        TodoList todoList = new TodoList();
        String todo = "add test";
        todoList.add(todo);

        int lastIndex = todoList.size() - 1;
        TodoItem lastItem = todoList.get(lastIndex);
        assert lastItem.toString().equals(todo);
    }

    @Test
    public void shouldDeleteItem() {
        /*
        说明：测试删除代办事项方法delete(String)。
              本测试创建TodoList实例，调用add(String)方法添加事项。
              通过delete(String)删除内容与delete()方法获得参数相同的事项。
              遍历todoList元素，判断删除是否成功。
         */

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

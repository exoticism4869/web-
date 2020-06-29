import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TodoListTest {
    @Test
    //1.
    public void shouldReturnTrueWhenGiveT_Check(){
        TodoList todoList = new TodoList();
        String todo = "a completed item";
        todoList.add(todo);

        boolean f = todoList.check(todo);
        Assert.assertTrue(f);
    }

    @Test
    //5.
    public void shouldReturn3_Size(){
        TodoList todoList = new TodoList();
        for (int i = 0; i < 3; i++) {
            todoList.add("test" + i);
        }
        long l = todoList.size();
        Assert.assertEquals(3, l);
    }

    @Test
    //6.&3.
    public void successAddNewItemOrNot() {

        TodoList todoList = new TodoList();
        String todo = "add test";
        todoList.add(todo);

        int lastIndex = 0;
        TodoItem lastItem = todoList.get(lastIndex);
        boolean b = todo.equals(lastItem.toString());
        Assert.assertTrue(b);
    }

    @Test
    //7.&4.
    public void successDeleteItemOrNot() {
        TodoList todoList = new TodoList();
        String todo = "item to delete";
        todoList.add(todo);

        todoList.delete(todo);

        TodoItem t = todoList.get(todo);
        boolean b = false;
        if(t == null) b = true;
        Assert.assertTrue(b);
    }
}

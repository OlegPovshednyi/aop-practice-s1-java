package h14;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class task2test {
    @Test
    void testTask2() {
        Task2 task2 = new Task2();
        task2.push(1);
        task2.push(2);

        assertEquals(1, task2.peek());
        assertEquals(1, task2.pop());
        assertEquals(2, task2.peek());
        assertEquals(2, task2.pop());

        assertTrue(task2.empty());
    }
}

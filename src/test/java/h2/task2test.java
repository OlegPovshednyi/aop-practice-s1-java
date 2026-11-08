package h2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class task2test {
    @Test
    void testTask2(){
        Task2 task2=new Task2();
        assertTrue(task2.isSameAfterReversals(1));
        assertTrue(task2.isSameAfterReversals(14));
        assertTrue(task2.isSameAfterReversals(141));
        assertTrue(task2.isSameAfterReversals(14100));
        assertTrue(task2.isSameAfterReversals(0));
        assertTrue(task2.isSameAfterReversals(1400000000));
    }
}

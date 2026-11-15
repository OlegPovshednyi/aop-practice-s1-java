package h13;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class task2test {
    @Test
    void testtask2(){
        Task2 task2=new Task2();
        assertEquals(3,task2.maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));
        assertEquals(3,task2.maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
        assertEquals(4,task2.maximumCount(new int[]{5, 20, 66, 1314}));
        assertEquals(3, task2.maximumCount(new int[]{-5, -3, -1}));
        assertEquals(0, task2.maximumCount(new int[]{0, 0, 0}));
    }
}

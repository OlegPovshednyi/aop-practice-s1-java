package h11;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class task2test {
    @Test
    void testtask2(){
        Task2 task2 = new Task2();

        assertEquals(3, task2.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, task2.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(1, task2.majorityElement(new int[]{1}));
        assertEquals(5, task2.majorityElement(new int[]{5, 5, 5, 2, 3}));
        assertEquals(-1, task2.majorityElement(new int[]{-1, -1, 2, -1, 3}));
        assertEquals(4, task2.majorityElement(new int[]{4, 4, 2, 4, 3, 4, 4}));
        assertEquals(7, task2.majorityElement(new int[]{7, 2, 7, 3, 7, 7, 1}));
    }
}

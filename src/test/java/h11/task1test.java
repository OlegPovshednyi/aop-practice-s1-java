package h11;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class task1test {
@Test
        void testtask1(){

    Task1 task1 = new Task1();

    assertEquals(2, task1.missingNumber(new int[]{3, 0, 1}));
    assertEquals(2, task1.missingNumber(new int[]{0, 1}));
    assertEquals(8, task1.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    assertEquals(0, task1.missingNumber(new int[]{1}));
    assertEquals(1, task1.missingNumber(new int[]{0}));
    assertEquals(3, task1.missingNumber(new int[]{0, 1, 2}));
    assertEquals(2, task1.missingNumber(new int[]{4, 3, 0, 1}));
}}

package h5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class task1test {
@Test
        void testtask1(){
    Task1 task1 = new Task1();

    assertEquals(34, task1.maxProductDifference(
            new int[]{5, 6, 2, 7, 4}));

    assertEquals(64, task1.maxProductDifference(
            new int[]{4, 2, 5, 9, 7, 4, 8}));

    assertEquals(0, task1.maxProductDifference(
            new int[]{1, 1, 1, 1}));

    assertEquals(15, task1.maxProductDifference(
            new int[]{1, 2, 3, 4}));

    assertEquals(99, task1.maxProductDifference(
            new int[]{10, 1, 9, 2}));

    assertEquals(24, task1.maxProductDifference(
            new int[]{-1, 2, 3, 4}));
}}

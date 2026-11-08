package h3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class task2test {
  @Test
    void testtask2()

    {
       Task2 task2=new Task2();
        assertEquals(10, task2.differenceOfSums(7, 3));
        assertEquals(3, task2.differenceOfSums(6, 3));
        assertEquals(-6, task2.differenceOfSums(3, 1));
        assertEquals(15, task2.differenceOfSums(5, 6));
      assertEquals(-1, task2.differenceOfSums(1, 1));


        assertEquals(-4, task2.differenceOfSums(4, 2));


        assertEquals(21, task2.differenceOfSums(6, 10));


        assertEquals(-15, task2.differenceOfSums(5, 1));


        assertEquals(19, task2.differenceOfSums(5, 3));
    }
}

package h7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class task2test {
   @Test
           void testtask2(){

    Task2 task2 = new Task2();

    assertEquals(0, task2.numberOfSteps(0));

    assertEquals(1, task2.numberOfSteps(1));

    assertEquals(6, task2.numberOfSteps(14));

    assertEquals(4, task2.numberOfSteps(8));

    assertEquals(12, task2.numberOfSteps(123));

    assertEquals(7, task2.numberOfSteps(7));

    assertEquals(2, task2.numberOfSteps(2));

    assertEquals(3, task2.numberOfSteps(3));

    assertEquals(31, task2.numberOfSteps(1000000));
}}

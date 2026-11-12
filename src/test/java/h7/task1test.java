package h7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

public class task1test {
  @Test
  void testtask1() {
    Task1 task1 = new Task1();

    assertEquals(List.of("1", "2", "Fizz"), task1.fizzBuzz(3));

    assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), task1.fizzBuzz(5));

    assertEquals(
        List.of(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz"),
        task1.fizzBuzz(15));

    assertEquals(List.of("1"), task1.fizzBuzz(1));

    assertEquals(
        List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"),
        task1.fizzBuzz(10));
  }
}

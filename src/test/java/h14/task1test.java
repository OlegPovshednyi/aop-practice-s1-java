package h14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task1test {

  @Test
  void testTask1() {
    Task1 task1 = new Task1();
    assertEquals("ca", task1.removeDuplicates("abbaca"));
    assertEquals("ay", task1.removeDuplicates("azxxzy"));
    assertEquals("abcdef", task1.removeDuplicates("abcdef"));
    assertEquals("", task1.removeDuplicates("aaaa"));
    assertEquals("", task1.removeDuplicates(""));
  }
}

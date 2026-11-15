package h13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class task1test {

    @Test
    void testTask1() {
        Task1 task1 = new Task1();
     assertEquals(4,task1.firstBadVersion(5));
        assertEquals(1,task1.firstBadVersion(1));
        assertEquals(10,task1.firstBadVersion(10));
    }
}
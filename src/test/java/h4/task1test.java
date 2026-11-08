package h4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class task1test {
    @Test
    void testtask1(){
     Task1 task1=new Task1();
        assertEquals(2, task1.hammingDistance(1, 4));

        assertEquals(0, task1.hammingDistance(5, 5));


        assertEquals(1, task1.hammingDistance(0, 1));


        assertEquals(4, task1.hammingDistance(0, 15));


        assertEquals(3, task1.hammingDistance(3, 8));


        assertEquals(31, task1.hammingDistance(0, 2147483647));


        assertEquals(1, task1.hammingDistance(2147483647, 2147483646));
    }
}

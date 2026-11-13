package h12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class task2test {

    @Test
    void testtask2() {
        Task2 task2 = new Task2();

        assertArrayEquals(
                new int[] {2, 2, 1, 4, 3, 3, 9, 6, 7, 19},
                task2.relativeSortArray(
                        new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                        new int[] {2, 1, 4, 3, 9, 6}
                )
        );

        assertArrayEquals(
                new int[] {1, 2, 3},
                task2.relativeSortArray(new int[] {3, 1, 2}, new int[] {})
        );

        assertArrayEquals(
                new int[] {1, 1, 2, 2},
                task2.relativeSortArray(new int[] {2, 1, 2, 1}, new int[] {1, 2})
        );

        assertArrayEquals(
                new int[] {5},
                task2.relativeSortArray(new int[] {5}, new int[] {5})
        );
    }
}
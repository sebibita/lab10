import static org.junit.Assert.*;
import org.junit.Test;

import SelectionSort.java.SelectionSort;

public class TestSelectionSort {

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public void testPositive() {
        int[] arr = { 8, 9, 7, 10, 2 };
        int[] sortedArr = { 2, 7, 8, 9, 10 };

        SelectionSort.selectionSort(arr); // Assuming you have a selectionSort method to test

        assertArrayEquals(sortedArr, arr);
    }

    public void testNegative() {
        int[] arr = { -5, -8, -2, -1, -3 };
        int[] sortedArr = { -8, -5, -3, -2, -1 };

        SelectionSort.selectionSort(arr); // Assuming you have a selectionSort method to test

        assertArrayEquals(sortedArr, arr);
    }

    public void testMixed() {
        int[] arr = { 5, -3, 0, 8, -2 };
        int[] sortedArr = { -3, -2, 0, 5, 8 };

        SelectionSort.selectionSort(arr); // Assuming you have a selectionSort method to test

        assertArrayEquals(sortedArr, arr);
    }

    public void testDuplicates() {
        int[] arr = { 4, 2, 4, 1, 3, 2 };
        int[] sortedArr = { 1, 2, 2, 3, 4, 4 };

        SelectionSort.selectionSort(arr); // Assuming you have a selectionSort method to test

        assertArrayEquals(sortedArr, arr);
    }
}
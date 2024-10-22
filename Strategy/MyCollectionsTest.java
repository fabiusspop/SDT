package L02.Strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyCollectionsTest {

     @Test
     public void testSortComparable() {
         Integer[] arr = {3, 1, 4, 1, 5, 9};
         MyCollections.sort(arr);
         Integer[] expected = {1, 1, 3, 4, 5, 9};
         assertArrayEquals (expected, arr);
     }

     @Test
     public void testSortWithComparator() {
         Integer[] arr = {3, 1, 4, 1, 5, 9};
         MyComparator<Integer> comp = new IntegerAscendingComparator();
         MyCollections.sort(arr, comp);
         Integer[] expected = {1, 1, 3, 4, 5, 9};
         assertArrayEquals(expected, arr);

     }

}

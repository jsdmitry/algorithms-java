import org.junit.Assert;
import org.junit.Test;

public class QuickSortTests {
    @Test
    public void SortIntArray() {
        var array = new int[] {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        var expectedArray = new int[] {1, 1, 2, 3, 3, 4, 5, 5, 6, 9};
        QuickSort.Sort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void SortIntArray2() {
        var array = new int[] {20, 19, 18, 1, 6, 7, 8, 9, 16, 17};
        var expectedArray = new int[] {1, 6, 7, 8, 9, 16, 17, 18, 19, 20};
        QuickSort.Sort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void SortSortedArray() {
        var array = new int[] {1, 6, 7, 8, 9, 16, 17, 18};
        var expectedArray = new int[] {1, 6, 7, 8, 9, 16, 17, 18};
        QuickSort.Sort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }

    @Test
    public void SortWithRepeatValues() {
        var array = new int[] {1, 2, 1, 3, 2, 3, 1, 1};
        var expectedArray = new int[] {1, 1, 1, 1, 2, 2, 3, 3};
        QuickSort.Sort(array);
        Assert.assertArrayEquals(expectedArray, array);
    }
}

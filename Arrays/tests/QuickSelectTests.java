import org.junit.Assert;
import org.junit.Test;

public class QuickSelectTests {
    @Test
    public void FindSmallestValueInArray1ForSecondIndex() {
        var array = new int[]{ 2, 13, 3, 45, 10, 65};
        Assert.assertEquals(10, QuickSelect.FindSmallestElement(array, 2));
    }

    @Test
    public void FindSmallestValueInArray1ForFirstIndex() {
        var array = new int[]{ 2, 13, 3, 45, 10, 65};
        Assert.assertEquals(3, QuickSelect.FindSmallestElement(array, 1));
    }

    @Test
    public void FindSmallestValueInArray1ForZeroIndex() {
        var array = new int[]{ 2, 13, 3, 45, 10, 65};
        Assert.assertEquals(2, QuickSelect.FindSmallestElement(array, 0));
    }

    @Test
    public void FindSmallestValueInArray1ForLastIndex() {
        var array = new int[]{ 2, 13, 3, 45, 10, 65};
        Assert.assertEquals(65, QuickSelect.FindSmallestElement(array, 5));
    }

    @Test
    public void FindSmallestValueInArray2ForSecondIndex() {
        var array = new int[]{ 34, 13, 3, 2, 10, 65};
        Assert.assertEquals(10, QuickSelect.FindSmallestElement(array, 2));
    }

    @Test
    public void FindSmallestValueInArray3ForSecondIndex() {
        var array = new int[]{ 2, 3, 5, 99, 10, 65};
        Assert.assertEquals(5, QuickSelect.FindSmallestElement(array, 2));
    }

    @Test
    public void FindSmallestValueInArray4ForThirdIndex() {
        var array = new int[]{ 99, 23, 77, 4, 2, 1};
        Assert.assertEquals(23, QuickSelect.FindSmallestElement(array, 3));
    }
}

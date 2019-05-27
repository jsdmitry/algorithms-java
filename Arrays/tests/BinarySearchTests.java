import org.junit.Test;
import org.junit.Assert;

public class BinarySearchTests {
    private int[] testArray = new int[]{-12, -4, -1, 2, 23, 33, 56};

    @Test
    public void ValueIsFound() {
        Assert.assertEquals(4, BinarySearch.Find(this.testArray, 23));
    }

    @Test
    public void ValueIsNotFoundIfValueMoreLastItem() {
        Assert.assertEquals(-1, BinarySearch.Find(this.testArray, 77));
    }

    @Test
    public void ValueIsNotFoundIfValueLessFirstItem() {
        Assert.assertEquals(-1, BinarySearch.Find(this.testArray, -23));
    }

    @Test
    public void FirstValueIsFound() {
        Assert.assertEquals(0, BinarySearch.Find(this.testArray, -12));
    }

    @Test
    public void LastValueIsFound() {
        Assert.assertEquals(6, BinarySearch.Find(this.testArray, 56));
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution799Test {

    @Test
    public void test00() {
        Solution799 solution799 = new Solution799();
        Assertions.assertEquals(10000, 10000 * solution799.champagneTower(1, 0, 0));
    }

    @Test
    public void test01() {
        Solution799 solution799 = new Solution799();
        Assertions.assertEquals(5000, 10000 * solution799.champagneTower(2, 1, 1));
    }

    @Test
    public void test02() {
        Solution799 solution799 = new Solution799();
        Assertions.assertEquals(10000, 10000 * solution799.champagneTower(100000009, 33, 17));
    }

    @Test
    public void test03() {
        Solution799 solution799 = new Solution799();
        Assertions.assertEquals(1875, 10000 * solution799.champagneTower(25, 6, 1));
    }
}

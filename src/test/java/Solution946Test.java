import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution946Test {

    @Test
    public void test00() {
        Solution946 solution946 = new Solution946();
        Assertions.assertTrue(
                solution946.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }

    @Test
    public void test01() {
        Solution946 solution946 = new Solution946();
        Assertions.assertFalse(
                solution946.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
    }
}

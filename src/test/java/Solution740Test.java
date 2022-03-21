import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution740Test {

    @Test
    public void test00() {
        Solution740 solution740 = new Solution740();
        Assertions.assertEquals(6, solution740.deleteAndEarn(new int[]{3, 4, 2}));
    }

    @Test
    public void test01() {
        Solution740 solution740 = new Solution740();
        Assertions.assertEquals(9, solution740.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }

    @Test
    public void test02() {
        Solution740 solution740 = new Solution740();
        Assertions.assertEquals(18, solution740.deleteAndEarn(new int[]{1, 1, 1, 2, 4, 5, 5, 5, 6}));
    }
}

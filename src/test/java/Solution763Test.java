import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Solution763Test {

    @Test
    public void test01() {
        Solution763 solution763 = new Solution763();
        List<Integer> res = solution763.partitionLabels("abc");
        Assertions.assertEquals(3, res.size());
        Assertions.assertEquals(1, res.get(0));
        Assertions.assertEquals(1, res.get(1));
        Assertions.assertEquals(1, res.get(2));
    }

    @Test
    public void test02() {
        Solution763 solution763 = new Solution763();
        List<Integer> res = solution763.partitionLabels("abcad");
        Assertions.assertEquals(2, res.size());
        Assertions.assertEquals(4, res.get(0));
        Assertions.assertEquals(1, res.get(1));
    }

    @Test
    public void test03() {
        Solution763 solution763 = new Solution763();
        List<Integer> res = solution763.partitionLabels("ababcbacadefegdehijhklij");
        Assertions.assertEquals(3, res.size());
        Assertions.assertEquals(9, res.get(0));
        Assertions.assertEquals(7, res.get(1));
        Assertions.assertEquals(8, res.get(2));
    }

    @Test
    public void test04() {
        Solution763 solution763 = new Solution763();
        List<Integer> res = solution763.partitionLabels("eccbbbbdec");
        Assertions.assertEquals(1, res.size());
        Assertions.assertEquals(10, res.get(0));
    }
}

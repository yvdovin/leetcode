import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution71Test {

    @Test
    public void test00() {
        Solution71 solution71 = new Solution71();
        Assertions.assertEquals("/home", solution71.simplifyPath("/home/"));
    }

    @Test
    public void test01() {
        Solution71 solution71 = new Solution71();
        Assertions.assertEquals("/", solution71.simplifyPath("/../"));
    }

    @Test
    public void test02() {
        Solution71 solution71 = new Solution71();
        Assertions.assertEquals("/home/foo", solution71.simplifyPath("/home//foo/"));
    }

    @Test
    public void test03() {
        Solution71 solution71 = new Solution71();
        Assertions.assertEquals("/home/foo", solution71.simplifyPath("/home///foo/"));
    }

    @Test
    public void test04() {
        Solution71 solution71 = new Solution71();
        Assertions.assertEquals("/", solution71.simplifyPath("/"));
    }

    @Test
    public void test05() {
        Solution71 solution71 = new Solution71();
        Assertions.assertEquals("/...", solution71.simplifyPath("/..."));
    }
}

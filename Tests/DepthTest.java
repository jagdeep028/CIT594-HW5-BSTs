//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DepthTest {
    protected BinarySearchTree<String> tree;

    public DepthTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.tree = new BinarySearchTree();
        this.tree.add("dog");
        this.tree.add("cat");
        this.tree.add("pig");
    }

    @Test
    public void testRoot() {
        try {
            int var1 = this.tree.depth("dog");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is root", 0L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is root: " + var2);
        }

    }

    @Test
    public void testLeftChildOfRoot() {
        try {
            int var1 = this.tree.depth("cat");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is left child of root", 1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is left child of root: " + var2);
        }

    }

    @Test
    public void testRightChildOfRoot() {
        try {
            int var1 = this.tree.depth("pig");
            Assert.assertEquals("BinarySearchTree.depth returns incorrect value when input value is right child of root", 1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.depth throws exception when input is right child of root: " + var2);
        }

    }
}

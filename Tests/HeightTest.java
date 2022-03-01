//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeightTest {
    protected BinarySearchTree<String> tree;

    public HeightTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.tree = new BinarySearchTree();
        this.tree.add("dog");
        this.tree.add("cat");
        this.tree.add("pig");
    }

    @Test
    public void testLeaf() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root.left);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is leaf", 0L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is leaf: " + var2);
        }

    }

    @Test
    public void testParentOfLeaves() {
        try {
            int var1 = BinarySearchTree.height(this.tree.root);
            Assert.assertEquals("BinarySearchTree.height returns incorrect value when input node is parent of two leaf nodes", 1L, (long)var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.height throws exception when input node is parent of two leaf nodes: " + var2);
        }

    }
}

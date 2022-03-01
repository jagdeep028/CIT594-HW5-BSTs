//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsBalancedNodeTest {
    protected BinarySearchTree<String> tree;

    public IsBalancedNodeTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.tree = new BinarySearchTree();
        this.tree.add("dog");
        this.tree.add("cat");
        this.tree.add("pig");
    }

    @Test
    public void testRootBalanced() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input Node is root of tree with two children", var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input Node is root of tree with two children: " + var2);
        }

    }

    @Test
    public void testLeaf() {
        try {
            boolean var1 = BinarySearchTree.isBalancedNode(this.tree.root.left);
            Assert.assertTrue("BinarySearchTree.isBalancedNode returns incorrect value when input Node is leaf", var1);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.isBalancedNode throws exception when input Node is leaf: " + var2);
        }

    }
}

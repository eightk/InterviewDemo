/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch5.tree.test;

import demo.pie.ch5.tree.BinaryTreeHandler;
import demo.pie.ch5.tree.BinaryTreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author huico
 */
public class BinaryTreeTest {

    @Before
    public void init() {
        Integer[] array = {90, 12, 534, 1, 23, 6, 34, 653, 564, 3, 66, 67, 2};
        root = BinaryTreeHandler.initBalanceTree(array);
    }

    @Test
    public void testDepth() {
        System.out.println("Tree Height = " + BinaryTreeHandler.getTreeDepth(root));
    }

    @Test
    public void testBreadthTraversal() {
        System.out.println("breadth traversal result:");
        BinaryTreeHandler.breadthTraversal(root);
    }

    @Test
    public void testDepthTraversal() {
        System.out.println("Depth traversal result:");
        BinaryTreeHandler.depthTraversal(root);
        System.out.println();
    }

    @Test
    public void testSearchTree() {
        BinaryTreeNode result = BinaryTreeHandler.searchTree(root, 2);
        System.out.println("Search Result: " + result.getValue() + " " + result);
    }

    @Test
    public void testInsert() {
        BinaryTreeNode result = BinaryTreeHandler.insertToBalanceTree(root, 79);
        System.out.println("breadth traversal after Insert:");
        BinaryTreeHandler.breadthTraversal(result);
    }

    @Test
    public void testCommonAncestor() {
        BinaryTreeNode result = BinaryTreeHandler.getLowestCommonAncestor(root, 66, 534);
        System.out.println("Common Acestor: " + result.getValue() + " " + result);
    }
    
    @Test
    public void testRotateRight() {
        BinaryTreeNode result = BinaryTreeHandler.rotateRight(root);
        System.out.println("breadth traversal after rotate right:");
        BinaryTreeHandler.breadthTraversal(result);
    }
    
    @Test
    public void testRotateLeft() {
        BinaryTreeNode result = BinaryTreeHandler.rotateLeft(root);
        System.out.println("breadth traversal after rotate left:");
        BinaryTreeHandler.breadthTraversal(result);
    }

    private BinaryTreeNode root = null;
}

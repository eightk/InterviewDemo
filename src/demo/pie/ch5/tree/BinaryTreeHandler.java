/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch5.tree;

import demo.pie.ch8.sort.SortUtils;
import java.util.ArrayList;

/**
 *
 * @author huico
 */
public class BinaryTreeHandler {

    public static BinaryTreeNode initBalanceTree(Integer[] values) {

        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }
        ArrayList<Integer> result = SortUtils.mergeSort(list);
        BinaryTreeNode root = initBalanceTree(result);
        return root;
    }

    private static BinaryTreeNode initBalanceTree(ArrayList<Integer> sortedList) {
        if (sortedList.isEmpty()) {
            return null;
        }
        BinaryTreeNode parent = new BinaryTreeNode(sortedList.get(sortedList.size() / 2));
        if (sortedList.size() == 1) {
            return parent;
        }
        ArrayList<Integer> leftList = new ArrayList();
        ArrayList<Integer> rightList = new ArrayList();
        for (int i = 0; i < sortedList.size() / 2; i++) {
            leftList.add(sortedList.get(i));
        }
        for (int i = sortedList.size() / 2 + 1; i < sortedList.size(); i++) {
            rightList.add(sortedList.get(i));
        }
        BinaryTreeNode left = initBalanceTree(leftList);
        BinaryTreeNode right = initBalanceTree(rightList);
        parent.setLeft(left);
        parent.setRight(right);
        return parent;
    }

    public static int getTreeDepth(BinaryTreeNode root) {
        return getLongestPathNodeNumber(root) - 1;
    }

    private static int getLongestPathNodeNumber(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getLongestPathNodeNumber(root.getLeft());
        int rightHeight = getLongestPathNodeNumber(root.getRight());

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        }
        return rightHeight + 1;
    }

    public static void breadthTraversal(BinaryTreeNode root) {
        ArrayList<BinaryTreeNode> layerNodes = new ArrayList();
        layerNodes.add(root);
        breadthTraversal(layerNodes);
    }

    private static void breadthTraversal(ArrayList<BinaryTreeNode> layerNodes) {
        ArrayList<BinaryTreeNode> newLayerNodes = new ArrayList();
        for (BinaryTreeNode currentNode : layerNodes) {
            if (currentNode == null) {
                continue;
            }
            System.out.print(currentNode.getValue() + "   ");
            if (currentNode.getLeft() != null) {
                newLayerNodes.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                newLayerNodes.add(currentNode.getRight());
            }
        }
        System.out.println();
        if (newLayerNodes.size() > 0) {
            breadthTraversal(newLayerNodes);
        }
    }

    //Inorder depth Traversal, Preorder can put the print before left, post order put the print after the right.
    public static void depthTraversal(BinaryTreeNode root) {
        if (root.getLeft() != null) {
            depthTraversal(root.getLeft());
        }
        System.out.print(root.getValue() + "   ");
        if (root.getRight() != null) {
            depthTraversal(root.getRight());
        }
    }

    public static BinaryTreeNode searchTree(BinaryTreeNode root, int value) {
        if (root == null) {
            return null;
        }
        if (root.getValue() == value) {
            return root;
        }
        if (root.getValue() > value) {
            return searchTree(root.getLeft(), value);
        }
        return searchTree(root.getRight(), value);
    }

    public static BinaryTreeNode insertToBalanceTree(BinaryTreeNode root, int value) {
        boolean insertSuccess = false;
        BinaryTreeNode currentSpot = root;
        while (!insertSuccess) {
            BinaryTreeNode newSpot = null;
            if (currentSpot.getValue() > value) {
                newSpot = currentSpot.getLeft();
                if (newSpot == null) {
                    BinaryTreeNode newNode = new BinaryTreeNode(value);
                    currentSpot.setLeft(newNode);
                    insertSuccess = true;
                }
            } else {
                newSpot = currentSpot.getRight();
                if (newSpot == null) {
                    BinaryTreeNode newNode = new BinaryTreeNode(value);
                    currentSpot.setRight(newNode);
                    insertSuccess = true;
                }
            }
            currentSpot = newSpot;

        }
        return root;
    }

    public static BinaryTreeNode getLowestCommonAncestor(BinaryTreeNode root, int value1, int value2) {
        if (root.getValue() > value1 && root.getValue() > value2) {
            return getLowestCommonAncestor(root.getLeft(), value1, value2);
        }
        if (root.getValue() < value1 && root.getValue() < value2) {
            return getLowestCommonAncestor(root.getRight(), value1, value2);
        }
        return root;
    }
    
    public static BinaryTreeNode rotateRight(BinaryTreeNode root) {
        BinaryTreeNode newRoot = root.getLeft();
        root.setLeft(newRoot.getRight());
        newRoot.setRight(root);
        return newRoot;
    }
    
    public static BinaryTreeNode rotateLeft(BinaryTreeNode root) {
        BinaryTreeNode newRoot = root.getRight();
        root.setRight(newRoot.getLeft());
        newRoot.setLeft(root);
        return newRoot;
    }

    public static BinaryTreeNode rebuildBalancedTree(BinaryTreeNode root) {
        //depth traversal then put all the node into ArrayList
        //sort the Arraylist
        //Build the balance tree
        return root;
    }

    public static BinaryTreeNode heapifyTree(BinaryTreeNode root, boolean isMinHeap) {
        return root;
    }
}

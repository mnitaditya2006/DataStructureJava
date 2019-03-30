package om.aditya.datastructures.trees;

import om.aditya.datastructures.stack.ArrayStack;

public class Test {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BinaryTree<String> bst = new BinaryTree<String>() ;
        bst.addNode(new TreeNode<String>(11, "aditya"));
        bst.addNode(new TreeNode<String>(10, "aditya"));
        bst.addNode(new TreeNode<String>(2, "aditya"));
        bst.addNode(new TreeNode<String>(9, "aditya"));
        bst.addNode(new TreeNode<String>(8, "aditya"));
        bst.addNode(new TreeNode<String>(13, "aditya"));

        bst.inOrderTraversal(bst.root);
        bst.preOrderTraversal(bst.root);
        bst.inOrderTraversal(bst.root);

    }
}

package om.aditya.datastructures.trees;

public class BinaryTree<E> implements Tree<E> {

    TreeNode<E> root;
    public void addNode(TreeNode<E> newNode) {

        root = insertNode(root, newNode) ;

    }

    public TreeNode<E> insertNode(TreeNode<E> root , TreeNode<E> newNode) {

        if(root == null) {
            root = newNode;
            return root;
        }

        if(newNode.key < root.key) {
            root.leftNode = insertNode(root.leftNode , newNode);
        } else {

            root.rightNode = insertNode(root.rightNode , newNode);
        }

        return root;
    }

    public void inOrderTraversal(TreeNode<E> root) {

        if(root != null) {
            inOrderTraversal(root.leftNode);
            System.out.println(root);
            inOrderTraversal(root.rightNode);

        }
    }


    public void preOrderTraversal(TreeNode<E> root) {

        if(root != null) {
            preOrderTraversal(root.leftNode);
            preOrderTraversal(root.rightNode);
            System.out.println(root);


        }
    }

    public void postOrderTraversal(TreeNode<E> root) {

        if(root != null) {
            System.out.println(root);
            postOrderTraversal(root.leftNode);
            postOrderTraversal(root.rightNode);


        }
    }



}

package om.aditya.datastructures.trees;

public class TreeNode<E> {

    int key ;
    E value ;
    TreeNode<E> leftNode;
    TreeNode<E> rightNode;

    public TreeNode(int key, E value) {
        this.key = key;
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "key=" + key +
                ", value=" + value +
                ", leftNode=" + (leftNode == null ? "null" : leftNode ) +
                ", rightNode=" + (rightNode == null ? "null" : rightNode ) +
                '}';
    }
}

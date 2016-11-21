/**
 * Created by chandresh.pancholi on 26/08/16.
 */
public class CountLeaf {
    Node root;

    public static void main(String ...args) {
        CountLeaf tree = new CountLeaf();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left  = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int leafCount = tree.countLeaf(tree.root);
        System.out.println(leafCount);
    }

    private int countLeaf(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            return countLeaf(root.left) + countLeaf(root.right);
        }
    }
}

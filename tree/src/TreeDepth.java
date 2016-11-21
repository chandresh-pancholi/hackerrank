/**
 * Created by chandresh.pancholi on 25/08/16.
 */
public class TreeDepth {
    Node root;

    public static void main(String ...args) {
        TreeDepth tree = new TreeDepth();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.right = new Node(4);
        tree.root.left.left = new Node(5);

        int depth = tree.maxDepth(tree.root);

        System.out.println(depth);
    }

    private int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int lmax = maxDepth(root.left);
        int rmax = maxDepth(root.right);

        return lmax > rmax ? lmax + 1 : rmax + 1;
    }
}

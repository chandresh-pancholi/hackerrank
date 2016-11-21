/**
 * Created by chandresh.pancholi on 25/08/16.
 */
public class TreeSize {
    Node root;

    public TreeSize() {
        root = null;
    }

    public static void main(String ...args) {
        TreeSize tree = new TreeSize();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right= new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int size = tree.treeSize(tree.root);

        System.out.println(size);

    }

    private int treeSize(Node root) {
        if (root == null) {
            return 0;
        }

        return treeSize(root.left) + 1 + treeSize(root.right);
    }
}

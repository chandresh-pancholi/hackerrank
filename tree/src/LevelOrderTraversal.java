/**
 * Created by chandresh.pancholi on 26/08/16.
 */
public class LevelOrderTraversal {
    Node root;

    public static void main(String ...args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.right = new Node(7);

        tree.levelOrder(tree.root);
    }

    private void levelOrder(Node root) {
        int h = height(root);

        for (int i = 1; i <= h; i++) {
            levelOrderRecur(root, i);
            System.out.println();
        }
    }

    private void levelOrderRecur(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            levelOrderRecur(root.left, level - 1);
            levelOrderRecur(root.right, level - 1);
        }
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lmax = height(root.left);
        int rmax = height(root.right);

        return lmax > rmax ? lmax + 1 : rmax + 1;
    }
}

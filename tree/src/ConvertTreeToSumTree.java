import java.util.Objects;

/**
 * Created by chandresh.pancholi on 27/08/16.
 */
public class ConvertTreeToSumTree extends Object {
    Node root;

    public static void main(String ...args) {
        ConvertTreeToSumTree tree = new ConvertTreeToSumTree();

        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);

        tree.inOrder(tree.root);
        System.out.println();
        tree.convertTree(tree.root);

        tree.inOrder(tree.root);
    }

    private int convertTree(Node root) {
        if (root == null) {
            return 0 ;
        }

        int old_data = root.data;
        root.data = convertTree(root.left) + convertTree(root.right);

        return old_data + root.data;

    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }
}

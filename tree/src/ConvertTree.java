/**
 * Created by chandresh.pancholi on 26/08/16.
 */
//Convert an arbitrary Binary Tree to a tree that holds Children Sum Property
public class ConvertTree {
    Node root;

    public static void main(String ...args) {
        ConvertTree tree = new ConvertTree();

        tree.root = new Node(50);
        tree.root.left = new Node(7);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(30);
        tree.inOrder(tree.root);
        System.out.println();

        tree.convertTree(tree.root);

        tree.inOrder(tree.root);
    }

    private void convertTree(Node root) {
        int left_data = 0;
        int right_data = 0;

        if (root == null || root.left == null && root.right == null) {
            return;
        }
        else {
            convertTree(root.left);
            convertTree(root.right);

            if (root.left != null) {
                left_data = root.left.data;
            }
            if (root.right != null) {
                right_data = root.right.data;
            }

            int diff = left_data + right_data - root.data;

            if (diff > 0) {
                root.data = diff + root.data;
            }
            if (diff < 0) {
                increament(root, -diff);
            }
        }
    }

    private void increament(Node root, int diff) {
        if (root.left != null) {
            root.left.data = root.left.data + diff;

            increament(root.left, diff);
        }
        if (root.right != null) {
            root.right.data = root.right.data + diff;

            increament(root.right, diff);
        }
    }
    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}

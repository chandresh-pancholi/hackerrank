/**
 * Created by chandresh.pancholi on 25/08/16.
 */
public class MirrorTree {

    Node root;
    public static void main(String ...args) {
        MirrorTree tree = new MirrorTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);

        tree.inOrder(tree.root);
        System.out.println();

        tree.root = tree.mirror(tree.root);

        tree.inOrder(tree.root);
        System.out.println();

    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    private Node mirror(Node root) {
        if (root == null) {
            return root;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}

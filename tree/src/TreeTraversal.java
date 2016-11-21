/**
 * Created by chandresh.pancholi on 25/08/16.
 */
public class TreeTraversal {
    Node root;

    public TreeTraversal() {
        root = null;
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);


        System.out.println("Pre order tree traversal");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("In order tree traversal");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("Post order tree traversal");
        tree.postOrder(tree.root);
        System.out.println();
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data+ " ");

            preOrder(root.left);
            preOrder(root.right);
        } else {
            return;
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        } else {
            return;
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        } else {
            return;
        }
    }
}

/**
 * Created by chandresh.pancholi on 25/08/16.
 */
public class TreeIdentical {

    Node root1 = null;
    Node root2 = null;

    public static void main(String ...args) {
        TreeIdentical tree = new TreeIdentical();

        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);

        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);

        tree.root1.right.left = new Node(6);
        tree.root1.right.right = new Node(7);


        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);

        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);

        tree.root2.right.left = new Node(6);
        tree.root2.right.right = new Node(9);

        boolean flag = tree.isIdentical(tree.root1, tree.root2);
        System.out.println(flag);
    }

    private boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null ) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return root1.data == root2.data
                    && isIdentical(root1.left, root2.left)
                    && isIdentical(root1.right, root2.right);
        }
        return false;
    }
}

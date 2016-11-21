/**
 * Created by chandresh.pancholi on 26/08/16.
 */
public class ChildrenSumProperty {
    Node root;

    public static void main(String ...args) {
        ChildrenSumProperty tree = new ChildrenSumProperty();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(7);

        System.out.println(tree.childSumProperty(tree.root));
    }

    private boolean childSumProperty(Node root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }
        int left_data = 0;
        int right_data = 0;

        if (root.left != null) {
            left_data = root.left.data;
        }
        if (root.right != null) {
            right_data = root.right.data;
        }

        if (root.data == left_data + right_data &&
                childSumProperty(root.left) && childSumProperty(root.right)) {
            return true;
        }else{
            return false;
        }

    }
}

/**
 * Created by chandresh.pancholi on 26/08/16.
 */
public class SpiralTraversal {
    Node root;

    public static void main(String ...args) {
        SpiralTraversal tree = new SpiralTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.right = new Node(7);

        tree.spiralOrder(tree.root);
    }

    private void spiralOrder(Node root) {
        int h = height(root);
        boolean flag = false;

        for (int i = 1; i <= h; i++) {
            spiralOrderRecur(root, flag,i);
            flag =  !flag;
            System.out.println();
        }

    }

    private void spiralOrderRecur(Node root, boolean flag, int level) {
        if (root == null) {
             return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            if (flag) {
                spiralOrderRecur(root.left, flag, level-1);
                spiralOrderRecur(root.right, flag, level -1);
            } else {
                spiralOrderRecur(root.right, flag, level - 1);
                spiralOrderRecur(root.left, flag, level - 1);
            }
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

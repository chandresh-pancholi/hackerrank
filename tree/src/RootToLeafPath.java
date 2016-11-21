/**
 * Created by chandresh.pancholi on 25/08/16.
 */
public class RootToLeafPath {
    Node root;

    public static void main(String ...args) {
        RootToLeafPath tree = new RootToLeafPath();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);

        tree.printRootToLeaf(tree.root);
    }

    private void printRootToLeaf(Node root) {
        int []path = new int[100];
        printRootToLeafRecur(root, path, 0);
    }

    private void printRootToLeafRecur(Node root, int[] path, int pathLen) {
        if (root == null) {
            return;
        }
        path[pathLen++] = root.data;

        if (root.left == null && root.right == null) {
            printPath(path, pathLen);

        } else {
            printRootToLeafRecur(root.left, path, pathLen);
            printRootToLeafRecur(root.right, path, pathLen);
        }
    }

    private void printPath(int[] path, int pathLen) {
        for (int i = 0; i < pathLen; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }
}

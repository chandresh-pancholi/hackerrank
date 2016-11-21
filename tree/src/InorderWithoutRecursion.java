import java.util.Stack;

/**
 * Created by chandresh.pancholi on 27/08/16.
 */
public class InorderWithoutRecursion {
    Node root;

    public static void main(String ...args){
        Stack<Node> stack = new Stack<>();

        InorderWithoutRecursion tree = new InorderWithoutRecursion();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left  = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        while (tree.root != null) {
            stack.push(tree.root);
            tree.root = tree.root.left;
        }

        while (stack.size() > 0) {
            tree.root = stack.pop();

            System.out.print(tree.root.data + " ");
            if (tree.root.right != null) {
                tree.root = tree.root.right;

                while (tree.root != null) {
                    stack.push(tree.root);
                    tree.root = tree.root.left;
                }
            }
        }
    }
}

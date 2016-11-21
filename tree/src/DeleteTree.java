/**
 * Created by chandresh.pancholi on 25/08/16.
 */
public class DeleteTree {
    Node root;
    
    public static void main(String ...args) {
        DeleteTree tree = new DeleteTree();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.deleteTree(tree.root);
    }

    private void deleteTree(Node root) {
        if (root == null) {
            return;
        }

        deleteTree(root.left);
        deleteTree(root.right);

        System.out.print(root.data + " ");

        root = null;
    }
}

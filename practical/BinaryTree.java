package Design_Algo_Analysis.practical;
// pr 9 
class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // In-order Traversal
    void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // Pre-order Traversal
    void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Post-order Traversal
    void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Wrappers over above recursive functions
    void inOrder()    { inOrder(root); }
    void preOrder()   { preOrder(root); }
    void postOrder()  { postOrder(root); }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre-order traversal of binary tree is ");
        tree.preOrder();

        System.out.println("\nIn-order traversal of binary tree is ");
        tree.inOrder();

        System.out.println("\nPost-order traversal of binary tree is ");
        tree.postOrder();
    }
}

public class BST {
    Node root;

    BST() {
        this.root = null;
    }


    public void insert(int v) {
        if (root == null) {
            root = new Node(v);
            return;
        }
        Node cur = root;
        while (true) {
            if (v < cur.val) {
                if (cur.left == null) {
                    cur.left = new Node(v);
                    return;
                }
                cur = cur.left;
            } else {
                if (cur.right == null) {
                    cur.right = new Node(v);
                    return;
                }
                cur = cur.right;
            }
        }
    }


    public boolean search(int v) {
        Node cur = root;
        while (cur != null) {
            if (v == cur.val) return true;
            cur = (v < cur.val) ? cur.left : cur.right;

        }
        return false;
    }



    public void delete(int v) {
        root = deleteRec(root, v);
    }

    public Node deleteRec(Node node, int key) {
        if (node == null) return null;
        if (key < node.val) {
            node.left = deleteRec(node.left, key);
        } else if (key > node.val) {
            node.right = deleteRec(node.right, key);
        } else {
            if (node.left == null && node.right == null) return null;

            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            Node succ = minNode(node.right);
            node.val = succ.val;
            node.right = deleteRec(node.right, succ.val);
        }
        return node;
    }

    public Node minNode(Node node) {//40
        Node cur = node;
        while (cur.left != null) cur = cur.left;
        return cur;
    }

}

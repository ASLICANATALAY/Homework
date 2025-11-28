public class BinaryTree {
    private Node root;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
            return;
        }
        Node current=root;
        Node parent=null;
        while(current!=null){
                parent=current;
            if (data < current.data) {
                current = current.left;
            } else if (data > current.data) {
                current = current.right;
            } else {
                return;
            }
    }
        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
}
    public boolean searchNode(int data){
        Node current=root;
        while (current != null) {
            if (data == current.data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }
    public void removeNode(int data) {
        Node current = root;
        Node parent  = null;
        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (current == null) {
            return;
        }
        if (current.left == null || current.right == null) {
            Node child;
            if (current.left != null) {
                child = current.left;
            } else {
                child = current.right;
            }
            if (parent == null) {
                root = child;
            } else if (parent.left == current) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        } else {
            Node succParent = current;
            Node succ = current.right;

            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            current.data = succ.data;
            Node succChild = succ.right;  

            if (succParent.left == succ) {
                succParent.left = succChild;
            } else {
                succParent.right = succChild;
            }
        }



}}






















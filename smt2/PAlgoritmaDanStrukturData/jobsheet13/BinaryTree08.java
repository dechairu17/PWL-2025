class Node08 {
    int data;
    Node08 left, right;

    public Node08(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree08 {
    Node08 root;
    
    public BinaryTree08() {
        root = null;
    }
    
    boolean isEmpty() {
        return root == null;
    }
    
    void add(int data) {
        if (isEmpty()) { 
            root = new Node08(data);
        } else {
            Node08 current = root;
            while (true) {
                if (data < current.data) {  // Corrected the condition
                    if (current.left == null) {
                        current.left = new Node08(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {  // Corrected the condition
                    if (current.right == null) {
                        current.right = new Node08(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break;  // Data already exists in the tree
                }
            }
        }
    }

    boolean find(int data) {
        Node08 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node08 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node08 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node08 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node08 getSuccessor(Node08 del) {
        Node08 successor = del.right;
        Node08 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node08 parent = null;
        Node08 current = root;
        boolean isLeftChild = false;
        
        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }
        
        // Node to be deleted has no children (leaf node)
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // Node to be deleted has only a right child
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        // Node to be deleted has only a left child
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
        // Node to be deleted has two children
        else {
            Node08 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }
}
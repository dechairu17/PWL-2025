package Tugas;

public class BinaryTree08 {
    Node08 root;

    public BinaryTree08() {
        this.root = null;
    }

    private Node08 addRekursif(Node08 current, int data) {
        if (current == null) {
            return new Node08(data);
        }

        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }

    public void add(int data) {
        root = addRekursif(root, data);
    }

    public int findMin() {
        return findMin(root);
    }

    private int findMin(Node08 node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int min = node.data;
        int leftMin = findMin(node.left);
        int rightMin = findMin(node.right);

        if (leftMin < min) {
            min = leftMin;
        }
        if (rightMin < min) {
            min = rightMin;
        }

        return min;
    }

    public int findMax() {
        return findMax(root);
    }

    private int findMax(Node08 node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int max = node.data;
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);

        if (leftMax > max) {
            max = leftMax;
        }
        if (rightMax > max) {
            max = rightMax;
        }

        return max;
    }

    public void print() {
        printLeaf(root);
    }

    void printLeaf(Node08 node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        printLeaf(node.left);
        printLeaf(node.right);
    }

    public int jmlLeaf() {
        return jmlLeaf(root);
    }

    int jmlLeaf(Node08 node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return jmlLeaf(node.left) + jmlLeaf(node.right);
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
}

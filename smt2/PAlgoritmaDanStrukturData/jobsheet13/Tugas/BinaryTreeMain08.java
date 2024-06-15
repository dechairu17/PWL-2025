package Tugas;

public class BinaryTreeMain08 {
    public static void main(String[] args) {
        BinaryTree08 tree = new BinaryTree08();
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        System.out.println("Nilai paling kecil dalam tree: " + tree.findMin());
        System.out.println("Nilai paling besar dalam tree: " + tree.findMax());

        System.out.print("Data pada leaf nodes: ");
        tree.print();
        System.out.println();

        System.out.println("Jumlah leaf nodes: " + tree.jmlLeaf());
        System.out.print("PreOrder Traversal  : ");
        tree.traversePreOrder(tree.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        tree.traversePostOrder(tree.root);
        System.out.println("");
    }
}

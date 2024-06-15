package doublelinkedlists;
public class Node08 {
    int data;
    Node08 prev, next;

    public Node08 (Node08 prev, int data, Node08 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
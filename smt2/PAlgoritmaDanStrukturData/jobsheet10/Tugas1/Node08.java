package Tugas1;

public class Node08 {
    int noAntrian;
    String nama;
    Node08 prev, next;

    public Node08 (Node08 prev,  Node08 next,int noAntrian, String nama){
        this.prev = prev;
        this.next = next;
        this.noAntrian = noAntrian;
        this.nama = nama;
    }

    public Node08(int noAntrian, String nama){
        this.noAntrian = noAntrian;
        this.nama = nama;
    }
}

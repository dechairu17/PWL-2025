package Tugas2;
public class NodeTugas208 { 
    String nama; 
    int nim; 
    NodeTugas208 next; 

    public NodeTugas208(int nim, String nama, NodeTugas208 berikutnya) { 
        this.nim = nim; 
        this.nama = nama; 
        next = berikutnya; 
    } 
 
    public NodeTugas208(int nim, String nama) { 
        this.nim = nim; 
        this.nama = nama; 
    } 
}
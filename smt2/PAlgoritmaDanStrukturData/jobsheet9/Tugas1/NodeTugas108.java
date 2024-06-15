package Tugas1;
public class NodeTugas108 { 
    String nama; 
    int nim; 
    NodeTugas108 next; 

    public NodeTugas108(int nim, String nama, NodeTugas108 berikutnya) { 
        this.nim = nim; 
        this.nama = nama; 
        next = berikutnya; 
    } 
 
    public NodeTugas108(int nim, String nama) { 
        this.nim = nim; 
        this.nama = nama; 
    } 
}
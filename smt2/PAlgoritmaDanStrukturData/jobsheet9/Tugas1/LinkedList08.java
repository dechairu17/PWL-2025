package Tugas1;

public class LinkedList08 {
    NodeTugas108 head, tail; 
 
    boolean isEmpty() { 
        return head == null; 
    } 
 
    void print() { 
        if (!isEmpty()) { 
            NodeTugas108 tmp = head; 
            System.out.println("Isi Linked List:"); 
            int counter = 1; 
            while (tmp != null) { 
                System.out.println("Mhs" + counter + "\tNIM: " + tmp.nim + "\tNama: " + tmp.nama); 
                tmp = tmp.next; 
                counter++; 
            } 
        } else { 
            System.out.println("Linked List kosong"); 
        } 
    } 
 
    void addFirst(int nim, String nama) { 
        NodeTugas108 ndInput = new NodeTugas108(nim, nama, null); 
        if (isEmpty()) { 
            head = ndInput; 
            tail = ndInput; 
        } else { 
            ndInput.next = head; 
            head = ndInput; 
        } 
    } 
 
    void addLast(int nim, String nama) { 
        NodeTugas108 ndInput = new NodeTugas108(nim, nama, null); 
        if (isEmpty()) { 
            head = ndInput; 
            tail = ndInput; 
        } else { 
            tail.next = ndInput; 
            tail = ndInput; 
        } 
    } 
 
    void insertAfter(int key, int nim, String nama) { 
        NodeTugas108 ndInput = new NodeTugas108(nim, nama, null); 
        NodeTugas108 temp = head; 
        while (temp != null) { 
            if (temp.nim == key) { 
                ndInput.next = temp.next; 
                temp.next = ndInput; 
                if (ndInput.next == null) { 
                    tail = ndInput; 
                } 
                break; 
            } 
            temp = temp.next; 
        } 
    } 
 
    void insertAt(int index, int nim, String nama) { 
        if (index < 0) { 
            System.out.println("Perbaiki logikanya! Kalau indeksnya -1 bagaimana???"); 
        } else if (index == 0) { 
            addFirst(nim, nama); 
        } else { 
            NodeTugas108 temp = head; 
            for (int i = 0; i < index - 1; i++) { 
                temp = temp.next; 
            } 
            temp.next = new NodeTugas108(nim, nama, temp.next); 
            if (temp.next.next == null) { 
                tail = temp.next; 
            } 
        } 
    } 
}

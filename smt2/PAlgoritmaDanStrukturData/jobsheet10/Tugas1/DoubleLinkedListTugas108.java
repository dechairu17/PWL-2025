package Tugas1;

public class DoubleLinkedListTugas108 {
    Node08 head,tail;
    int size;

    public DoubleLinkedListTugas108(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item, String nama){
        if (isEmpty()) {
            head = new Node08(head, tail, item, nama);
            
        } else {
            Node08 newNode08 = new Node08(head, tail, item, nama);
            head.prev = newNode08;
            head = newNode08;
        }
        size++;
    }

    public void addLast (int item, String nama){
        if (isEmpty()) {
            addFirst(item, nama);
        } else {
            Node08 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node08 newNode08 = new Node08(current, tail, item, nama);
            current.next = newNode08;   
            size++;
        }
    }

        void print() { 
            if (!isEmpty()) { 
                Node08 tmp = head; 
                System.out.println("Isi Linked List:"); 
                while (tmp != null) { 
                    System.out.println("\nnoAntrian : " + tmp.noAntrian + "\tNama: " + tmp.nama); 
                    tmp = tmp.next; 
                } 
            } else { 
                System.out.println("Linked List kosong"); 
            } 
        } 

        public void removeFirst() throws Exception{
            if (isEmpty()) {
                throw new Exception("Linked List masih kosong, tidak dapat di hapus");
            } else if (size == 1) {
                removeLast();
                size--;
            } else {
                head =  head.next;
                head.prev = null;
                size--;
            }
        }
    
        public void removeLast() throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked list masih kosong, tidak dapat dihapus");
            } else if (head.next == null) {
                head = null;
            } else {
                Node08 current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        }

        public int size(){
            return size;
        }
}

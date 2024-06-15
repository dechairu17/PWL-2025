public class DoubleLinkedList08 {
    Node08 head;
    int size;

    public DoubleLinkedList08() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node08(null, null, item, jarak);
        } else {
            Node08 newNode08 = new Node08(null, head, item, jarak);
            head.prev = newNode08;
            head = newNode08;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node08 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node08 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node08 current = head;
        for (int i = 0; i < index; i++) {   
            current = current.next;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void updateJarak(int index, int jarak) throws Exception { 
        if (isEmpty() || index >= size) { 
            throw new Exception("Nilai Index Di luar batas"); 


        } 
        Node08 tmp = head; 
        for (int i = 0; i < index; i++) { 
            tmp = tmp.next; 
        } 
        tmp.jarak = jarak; 
        } 
} 

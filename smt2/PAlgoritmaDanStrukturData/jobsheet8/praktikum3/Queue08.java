package praktikum3;

public class Queue08 {
    Pembeli08[] antrian;
    int front,rear,size,max;

    public Queue08(int n){
        max = n;
        antrian = new Pembeli08[max];
        size = 0;
        front = rear = -1;    
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pembeli08 pb) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = pb;
            size++;
        }
    }

    public Pembeli08 dequeue() {
        Pembeli08 atr = new Pembeli08(null, front);
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            atr = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return atr;
    }

    public void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp );
            System.out.println("Jumlah elemen = " + size);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[front].nama + " " + antrian[front].noHp );
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[rear].nama + " " + antrian[rear].noHp );
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            for (int i = 0; i < antrian.length; i++) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("anda urutan " + i);
                }
            }
        }
    }

    public void daftarPembeli(){
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp );
            System.out.println("Jumlah elemen = " + size);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}

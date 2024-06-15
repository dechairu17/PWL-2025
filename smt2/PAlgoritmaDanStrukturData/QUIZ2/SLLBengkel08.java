public class SLLBengkel08 {
    Antrian08 head;
    int size;

 
    public SLLBengkel08() { 
        head = null; 
        size = 0; 
    } 
 
    public boolean isEmpty() { 
        return head == null; 
    }
     
 
    public void addFirst(Pelanggan08 pelanggan,Layanan08 layanan) { 
        if (isEmpty()) { 
            head = new Antrian08(pelanggan, layanan, null, null) ;
        } else { 
            Antrian08 newNode = new Antrian08(pelanggan, layanan, head, null);
            head.prev = newNode; 
            head = newNode; 
        } 
        size++; 
    } 
 
    public void addLast(Pelanggan08 pelanggan,Layanan08 layanan) { 
        if (isEmpty()) { 
            addFirst(pelanggan,layanan); 
        } else { 
            Antrian08 current = head; 
            while (current.next != null) { 
                current = current.next; 
            } 
            Antrian08 newNode = new Antrian08(pelanggan, layanan, null, current);
            current.next = newNode; 
            size++; 
        } 
    }

    void print() { 
        if (!isEmpty()) { 
            Antrian08 tmp = head; 
            System.out.println("Isi Linked List:"); 
            int counter = 1; 
            while (tmp != null) { 
                System.out.println("Antrian ke : " + counter);
                System.out.println("nama pelanggan : " + tmp.pelanggan.namaPelanggan);
                System.out.println("NO HP : " + tmp.pelanggan.NoHp);
                System.out.println("Kode Layanan : " + tmp.layanan.KodeLayanan);
                System.out.println("nama Layanan : " + tmp.layanan.namaLayanan);
                System.out.println("Harga : " + tmp.layanan.harga);
                tmp = tmp.next; 
                counter++; 
            } 
        } else { 
            System.out.println("Linked List kosong"); 
        } 
    } 
    
    public void removeLastAndAddService(Layanan08 layanan) throws Exception {
        if (isEmpty()) { 
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!"); 
        } else { 
            Antrian08 current = head; 
            while (current.next != null) { 
                current = current.next; 
            } 
            current.layanan = layanan;
        } 
    }


    public int size() { 
        return size; 
    } 
 
    public void clear() { 
        head = null; 
        size = 0; 
    }

    public void tampilSemuaLayanan() {
        Antrian08 tmp = head;
        System.out.println("Daftar Semua Layanan:");
        while (tmp != null) {
            System.out.println("Nama Layanan: " + tmp.layanan.namaLayanan + ", Harga: " + tmp.layanan.harga);
            tmp = tmp.next;
        }
    }

    public int totalPemasukan() {
        Antrian08 tmp = head;
        int total = 0;
        while (tmp != null) {
            total += tmp.layanan.harga;
            tmp = tmp.next;
        }
        return total;
    }

    public void tampilLayananTermurah() {
        Antrian08 tmp = head;
        Layanan08 termurah = tmp.layanan;
        while (tmp != null) {
            if (tmp.layanan.harga < termurah.harga) {
                termurah = tmp.layanan;
            }
            tmp = tmp.next;
        }
        System.out.println("Layanan Termurah:");
        System.out.println("Nama Layanan: " + termurah.namaLayanan + ", Harga: " + termurah.harga);
    }
}

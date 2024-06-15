public class Antrian08 {
    Pelanggan08 pelanggan;
    Layanan08 layanan;
    Antrian08 next;
    Antrian08 prev;

    Antrian08(Pelanggan08 pelanggan, Layanan08 layanan , Antrian08 next, Antrian08 prev){
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.next = next;
        this.prev = prev;
    }
}

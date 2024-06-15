
public class Node08 {
    Kendaraan08 kendaraan;
    TranksaksiPajak08 TranksaksiPajak;
    Node08 next, prev;

    Node08(Kendaraan08 kendaraan ,TranksaksiPajak08 TranksaksiPajak , Node08 prev, Node08 next){
        this.kendaraan = kendaraan;
        this.TranksaksiPajak = TranksaksiPajak;
        this.next = next;
        this.prev = prev;
    }
    
    Node08(Kendaraan08 kendaraan, Node08 prev, Node08 next) {
        this.kendaraan = kendaraan;
        this.next = next;
        this.prev = prev;
    }
}

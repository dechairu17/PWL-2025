import java.util.List;

class DLL08 {
    Node08 head;
    int size;

    public DLL08() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Kendaraan08 kendaraan) {
        Node08 newNode = new Node08(kendaraan, null, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node08 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void printAllKendaraan() {
        Node08 current = head;
        while (current != null) {
            System.out.println(current.kendaraan);
            current = current.next;
        }
    }

    public TranksaksiPajak08 bayarPajak(String tnkb, int bulanBayar, int kodeTransaksi) {
        Node08 current = head;
        while (current != null && !current.kendaraan.noTNKB.equals(tnkb)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Kendaraan tidak ditemukan.");
            return null;
        }

        Kendaraan08 kendaraan = current.kendaraan;
        long nominalBayar = 0;
        long denda = 0;

        if (kendaraan.jenis.equalsIgnoreCase("Motor")) {
            if (kendaraan.cc < 100) {
                nominalBayar = 100000;
            } else if (kendaraan.cc <= 250) {
                nominalBayar = 250000;
            } else {
                nominalBayar = 500000;
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("Mobil")) {
            if (kendaraan.cc < 1000) {
                nominalBayar = 750000;
            } else if (kendaraan.cc <= 2500) {
                nominalBayar = 1000000;
            } else {
                nominalBayar = 1500000;
            }
        }

        int bulanHarusBayar = kendaraan.bulanHarusBayar;
        if (bulanBayar > bulanHarusBayar) {
            int selisihBulan = bulanBayar - bulanHarusBayar;
            if (selisihBulan <= 3) {
                denda = selisihBulan * 50000;
            } else {
                denda = 3 * 50000 + (selisihBulan - 3) * 50000;
            }
        }

        System.out.println("==================================");
        System.out.println("Data Pembayaran");
        System.out.println("==================================");
        System.out.printf("| %-4s | %-11s | %-10s | %-7s | %-7s |%n", "No", "TNKB", "Nama", "Nominal", "Denda");
        System.out.printf("| %-4d | %-11s | %-10s | %-7d | %-7d |%n", 1, kendaraan.noTNKB, kendaraan.nama, nominalBayar, denda);
        System.out.println("==================================");

        return new TranksaksiPajak08(kodeTransaksi, nominalBayar, denda, bulanBayar, kendaraan);
    }

    public void printAllTransaksi(List<TranksaksiPajak08> transaksiList) {
        long totalPemasukan = 0;
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("Daftar Transaksi Pembayaran Pajak");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("|kode|TNKB       |Nama      |Nominal  |Denda    |");
        System.out.println("-------------------------------------------------");

        if (transaksiList.isEmpty()) {
            System.out.printf("| %-4s | %-46s |%n", "", "Data Transaksi atau Kendaraan Kosong");
        } else {
            int kode = 1;
            for (TranksaksiPajak08 transaksi : transaksiList) {
                if (transaksi != null && transaksi.kendaraan08 != null) {
                    System.out.printf("|%-4d|%-11s|%-10s|%-8d|%-8d|%n",
                            kode++, transaksi.kendaraan08.noTNKB, transaksi.kendaraan08.nama,
                            transaksi.nominalBayar, transaksi.denda);
                    totalPemasukan += transaksi.nominalBayar + transaksi.denda;
                } else {
                    System.out.printf("|%-4d| %-46s |%n", kode++, "Data Transaksi atau Kendaraan Kosong");
                }
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("semua transaksi berhasil dicetak");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.printf("TOTAL PENDAPATAN%n+++++++++++++++++++++++++++%nPendapatan hari ini : %d%n", totalPemasukan);
    }
}
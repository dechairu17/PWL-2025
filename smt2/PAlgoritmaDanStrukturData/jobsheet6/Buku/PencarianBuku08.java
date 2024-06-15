package jobsheet6.Buku;

public class PencarianBuku08 {

    Buku08[] listBuku08 = new Buku08[3];
    int idx;
	public Object listBk;

    void tambah(Buku08 m) {
        if (idx < listBuku08.length) {
            listBuku08[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (Buku08 m : listBuku08) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBuku08.length; j++) {
            if (listBuku08[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " Ditemukan pada index : " + pos);
        } else {
            System.out.println("Data : " + x + " tidak Ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t: " + x);
            System.out.println("Judul\t\t: " + listBuku08[pos].judul);
            System.out.println("Tahun Terbit\t: " + listBuku08[pos].tahunTerbit);
            System.out.println("Pengarang\t\t: " + listBuku08[pos].pengarang);
            System.out.println("Stock\t\t: " + listBuku08[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public Buku08 findBuku(String cari) {
        int posisi = findSeqSearch(cari);
        return (posisi != -1) ? listBuku08[posisi] : null;
    }

    public int findBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            int comparison = cari.compareTo(listBuku08[mid].kodeBuku);
        
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int findJudulBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
    
            int comparison = listBuku08[mid].judul.compareToIgnoreCase(cari); 
    
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                return findJudulBinarySearch(cari, mid + 1, right);
            } else {
                return findJudulBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }

    void sort() {
        int length = listBuku08.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (listBuku08[j].judul.compareToIgnoreCase(listBuku08[j + 1].judul) > 0) {
                    Buku08 temp = listBuku08[j];
                    listBuku08[j] = listBuku08[j + 1];
                    listBuku08[j + 1] = temp;
                }
            }
        }
    }

    int findSeqSearchJudul(String cari) {
        int count = 0;
        int posisi = -1;
        for (int j = 0; j < listBuku08.length; j++) {
            if (listBuku08[j].judul.toLowerCase().contains(cari.toLowerCase())) {
                posisi = j;
                count++;
            }
        }
        if (count > 1) {
            System.out.println(count + " data ditemukan dengan judul yang sama!");
        }
        return posisi;
    }
}
package jobsheet5.bubble;

public class daftarMahasiswaBerprestasi {
    mahasiswa listMhs[] = new mahasiswa[5];
    int idx;

    void tambah(mahasiswa m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }
    

    void tampil(){
        for (mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    void bubblesort(){
        for (int i = 0; i < listMhs.length- 1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].Ipk > listMhs[j-1].Ipk) {
                    mahasiswa tmp  = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].Ipk < listMhs[idxMin].Ipk) {
                    idxMin = j;
                }
            }
            mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].Ipk > temp.Ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    void insertionSortDesending(){
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].Ipk < temp.Ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}

package jobsheet5.latihan;

import jobsheet5.bubble.mahasiswa;

public class HotelService {
    Hotel listHotels[] = new Hotel[3];
    int rooms;

    void tambah(Hotel H){
        if (rooms < listHotels.length ) {
            listHotels[rooms] = H;
            rooms++;
        } else {
            System.out.println("Data Hotel sudah penuh");
        }
    }

    void tampilAll(){
        for (Hotel H : listHotels) {
            H.tampil();
            System.out.println("-----------------------------");
        }

    }

    void bubblesort(){
        for (int i = 0; i < listHotels.length- 1; i++) {
            for (int j = 1; j < listHotels.length-i; j++) {
                if (listHotels[j].harga < listHotels[j-1].harga) {
                    Hotel tmp  = listHotels[j];
                    listHotels[j] = listHotels[j-1];
                    listHotels[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listHotels.length - 1; i++) {
            int roomsMin = i;
            for (int j = i + 1; j < listHotels.length; j++) {
                if (listHotels[j].bintang > listHotels[roomsMin].bintang) {
                    roomsMin = j;
                }
            }
            Hotel tmp = listHotels[roomsMin];
            listHotels[roomsMin] = listHotels[i];
            listHotels[i] = tmp;
        }
    }
}

public class MenuAlatPesta08 {
    AlatPesta08 listAlatPesta08 [] = new AlatPesta08[5];
    int idx08;

    void tambah08(AlatPesta08 m){
        if (idx08 < listAlatPesta08.length) {
            listAlatPesta08[idx08] = m;
            idx08++;
        } else{
            System.out.println("Data Sudah Penuh ");
        }
    }

    void tampil08(){
        for (AlatPesta08 m08 : listAlatPesta08) {
            if (m08 != null) {
                m08.tampilDataAlatPesta();
            }
        }
    }
    
    void bubblesortHarga08(){ 
        for (int i = 0; i < listAlatPesta08.length-1; i++) { 
          for (int j = 1; j < listAlatPesta08.length-i; j++) { 
            if (listAlatPesta08[j] != null && listAlatPesta08[j-1] != null && listAlatPesta08[j].hargaSewa08 < listAlatPesta08[j-1].hargaSewa08) { 
              AlatPesta08 tmp08 = listAlatPesta08[j]; 
              listAlatPesta08[j] = listAlatPesta08[j-1]; 
              listAlatPesta08[j-1] = tmp08; 
            } 
          } 
        } 
      }   

      void bubblesortKode08(){ 
        for (int i = 0; i < listAlatPesta08.length-1; i++) { 
          for (int j = 1; j < listAlatPesta08.length-i; j++) { 
            if (listAlatPesta08[j] != null && listAlatPesta08[j-1] != null && listAlatPesta08[j].kodeAlat08 < listAlatPesta08[j-1].kodeAlat08) { 
              AlatPesta08 tmp08 = listAlatPesta08[j]; 
              listAlatPesta08[j] = listAlatPesta08[j-1]; 
              listAlatPesta08[j-1] = tmp08; 
            } 
          } 
        } 
      }
    
    public int FindSeqSearch08(int cari){ 
        int posisi = 0; 
        for (int j = 0; j < listAlatPesta08.length; j++) { 
            if (listAlatPesta08[j].kodeAlat08 == cari) { 
                j = posisi; 
                break; 
            } 
        } 
        return posisi; 
    } 

    public void tampilPosisi08(int x, int pos){ 
        if (pos != 0) { 
            System.out.println("Data  : " + x + "  Ditemukan pada index : " + pos ); 
        } else { 
            System.out.println("Data  : " + x + "  tidak Ditemukan" ); 
        } 
    } 

    public void TampilData08(int x, int pos) { 
        if (pos != -1) { 
            System.out.println("Kode Alat\t: " + x ); 
            System.out.println("Nama Alat\t\t: " + listAlatPesta08[pos].namaAlat08); 
            System.out.println("Harga Sewa\t: " + listAlatPesta08[pos].hargaSewa08 ); 
            System.out.println("Stock\t\t: " + listAlatPesta08[pos].stock08); 
        } else { 
            System.out.println("data " + x + " tidak ditemukan"); 
        } 
    } 
    


}

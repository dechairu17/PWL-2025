package jobsheet3;
public class mainMahasiswa {
    public static void main(String[] args) {
        // Buat array 2 dimensi yang berisi objek Mahasiswa
        Mahasiswa[][] mahasiswaArray = {
            {new Mahasiswa("dimas", "23417"), new Mahasiswa("samid", "52201")},
            {new Mahasiswa("adi", "20169"), new Mahasiswa("bayu", "7881")}
        };

        // Akses objek dalam array 2 dimensi
        System.out.println("Nama Mahasiswa : " + mahasiswaArray[0][0].getNama() + ", Nim Mahasiswa : " + mahasiswaArray[0][0].getNim());
        System.out.println("Nama Mahasiswa : " + mahasiswaArray[0][1].getNama() + ", Nim Mahasiswa : " + mahasiswaArray[0][1].getNim());
        System.out.println("Nama Mahasiswa : " + mahasiswaArray[1][0].getNama() + ", Nim Mahasiswa : " + mahasiswaArray[1][0].getNim());
        System.out.println("Nama Mahasiswa : " + mahasiswaArray[1][1].getNama() + ", Nim Mahasiswa : " + mahasiswaArray[1][1].getNim());
    }
}
package jobsheet3.Latihan3;


class Mahasiswa {

    private String nama;
    private String nim;
    private String jenisKelamin;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String Nama() {
        return nama;
    }

    public String Nim() {
        return nim;
    }

    public String JenisKelamin() {
        return jenisKelamin;
    }

    public double Ip() {
        return ipk;
    }
}

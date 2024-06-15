package jobsheet3.Latihan2;


    import java.util.Scanner;
    
    public class mainMahasiswa {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            Mahasiswa[] mahasiswa = new Mahasiswa[3];
    
            for (int i = 0; i < mahasiswa.length; i++) {
                System.out.println("Mahasiswa ke-" + (i + 1));
                System.out.print("Masukkan nama: ");
                String nama = scanner.next();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.next();
                System.out.print("Masukkan jenis kelamin (L/P): ");
                String jenisKelamin = scanner.next();
                System.out.print("Masukkan IPK: ");
                double ipk = scanner.nextDouble();
    
                Mahasiswa mhs = new Mahasiswa(nama, nim, jenisKelamin, ipk);
                mahasiswa[i] = mhs;
            }
    
            for (Mahasiswa mhs : mahasiswa) {
                System.out.println();
                System.out.println("Nama: " + mhs.Nama());
                System.out.println("NIM: " + mhs.Nim());
                System.out.println("Jenis Kelamin: " + mhs.JenisKelamin());
                System.out.println("IPK: " + mhs.Ip());
            }
        }
    }



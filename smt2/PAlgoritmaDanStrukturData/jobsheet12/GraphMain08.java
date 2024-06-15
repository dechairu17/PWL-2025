import java.util.Scanner;

public class GraphMain08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Graph08 gedung = new Graph08(6);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan vertex: ");
                    asal = scanner.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    if (cekEdge(gedung, asal, tujuan)) {
                        System.out.println("Edge ada");
                    } else {
                        System.out.println("Edge tidak ada");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = scanner.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    System.out.println("Jumlah edge: " + gedung.hitungEdge());
                    break;
                case 8:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static boolean cekEdge(Graph08 graph, int asal, int tujuan) throws Exception {
        for (int i = 0; i < graph.list[asal].size(); i++) {
            if (graph.list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }
}

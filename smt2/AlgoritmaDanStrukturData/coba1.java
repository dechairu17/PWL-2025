import java.util.Scanner;

public class coba1 {

    // Fungsi untuk memasukkan rating dari setiap orang terhadap setiap film
    public static void inputRatings(int[][] ratings, Scanner scanner) {
        for (int i = 0; i < ratings.length; i++) {
            System.out.println("Masukkan rating untuk Orang " + (i + 1) + ":");
            for (int j = 0; j < ratings[i].length; j++) {
                System.out.print("Rating untuk Film " + (j + 1) + ": ");
                ratings[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan urutan rating dari setiap orang untuk setiap film
    public static void displayRatings(int[][] ratings) {
        for (int j = 0; j < ratings[0].length; j++) {
            System.out.println("Rating untuk Film " + (j + 1) + ":");
            for (int i = 0; i < ratings.length; i++) {
                System.out.println("Orang " + (i + 1) + ": " + ratings[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ratings = new int[3][4];

        inputRatings(ratings, scanner);
        System.out.println("\nUrutan rating dari setiap orang untuk setiap film:");
        displayRatings(ratings);

        scanner.close();
    }
}

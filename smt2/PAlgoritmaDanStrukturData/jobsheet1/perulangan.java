package jobsheet1;
import java.util.Scanner;
import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        long nim = input.nextLong();
        int n = (int) (nim % 100);

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i==6||i==10) {
                    continue;
                }else{
                    System.out.print(i + " ");
                }
            } else {
                System.out.print(" * ");
            }
        }

        System.out.println();
        input.close();
    }
}
package jobsheet1;

import java.util.Scanner;

public class tugas1 {

    static Scanner sc = new Scanner(System.in);
    static char[] Kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'K', 'L', 'M'};
    static char [][] Kota = new char [10][12];

    public static void main(String[] args) {

        System.out.print("Kode Plat: A, B, D, E, F, G, H, L, N, T");
        inisialisasiKota();
            System.out.println("\nInput kode plat: ");
            int input = sc.next().charAt(0);
            switch (input) {
                case 'A':
                    kodePlat(0);
                    break;
                case 'B':
                    kodePlat(1);
                    break;
                case 'D':
                    kodePlat(2);
                    break;
                case 'E':
                    kodePlat(3);
                    break;
                case 'F':
                    kodePlat(4);
                    break;
                case 'G':
                    kodePlat(5);
                    break;
                case 'H':
                    kodePlat(7);
                    break;
                case 'L':
                    kodePlat(8);
                    break;
                case 'N':
                    kodePlat(9);
                    break;
                default:
                System.out.println("Kode tidak valid");
                    break;
            }
        
    }

    static void kodePlat(int index){
        for (int i=0; i < Kota[index].length ;i++){
            System.out.print(Kota[index][i]);
        }
    }

    static void inisialisasiKota(){

        char[][]KotaTemp={
        {'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E','K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T','E', 'G', 'A', 'L'}
        };

        for (int i = 0;i<Kota.length;i++){
            for (int j =0;j<KotaTemp[i].length;j++){
                Kota[i][j] = KotaTemp[i][j];
            }
        }
    }
}
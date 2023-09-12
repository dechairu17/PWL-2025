package week3.jobsheet;

import java.util.Scanner;

public class fisika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1, r2, r3, r4, I;
        double v;

        System.out.print("masukan r1 : ");
        r1 = sc.nextInt();
        System.out.print("masukan r2 : ");
        
        r2 = sc.nextInt();
        System.out.print("masukan r3 : ");
        r3 = sc.nextInt();
        System.out.print("masukan r4 : ");
        r4 = sc.nextInt();
        
        double rp = 1/ (1/r1 + 1/r2 + 1/r3 );
        System.out.println("Rangkain pararel : " + rp);
        
        System.out.print("masukan I : ");
        I = sc.nextInt();

        double Rtot = rp + r4;
        System.out.println("R total : " + Rtot); 

        v = I * Rtot;
        System.out.println("V : " + v);

        
    }
}

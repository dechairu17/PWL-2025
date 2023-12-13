package week14.jobsheet;

public class c1 {
    static int faktorial (int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n* faktorial(n-1);
        }
    }
    public static void main(String[] args) {
        int hasil = faktorial(5);
        System.out.println(hasil);
    }
}

package jobsheet4.Pangkat;

public class Pangkat08 {
    public int nilai, pangkat;

    Pangkat08(int n, int p){
        nilai = n;
        pangkat = p;
    }

    public void menu(){

    }

    public int PangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int PangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1)//bilangan ganjil
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2) * a);
            else
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2));
        }
    }
}

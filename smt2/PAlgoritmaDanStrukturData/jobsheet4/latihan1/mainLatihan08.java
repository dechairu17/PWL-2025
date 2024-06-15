package jobsheet4.latihan1;

public class mainLatihan08 {
    public static void main(String[] args) {
        int[] Accel = {6816,3921,4360,4058,6255,3700,4180,4180};
        int[] topPower = {728,575,657,609,703,553,609,631};
        latihan08 latihan = new latihan08(Accel, topPower);

        System.out.println("_______________________________________________________________________");
        System.out.println("|Merk        | Tipe            | Tahun | top_acceleration | top_power |");
        System.out.println("_______________________________________________________________________");
        System.out.println("|BMW         | M2 Coupe        | 2016  | 6816             | 728       |");
        System.out.println("|Ford        | Fiesta ST       | 2014  | 3921             | 575       |");
        System.out.println("|Nissan      | 370Z            | 2009  | 4360             | 657       |");
        System.out.println("|Subaru      | BRZ             | 2014  | 4058             | 609       |");
        System.out.println("|Subaru      | Impreza WRX STI | 2013  | 6255             | 703       |");
        System.out.println("|Toyota      | AE86 Trueno     | 1986  | 3700             | 553       |");
        System.out.println("|Toyota      | 86/GT86         | 2014  | 4180             | 609       |");
        System.out.println("|Volkswagen  | Golf GTI        | 2014  | 4180             | 631       |");
        System.out.println("=======================================================================");

        System.out.println();

        System.out.println("Top Acceleration adalah " + latihan.highestAccel());
        System.out.println("Low Acceletaion adalah " + latihan.lowAccel());
        System.out.println("Rata Rata power adalah " + latihan.avgPower());
    }
}

package jobsheet4.latihan1;

public class latihan08 {
    int[] Accel;
    int[] topPower;

    latihan08(int[] Accel, int[] topPower){
        this.Accel = Accel;
        this.topPower = topPower;
    }

    int highestAccel(){
        if (Accel.length == 1) {
            return Accel[0];
        }
        return highestAccel(Accel, 0, Accel.length -1);
    }

    int highestAccel(int[] data, int l, int r){
        if (l == r) {
            return data[l];
        }

        int mid = (r + l) / 2;
        int lAccel = highestAccel(data, l, mid);
        int rAccel = highestAccel(data, mid + 1, r);

        if (lAccel > rAccel) {
            return lAccel;
        } else {
            return rAccel;
        }
    }

    int lowAccel(){
        if (Accel.length == 1) {
            return Accel[0];
        }
        return lowAccel(Accel, 0, Accel.length -1);
    }

    int lowAccel(int[] data, int l, int r){
        if (l == r) {
            return data[l];
        }

        int mid = (r + l) / 2;
        int lAccel = lowAccel(data, l, mid);
        int rAccel = lowAccel(data, mid + 1, r);

        if (lAccel > rAccel) {
            return rAccel;
        } else {
            return lAccel;
        }
    }

    int avgPower(){
        int sum = 0;
        for (int i : topPower) {
            sum += i;
        }
        sum /= topPower.length;
        return sum;
    }
}

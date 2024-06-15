package jobsheet3.Latihan1;

import java.util.Scanner;

class Kerucut {
    private double jariJari;
    private double sisiMiringKerucut;

    public Kerucut(double r, double sM) {
        jariJari = r;
        sisiMiringKerucut = sM;
    }

    public double hitungLuasPermukaan() {

        double luasSelimut = Math.PI * jariJari * sisiMiringKerucut;
        double luasAlas = Math.PI * Math.pow(jariJari, 2);
        return luasSelimut + luasAlas;
    }

    public double hitungVolume() {
        double tinggiKerucut ;
        tinggiKerucut = Math.pow(sisiMiringKerucut, 2) - Math.pow(jariJari, 2);
        tinggiKerucut = Math.sqrt(2);
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggiKerucut;
    }
}



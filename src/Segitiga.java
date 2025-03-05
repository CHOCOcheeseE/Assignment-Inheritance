public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi1, sisi2, sisi3, sudut;
    private char tipe;

    // Konstruktor untuk segitiga siku-siku
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.tipe = 'S';
    }

    // Konstruktor untuk segitiga dengan 3 sisi (Heron’s Formula)
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.tipe = 'H';
    }

    // Konstruktor untuk segitiga dengan 2 sisi & sudut
    public Segitiga(double sisi1, double sisi2, double sudut, boolean pakaiSudut) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sudut = sudut;
        this.tipe = 'A';
    }

    @Override
    public double luas() {
        switch (tipe) {
            case 'S':
                return (alas * tinggi) / 2;
            case 'H':
                double s = (sisi1 + sisi2 + sisi3) / 2;
                return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
            case 'A':
                return 0.5 * sisi1 * sisi2 * Math.sin(Math.toRadians(sudut));
            default:
                return 0;
        }
    }

    @Override
    public double keliling() {
        switch (tipe) {
            case 'S':
                return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
            case 'H':
                return sisi1 + sisi2 + sisi3;
            case 'A':
                return sisi1 + sisi2 + Math
                        .sqrt(sisi1 * sisi1 + sisi2 * sisi2 - 2 * sisi1 * sisi2 * Math.cos(Math.toRadians(sudut)));
            default:
                return 0;
        }
    }

    public String jenisSegitiga() {
        if (tipe == 'H') {
            if (sisi1 == sisi2 && sisi2 == sisi3)
                return "Segitiga Sama Sisi";
            else if (sisi1 == sisi2 || sisi2 == sisi3 || sisi1 == sisi3)
                return "Segitiga Sama Kaki";
            else
                return "Segitiga Sembarang";
        }
        return "Segitiga tidak dapat dikategorikan berdasarkan sisi";
    }
}

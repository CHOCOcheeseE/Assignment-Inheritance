public class Segitiga extends BangunDatar {
    double alas;
    double tinggi;
    double sisi1;
    double sisi2;
    double sisi3;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

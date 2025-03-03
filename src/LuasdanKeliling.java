public class LuasdanKeliling {
    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar(4);
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        Segitiga s = new Segitiga(3, 4, 5, 6, 7);

        System.out.println("Luas Bujur Sangkar: " + bs.hitungLuas());
        System.out.println("Keliling Bujur Sangkar: " + bs.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());
        System.out.println("Luas Segitiga: " + s.hitungLuas());
        System.out.println("Keliling Segitiga: " + s.hitungKeliling());
    }
}

import java.util.Scanner;

public class BangunDatar {
    public double luas() {
        return 0;
    }

    public double keliling() {
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Silahkan Pilih Bangun Datar:");
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("=====================================");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan panjang sisi: ");
            double sisi = scanner.nextDouble();
            BujurSangkar bs = new BujurSangkar(sisi);
            System.out.println("Luas: " + bs.luas());
            System.out.println("Keliling: " + bs.keliling());
        } else if (pilihan == 2) {
            System.out.print("Masukkan panjang: ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = scanner.nextDouble();
            PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
            System.out.println("Luas: " + pp.luas());
            System.out.println("Keliling: " + pp.keliling());
        } else if (pilihan == 3) {
            System.out.println("Pilih Jenis Segitiga:");
            System.out.println("1. Segitiga Siku-siku");
            System.out.println("2. Segitiga dengan 3 sisi (Heron)");
            System.out.println("3. Segitiga dengan 2 sisi & sudut");
            System.out.print("Masukkan pilihan: ");
            int tipeSegitiga = scanner.nextInt();

            if (tipeSegitiga == 1) {
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                Segitiga sg = new Segitiga(alas, tinggi);
                System.out.println("Luas: " + sg.luas());
                System.out.println("Keliling: " + sg.keliling());
            } else if (tipeSegitiga == 2) {
                System.out.print("Masukkan sisi A: ");
                double sisiA = scanner.nextDouble();
                System.out.print("Masukkan sisi B: ");
                double sisiB = scanner.nextDouble();
                System.out.print("Masukkan sisi C: ");
                double sisiC = scanner.nextDouble();
                Segitiga sg = new Segitiga(sisiA, sisiB, sisiC);
                System.out.println("Luas: " + sg.luas());
                System.out.println("Keliling: " + sg.keliling());
                System.out.println("Jenis Segitiga: " + sg.jenisSegitiga());
            } else if (tipeSegitiga == 3) {
                System.out.print("Masukkan sisi A: ");
                double sisiA = scanner.nextDouble();
                System.out.print("Masukkan sisi B: ");
                double sisiB = scanner.nextDouble();
                System.out.print("Masukkan sudut (dalam derajat): ");
                double sudut = scanner.nextDouble();
                Segitiga sg = new Segitiga(sisiA, sisiB, sudut, true);
                System.out.println("Luas: " + sg.luas());
                System.out.println("Keliling: " + sg.keliling());
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

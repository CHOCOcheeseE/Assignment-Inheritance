# 📚 Belajar OOP Inheritance dalam Java: Menghitung Luas dan Keliling Bangun Datar 🚀

## 📑 Daftar Isi
1. [Pengenalan](#-pengenalan)
2. [Struktur Program](#-struktur-program)
   - [BangunDatar.java (Superclass)](#-bangundatarjava-superclass)
   - [BujurSangkar.java (Subclass)](#-bujursangkarjava-subclass)
   - [PersegiPanjang.java (Subclass)](#-persegipanjangjava-subclass)
   - [Segitiga.java (Subclass)](#-segitigajava-subclass)
3. [Penjelasan Kode](#-penjelasan-kode)
4. [Referensi](#-referensi)
5. [Kembali ke Daftar Isi](#-kembali-ke-daftar-isi)

---

## 🌟 Pengenalan

Dalam dokumentasi ini, kita akan mempelajari konsep **Pemrograman Berorientasi Objek (OOP)** dalam Java, khususnya **inheritance (pewarisan)**, melalui contoh program yang menghitung luas dan keliling berbagai bangun datar seperti **Bujur Sangkar**, **Persegi Panjang**, dan **Segitiga**. Program ini menggunakan konsep inheritance untuk memisahkan logika umum dan spesifik dari setiap bangun datar.

---

## 🏗️ Struktur Program

Program ini terdiri dari satu **superclass** (`BangunDatar`) dan tiga **subclass** (`BujurSangkar`, `PersegiPanjang`, dan `Segitiga`). Setiap subclass mewarisi metode dari superclass dan meng-override metode tersebut untuk menghitung luas dan keliling sesuai dengan bentuknya.

---

### 📂 BangunDatar.java (Superclass)

```java
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
            int jenisSegitiga = scanner.nextInt();
            // Logika untuk segitiga
        }
        scanner.close();
    }
}
```

#### 💡 Penjelasan:
- **`import java.util.Scanner;`**: Digunakan untuk menerima input dari pengguna.
- **`public class BangunDatar`**: Kelas induk (superclass) yang berisi metode umum untuk menghitung luas dan keliling.
- **`luas()` dan `keliling()`**: Metode ini akan di-override oleh subclass.
- **`main()`**: Program utama yang meminta pengguna memilih bangun datar dan menghitung luas serta kelilingnya.

---

### 📂 BujurSangkar.java (Subclass)

```java
public class BujurSangkar extends BangunDatar {
    private double sisi;

    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}
```

#### 💡 Penjelasan:
- **`extends BangunDatar`**: Subclass `BujurSangkar` mewarisi metode dari `BangunDatar`.
- **`private double sisi;`**: Variabel untuk menyimpan panjang sisi.
- **`luas()` dan `keliling()`**: Meng-override metode dari superclass untuk menghitung luas dan keliling bujur sangkar.

---

### 📂 PersegiPanjang.java (Subclass)

```java
public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }
}
```

#### 💡 Penjelasan:
- **`private double panjang, lebar;`**: Variabel untuk menyimpan panjang dan lebar.
- **`luas()` dan `keliling()`**: Meng-override metode dari superclass untuk menghitung luas dan keliling persegi panjang.

---

### 📂 Segitiga.java (Subclass)

```java
public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi1, sisi2, sisi3, sudut;
    private char tipe;

    // Segitiga Siku-siku
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.tipe = 'S';
    }

    // Segitiga dengan 3 sisi (Heron)
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.tipe = 'H';
    }

    // Segitiga dengan 2 sisi & sudut
    public Segitiga(double sisi1, double sisi2, double sudut, boolean pakaiSudut) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sudut = sudut;
        this.tipe = 'A';
    }

    @Override
    public double luas() {
        switch (tipe) {
            case 'S': return (alas * tinggi) / 2;
            case 'H':
                double s = (sisi1 + sisi2 + sisi3) / 2;
                return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
            case 'A': return 0.5 * sisi1 * sisi2 * Math.sin(Math.toRadians(sudut));
            default: return 0;
        }
    }

    public String jenisSegitiga() {
        if (sisi1 == sisi2 && sisi2 == sisi3) return "Segitiga Sama Sisi";
        else if (sisi1 == sisi2 || sisi2 == sisi3 || sisi1 == sisi3) return "Segitiga Sama Kaki";
        else return "Segitiga Sembarang";
    }
}
```

#### 💡 Penjelasan:
- **`private double alas, tinggi, sisi1, sisi2, sisi3, sudut;`**: Variabel untuk menyimpan atribut segitiga.
- **`tipe`**: Menentukan metode perhitungan luas.
- **`luas()`**: Menggunakan rumus yang berbeda berdasarkan tipe segitiga.
- **`jenisSegitiga()`**: Menentukan jenis segitiga berdasarkan panjang sisi.

---

## 📝 Penjelasan Kode

Program ini menggunakan konsep **inheritance** untuk memisahkan logika umum dan spesifik. Superclass `BangunDatar` berisi metode umum, sementara subclass (`BujurSangkar`, `PersegiPanjang`, dan `Segitiga`) meng-override metode tersebut untuk menghitung luas dan keliling sesuai dengan bentuknya.

---

## 📚 Referensi

1. [Java Documentation](https://docs.oracle.com/javase/tutorial/)
2. [OOP Concepts in Java](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
3. [Heron's Formula](https://en.wikipedia.org/wiki/Heron%27s_formula)

---

## 🔙 Kembali ke Daftar Isi

[Kembali ke Daftar Isi](#-daftar-isi)

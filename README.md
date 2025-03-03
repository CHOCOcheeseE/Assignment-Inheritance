# 📚  Assignment Inheritance dalam Java

Selamat datang di dokumentasi pembelajaran saya tentang **Object-Oriented Programming (OOP) Inheritance** dalam bahasa pemrograman Java! 🚀 Di sini, saya akan menjelaskan konsep inheritance (pewarisan) dengan contoh konkret menggunakan bangun datar. Mari kita mulai!

## 📑 Daftar Isi
1. [Pengenalan Inheritance](#-pengenalan-inheritance)
2. [Superclass: BangunDatar](#-superclass-bangun-datar)
3. [Subclass: BujurSangkar](#-subclass-bujursangkar)
4. [Subclass: PersegiPanjang](#-subclass-persegipanjang)
5. [Subclass: Segitiga](#-subclass-segitiga)
6. [Program Utama](#-program-utama)
7. [Penjelasan Kode](#-penjelasan-kode)
8. [Referensi](#-referensi)

---

## 🧠 Pengenalan Inheritance

Inheritance (pewarisan) adalah salah satu konsep fundamental dalam OOP yang memungkinkan sebuah kelas (subclass) untuk mewarisi atribut dan metode dari kelas lain (superclass). Dengan inheritance, kita dapat menghindari duplikasi kode dan membuat struktur program yang lebih terorganisir.

💡 **Contoh:** Jika kita memiliki superclass `BangunDatar`, kita dapat membuat subclass seperti `BujurSangkar`, `PersegiPanjang`, dan `Segitiga` yang mewarisi metode umum seperti `hitungLuas()` dan `hitungKeliling()`.

---

## 🏛️ Superclass: BangunDatar

Superclass `BangunDatar` adalah kelas dasar yang memiliki metode umum untuk menghitung luas dan keliling. Namun, karena setiap bangun datar memiliki cara perhitungan yang berbeda, metode ini akan di-override oleh subclass.

```java
class BangunDatar {
    double hitungLuas() {
        return 0;
    }

    double hitungKeliling() {
        return 0;
    }
}
```

📝 **Catatan:** Metode `hitungLuas()` dan `hitungKeliling()` di sini hanya sebagai placeholder dan akan di-override oleh subclass.

---

## 🔲 Subclass: BujurSangkar

Subclass `BujurSangkar` mewarisi `BangunDatar` dan memiliki atribut `sisi`. Metode `hitungLuas()` dan `hitungKeliling()` di-override untuk menghitung luas dan keliling bujur sangkar.

```java
class BujurSangkar extends BangunDatar {
    double sisi;

    BujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    double hitungKeliling() {
        return 4 * sisi;
    }
}
```

💡 **Tips:** Override memungkinkan kita untuk menyesuaikan perilaku metode yang diwarisi dari superclass.

---

## 📏 Subclass: PersegiPanjang

Subclass `PersegiPanjang` juga mewarisi `BangunDatar` dan memiliki atribut `panjang` dan `lebar`. Metode `hitungLuas()` dan `hitungKeliling()` di-override untuk menghitung luas dan keliling persegi panjang.

```java
class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
```

📝 **Catatan:** Konstruktor digunakan untuk menginisialisasi nilai atribut saat objek dibuat.

---

## 🔺 Subclass: Segitiga

Subclass `Segitiga` mewarisi `BangunDatar` dan memiliki atribut `alas`, `tinggi`, serta tiga sisi. Metode `hitungLuas()` dan `hitungKeliling()` di-override untuk menghitung luas dan keliling segitiga.

```java
class Segitiga extends BangunDatar {
    double alas, tinggi, sisi1, sisi2, sisi3;

    Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    @Override
    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}
```

💡 **Tips:** Pastikan nilai sisi yang dimasukkan valid untuk membentuk segitiga.

---

## 🖥️ Program Utama

Program utama digunakan untuk membuat objek dari masing-masing subclass dan mencetak hasil perhitungan luas dan keliling.

```java
public class Main {
    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar(4);
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        Segitiga sg = new Segitiga(4, 3, 3, 4, 5);

        System.out.println("Luas dan Keliling Bujur Sangkar:");
        System.out.println("Luas: " + bs.hitungLuas());
        System.out.println("Keliling: " + bs.hitungKeliling());

        System.out.println("\nLuas dan Keliling Persegi Panjang:");
        System.out.println("Luas: " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());

        System.out.println("\nLuas dan Keliling Segitiga:");
        System.out.println("Luas: " + sg.hitungLuas());
        System.out.println("Keliling: " + sg.hitungKeliling());
    }
}
```

📝 **Catatan:** Program ini akan mencetak luas dan keliling dari masing-masing bangun datar.

---

## 📖 Penjelasan Kode

1. **Superclass `BangunDatar`:**  
   - Memiliki metode `hitungLuas()` dan `hitungKeliling()` yang akan di-override oleh subclass.

2. **Subclass `BujurSangkar`:**  
   - Meng-override metode untuk menghitung luas dan keliling bujur sangkar.

3. **Subclass `PersegiPanjang`:**  
   - Meng-override metode untuk menghitung luas dan keliling persegi panjang.

4. **Subclass `Segitiga`:**  
   - Meng-override metode untuk menghitung luas dan keliling segitiga.

5. **Program Utama:**  
   - Membuat objek dari masing-masing subclass dan mencetak hasil perhitungan.

---

## 📚 Referensi

- [Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [OOP Concepts in Java](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- [Java Inheritance Tutorial](https://www.javatpoint.com/inheritance-in-java)

---

🔙 [Kembali ke Daftar Isi](#-daftar-isi)

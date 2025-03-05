# 📚 Perjalanan Belajar "Pewarisan OOP" dengan Java

## 📑 Daftar Isi
- [📐 Kelas `BangunDatar` (Superclass)](#-kelas-bangun-datar-superclass)
- [🟦 Kelas `BujurSangkar`](#-kelas-bujursangkar)
- [📏 Kelas `PersegiPanjang`](#-kelas-persegipanjang)
- [🔺 Kelas `Segitiga`](#-kelas-segitiga)
- [🚀 Menjalankan Program](#-menjalankan-program)
- [🔗 Referensi](#-referensi)

---

## 📐 Kelas `BangunDatar` (Superclass)
**Kelas induk** yang menjadi dasar untuk semua bangun datar. Mengandung metode umum untuk menghitung luas dan keliling.

### 🔑 Fitur Utama:
```java
public class BangunDatar {
    public double luas() { return 0; }
    public double keliling() { return 0; }
    
    public static void main(String[] args) {
        // Implementasi menu interaktif
    }
}
```
- 💡 **Polimorfisme**: Metode `luas()` dan `keliling()` di-override oleh subclass
- 🖥️ **Program Utama**: Menyediakan menu interaktif untuk memilih bangun datar

### 🌍 Contoh Penggunaan Dunia Nyata:
- Aplikasi kalkulator geometri
- Sistem penghitungan material konstruksi

[🔙 Kembali ke Daftar Isi](#-daftar-isi)

---

## 🟦 Kelas `BujurSangkar
**Subclass khusus** untuk bujur sangkar. Menggunakan satu sisi untuk menghitung luas dan keliling.

### 🧩 Konstruktor:
```java
public BujurSangkar(double sisi) {
    this.sisi = sisi;
}
```

### 📊 Metode:
| Metode     | Rumus           | Contoh Input | Output |
|------------|-----------------|--------------|--------|
| `luas()`     | sisi²           | sisi=5       | 25     |
| `keliling()` | 4 × sisi        | sisi=3       | 12     |

[🔙 Kembali ke Daftar Isi](#-daftar-isi)

---

## 📏 Kelas `PersegiPanjang
Mewakili persegi panjang dengan panjang dan lebar berbeda.

### 🛠️ Cara Penggunaan:
```java
PersegiPanjang pp = new PersegiPanjang(7, 4);
System.out.println(pp.luas()); // Output: 28
```

### 🔍 Perbandingan dengan Bujur Sangkar:
| Fitur          | Bujur Sangkar | Persegi Panjang |
|----------------|---------------|-----------------|
| Jumlah sisi unik | 1             | 2               |
| Rumus keliling | 4×sisi        | 2×(panjang+lebar) |

[🔙 Kembali ke Daftar Isi](#-daftar-isi)

---

## 🔺 Kelas `Segitiga
**Paling kompleks** dengan 3 jenis konstruktor berbeda untuk berbagai tipe segitiga.

### 🎛️ Jenis Konstruktor:
1. **Segitiga Siku-siku**  
   ```java
   new Segitiga(alas, tinggi);
   ```
2. **Rumus Heron (3 sisi)**  
   ```java
   new Segitiga(sisiA, sisiB, sisiC);
   ```
3. **Dua Sisi + Sudut**  
   ```java
   new Segitiga(sisi1, sisi2, sudut, true);
   ```

### 🌟 Metode Khusus:
```java
public String jenisSegitiga() {
    // Mendeteksi jenis segitiga berdasarkan sisi
}
```
- 🔎 Mengembalikan: "Sama Sisi", "Sama Kaki", atau "Sembarang"

### 📝 Contoh Perhitungan Sudut:
```java
// Menggunakan hukum cosinus
Math.cos(Math.toRadians(sudut))
```

[🔙 Kembali ke Daftar Isi](#-daftar-isi)

---

## 🚀 Menjalankan Program
**Langkah-langkah eksekusi:**
1. Kompilasi semua file `.java`:
   ```bash
   javac BangunDatar.java
   ```
2. Jalankan program utama:
   ```bash
   java BangunDatar
   ```
3. Ikuti menu interaktif:
   ```
   1. Bujur Sangkar
   2. Persegi Panjang
   3. Segitiga
   ```

### 🧪 Test Case Contoh:
| Pilihan | Input           | Luas  | Keliling |
|---------|-----------------|-------|----------|
| 1       | sisi=4          | 16    | 16       |
| 2       | panjang=3, lebar=6 | 18    | 18       |
| 3 (t1)  | alas=5, tinggi=12 | 30    | 30       |

[🔙 Kembali ke Daftar Isi](#-daftar-isi)

---

## 🔗 Referensi
- 📜 [Dokumentasi Resmi Java](https://docs.oracle.com/javase/8/docs/api/)
- 📖 [Tutorial Pewarisan OOP oleh Oracle](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- 🎥 [Video Tutorial: Polimorfisme di Java](https://www.youtube.com/watch?v=0xw06loTm1k)

[🔙 Kembali ke Daftar Isi](#-daftar-isi)
``` 

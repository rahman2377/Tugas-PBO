/*Nama : Rahman Ramadhan
Nim : 13020220128
Tanggal : Rabu,27 Maret 2024
 */

//kode program evaluasi praktikum 4 NO.2

public class Utamaa {
    public static void main(String[] args) {
        Orang orang = new Orang();
        orang.nama = "Andi"; // isi sesuai nama anda
        System.out.println("Stb : " + orang.nama);

        // Memanggil metode info() dari kelas Orang
        Orang.info();

        // Memanggil metode info() dari kelas Mahasiswa
        Mahasiswa.info();
    }
}
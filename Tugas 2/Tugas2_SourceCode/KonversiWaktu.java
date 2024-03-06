/*Nama : Rahman Ramadhan
Nim : 13020220128
 */

import java.util.Scanner;
public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner konverswktu = new Scanner(System.in);

        //input detik dari user
        System.out.print("Masukkan Total Detik : ");

        //mengkonversi inputan total detik dari user ke jam,menit, dan detik
        long totalDetik = konverswktu.nextLong();
        long detikSekarang = totalDetik % 60;
        long totalMenit = totalDetik / 60;
        long menitSekarang = totalMenit % 60;
        long totalJam = totalMenit / 60;
        long jamSekarang = totalJam % 24;

        String HasilKonversi = String.format("%02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang);

        //output hasil konversi(jam:menit:detik)
        System.out.println("Tampil Waktu         : " + HasilKonversi);

        konverswktu.close();
    }
}
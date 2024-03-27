package Evaluasi;

/*
Nama             : Rahman Ramadhan
Nim              : 13020220128
Kelas            : A4 -TI
Modul            : Modul 4, No 3.
Waktu Pengerjaan : 27/03/2024, 08:30 WITA
*/
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

import evaluasi.HitungNilaiAkhir.HitungNilaiAkhir;
import evaluasi.mahasiswa.Identitas;
import evaluasi.mahasiswa.Nilai;

public class Utama {
    public static void main(String[] args) throws IOException {
        Identitas identitas = new Identitas();
        Nilai nilai = new Nilai();
        HitungNilaiAkhir hitungNilai = new HitungNilaiAkhir();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama         : ");
        identitas.setNama(scanner.nextLine());
        System.out.print("Masukkan Stambuk      : ");
        identitas.setStambuk(scanner.nextLine());

        System.out.print("Masukkan Nilai Tugas 1: ");
        nilai.setTugas1(scanner.nextInt());
        System.out.print("Masukkan Nilai Tugas 2: ");
        nilai.setTugas2(scanner.nextInt());
        System.out.print("Masukkan Nilai MID    : ");
        nilai.setMid(scanner.nextInt());
        System.out.print("Masukkan Nilai UAS    : ");
        nilai.setUas(scanner.nextInt());

        double tugas = hitungNilai.NilaiTugas(nilai.getTugas1(), nilai.getTugas2());
        double na = hitungNilai.nilaiAkhir(tugas, nilai.getMid(), nilai.getUas());

        JOptionPane.showMessageDialog(null, "Nama: " + identitas.getNama() + "\nStambuk: " + identitas.getStambuk());
        JOptionPane.showMessageDialog(null, "Nilai Tugas: " + tugas + "\nNilai MID: " + nilai.getMid() + "\nNilai UAS: "
                + nilai.getUas() + "\nNilai Akhir: " + na);
    }
}
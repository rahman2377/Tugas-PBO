package Evaluasi.HitungNilai;

/*
Nama             : Rahman Ramadhan
Nim              : 13020220128
Kelas            : A4 -TI
Modul            : Modul 4, No 3.
Waktu Pengerjaan : 26/03/2024, 14:15 WITA
*/
public class HitungNilaiAkhir {
    public double NilaiTugas(int tugas1, int tugas2) {
        return (tugas1 + tugas2) * 2.0;
    }

    public double nilaiAkhir(double tugas, int mid, int uas) {
        return (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
    }
}
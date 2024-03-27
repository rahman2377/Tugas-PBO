package Evaluasi.Mahasiswa;

/*
Nama             : Rahman Ramadhan
Nim              : 13020220128
Kelas            : A4 -TI
Modul            : Modul 4, No 3.
Waktu Pengerjaan : 26/03/2024, 20:50 WITA
*/
public class Nilai {
    private int tugas1;
    private int tugas2;
    private int mid;
    private int uas;

    public void setTugas1(int tugas1) {
        this.tugas1 = tugas1;
    }

    public int getTugas1() {
        return tugas1;
    }

    public void setTugas2(int tugas2) {
        this.tugas2 = tugas2;
    }

    public int getTugas2() {
        return tugas2;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getMid() {
        return mid;
    }

    // Setter dan Getter untuk variabel uas
    public void setUas(int uas) {
        this.uas = uas;
    }

    public int getUas() {
        return uas;
    }
}
/*
Nama             : Rahman Ramadhan
Nim              : 13020220128
Kelas            : A4 -TI
Modul            : Modul 3, No 7.
Waktu Pengerjaan : 27/03/2024, 14:00 WITA
*/

import java.util.HashMap;
import java.util.Scanner;

public class HashMap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println("\n=== Masukkan kunci-nilai ke dalam HashMap (ketik 'keluar' untuk mengakhiri) ===");

        String input;
        while (true) {
            System.out.print("Masukkan kunci(Karakter)  : ");
            input = scanner.nextLine();

            if (input.equals("keluar")) {
                break;
            }

            String key = input;

            System.out.print("Masukkan nilai(Bil.Bulat) : ");
            input = scanner.nextLine();
            int value = Integer.parseInt(input);

            hashMap.put(key, value);
        }

        System.out.println("\nIsi HashMap :");
        for (String key : hashMap.keySet()) {
            System.out.println("Kunci : " + key + ", Nilai : " + hashMap.get(key));
        }

        scanner.close();
    }
}
/*
Nama:Rahman Ramadhan
Nim :13020220128
(Minggu/25-2-2024/15:06)
*/


public class Oprator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        boolean Bool1, Bool2, TF ; 
        int i,j, hsl ;
        float x,y,res;
        /* algoritma */
        System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");

        Bool1 = true; 
        Bool2 = false;
        TF = Bool1 && Bool2 ; /* Boolean AND */ 
        System.out.println("Hasil Boolean AND: " + TF);

        TF = Bool1 || Bool2 ; /* Boolean OR */ 
        System.out.println("Hasil Boolean OR: " + TF);

        TF = ! Bool1 ; /* NOT */
        System.out.println("Hasil Boolean NOT: " + TF);

        TF = Bool1 ^Bool2; /* XOR */
        System.out.println("Hasil Boolean XOR: " + TF);

        /* operasi numerik */
        i = 5; 
        j = 2 ;
        hsl = i+j; 
        System.out.println("Hasil Penjumlahan: " + hsl);

        hsl = i - j; 
        System.out.println("Hasil Pengurangan: " + hsl);

        hsl = i / j; 
        System.out.println("Hasil Pembagian: " + hsl);

        hsl = i * j; 
        System.out.println("Hasil Perkalian: " + hsl);

        hsl = i /j ; /* pembagian bulat */
        System.out.println("Hasil Pembagian Bulat: " + hsl);

        hsl = i%j ; /* sisa modulo */
        System.out.println("Hasil Sisa Modulo: " + hsl);

        /* operasi numerik */ 
        x = 5 ; 
        y = 5 ;
        res = x + y; 
        System.out.println("Hasil Penjumlahan Float: " + res);

        res = x - y; 
        System.out.println("Hasil Pengurangan Float: " + res);

        res = x / y; 
        System.out.println("Hasil Pembagian Float: " + res);

        res = x * y;
        System.out.println("Hasil Perkalian Float: " + res);

        /* operasi relasional numerik */
        TF = (i==j); 
        System.out.println("Hasil Relasional ==: " + TF);

        TF = (i!=j);
        System.out.println("Hasil Relasional !=: " + TF);

        TF = (i < j); 
        System.out.println("Hasil Relasional <: " + TF);

        TF = (i > j); 
        System.out.println("Hasil Relasional >: " + TF);

        TF = (i <= j); 
        System.out.println("Hasil Relasional <=: " + TF);

        TF = (i >= j);
        System.out.println("Hasil Relasional >=: " + TF);

        /* operasi relasional numerik */ 
        TF = (x != y);
        System.out.println("Hasil Relasional Float !=: " + TF);

        TF = (x < y); 
        System.out.println("Hasil Relasional Float <: " + TF);

        TF = (x > y); 
        System.out.println("Hasil Relasional Float >: " + TF);

        TF = (x <= y); 
        System.out.println("Hasil Relasional Float <=: " + TF);

        TF = (x >= y);
        System.out.println("Hasil Relasional Float >=: " + TF);
    }
}
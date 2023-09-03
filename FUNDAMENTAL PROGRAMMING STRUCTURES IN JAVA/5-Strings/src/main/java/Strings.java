/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
//mengimpor class scanner untuk bisa menggunakan fungsi-fungsi nya untuk mengambil input dari keyboard
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //menginput nilai menggunakan scanner dan diberi nama input
        Scanner input = new Scanner(System.in);

        // Menginput nilai string dan disimpan di variabel A
       
        String A = input.nextLine();
        // Menginput nilai string dan disimpan di variabel B
        String B = input.nextLine();

        // Menjumlahkan panjang(jumlah huruf) string A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // Membandingkan string A dan B leksikografis(urutan kamus)
        //jika A secara leksikografis lebih besar dari B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }//jika tidak, maka code dibawah yang dijalankan
        else {
            System.out.println("No");
        }

        // Mencapitalize huruf pertama dalam string A dan B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        // Menggabungkan string A dan string B di dalam satu baris  
        System.out.println(capitalizedA + " " + capitalizedB);

        //perintah untuk menutup objek input setelah penggunaan selesai.
        input.close();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.math.BigInteger;

public class SoalNo6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        BigInteger bigInteger = input.nextBigInteger();
        BigInteger bigInteger2 = input.nextBigInteger();

        try {
            // Mengonversi masukan string menjadi objek BigInteger
            BigInteger jumlah = bigInteger.add(bigInteger2);
            BigInteger kali = bigInteger.multiply(bigInteger2);
            
            System.out.println("Hasil Jumlah : " + jumlah);
            System.out.println("Hasil Kali : " + kali);
            
        } catch (NumberFormatException e) {
            System.err.println("Masukan tidak valid. Harap masukkan angka yang benar.");
        }
    }
}

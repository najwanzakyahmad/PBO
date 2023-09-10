/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class SoalNo4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        float gajiPokok = 500000;
        float hargaPerItem = 50000;
        float bonusPotongan = 0;
        int penjualan = input.nextInt();
        
        if (penjualan >= 40 && penjualan <= 80) {
            bonusPotongan = (float) (penjualan * hargaPerItem * 0.25);
        } else if (penjualan > 80) {
            bonusPotongan = (float) (penjualan * hargaPerItem * 0.35);
        } else if (penjualan < 15) {
            bonusPotongan = (float) ((penjualan - 15) * hargaPerItem * 0.15);
        } else if(penjualan >= 15 && penjualan < 40){
            bonusPotongan = (float) (penjualan * hargaPerItem * 0.10);
        }
        
        float hasil = bonusPotongan + gajiPokok; 
        
        // Mencetak nilai hasil
        System.out.println("Gaji yang diterima: Rp. " + hasil);
    }
}

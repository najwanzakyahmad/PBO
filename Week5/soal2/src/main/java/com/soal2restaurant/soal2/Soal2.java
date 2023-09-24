/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.soal2restaurant.soal2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.lang.String;



class produk{
    String nama_produk;     
    int harga;
    int qty;
    String keputusan;
        
    public produk(String nama_produk, int harga, int qty){
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.qty = qty;
    }        
}
    
class penjualan{
    produk produk_penjualan;
    int harga_total;
    int quantity;
        
    public penjualan(produk produk_penjualan, int quantity){
        this.produk_penjualan = produk_penjualan;
        this.quantity = quantity;
    }
        
    public int hitung_total_permenu(){
       return produk_penjualan.harga * quantity;
    }
}
    
public class Soal2 {    
    public static void main(String[] args) {
        int no_menu = 0;
        Scanner input = new Scanner (System.in);
              
        produk[] menu = new produk[10];
        menu[0] = new produk("Batagor", 5000, 20);
        menu[1] = new produk("Roti Bakar", 12000, 20);
        menu[2] = new produk("Indomie + telor", 10000, 20);
        menu[3] = new produk("Kwetiaw", 12000, 20);
        menu[4] = new produk("Nasi Goreng", 12000, 20);
        menu[5] = new produk("Air Mineral", 3000, 20);
        menu[6] = new produk("Es Teh Manis", 4000, 20);
        menu[7] = new produk("Jus Alpukat", 8000, 20);
        menu[8] = new produk("Teh Botol", 5000, 20);
        menu[9] = new produk("Kopi", 3000, 20);
        
        penjualan[] daftar_penjualan = new penjualan[10];
        int jumlah_pesanan = 0;
        int total_harga = 0;
        boolean pesan_lagi = true;
        
        while(pesan_lagi){
            System.out.println("Daftar Menu");
            System.out.println("--------------");
            for (int i = 0; i < menu.length; i++){
                if (menu[i] != null){
                    System.out.println(i+1 + "." + menu[i].nama_produk + "Rp." + menu[i].harga);
                   
                }
            }
            boolean kondisi = true;
            while(kondisi){
                System.out.println("Pilih no menu yang dipesan : ");
                no_menu = input.nextInt();
                if (no_menu > menu.length || no_menu < 0){
                    System.out.println("Masukan ulang, karena nomor yang anda masukan salah");
                    kondisi = true;
                }else{
                    kondisi = false;
                }
            }
            
            System.out.println("jumlah yang ingin dipesan " );
            int jumlah_pesanan_permenu = input.nextInt();
            
            daftar_penjualan[jumlah_pesanan] = new penjualan(menu[no_menu-1], jumlah_pesanan_permenu);
            daftar_penjualan[jumlah_pesanan].produk_penjualan.qty -= jumlah_pesanan_permenu; 
            jumlah_pesanan += 1;
            total_harga += menu[no_menu - 1].harga * jumlah_pesanan_permenu;
            
            System.out.print("Pesan item makanan lain? (Ya/Tidak): ");
            String pesanLagiStr = input.next();
            pesan_lagi = pesanLagiStr.equalsIgnoreCase("Ya");
        }
        
        System.out.println("Pesanan anda : ");
        for(int i = 0; i < jumlah_pesanan; i++ ){
            //System.out.println(daftar_penjualan[i].produk_penjualan.nama_produk + daftar_penjualan[i].quantity + "Rp." + daftar_penjualan[i].produk_penjualan.harga + daftar_penjualan[i].hitung_total_permenu());            
            System.out.printf("%-20s %-5d Rp.%-10d Rp.%-10d sisa : %-10d%n",
                            daftar_penjualan[i].produk_penjualan.nama_produk,
                            daftar_penjualan[i].quantity,
                            daftar_penjualan[i].produk_penjualan.harga,
                            daftar_penjualan[i].hitung_total_permenu(),
                            daftar_penjualan[i].produk_penjualan.qty);
        }
        
        System.out.println("Total harga : Rp." + total_harga);
        
        
        
        
    }
}

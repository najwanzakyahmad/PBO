/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalno1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SoalNo1 {
    
    public static void main(String[] args) {
        //deklarasi variabel string bertipe data string
        String string;
    
        //deklarasi input untuk melakukan input nilai
        Scanner input = new Scanner(System.in);
        
        //melakukan input nilai berupa string
        string = input.nextLine();
        
        //melakukan pemisahan string menjadi kata. dengan pola jika bertemu karakter spasi ! , ? . _ ' @ 
        String[] arrString = string.split("[\\s!,?._'@]");
  
        //menampilkan jumlah kata pada string yang berhasil dipisah
        System.out.println(arrString.length);
        
        for (String s : arrString) 
            System.out.println(s); 
            
    }
}

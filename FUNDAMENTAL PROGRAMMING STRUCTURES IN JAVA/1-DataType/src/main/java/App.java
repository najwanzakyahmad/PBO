/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
//mengimpor class scanner untuk bisa menggunakan fungsi-fungsi nya untuk mengambil input dari keyboard
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);//menginput nilai menggunakan scanner dan diberi nama input   
        
        String a = input.nextLine();//menginput string pada variabel a, menggunakan string agar bisa menginput nilai yang banyak
       try{
        
         long b = Long.parseLong(a);//mengkonversi nilai string pada nilai a ke long, kemudian disimpan di variabel b   
           
         System.out.println(a + " can be fitted in:");
         //pengecekan pertama jika nilai yang diinput cocok disimpan di tipe data byte, maka akan melakukan print -byte
         //min byte = -128, max byte = 127
         if (b >= Byte.MIN_VALUE && b <= Byte.MAX_VALUE) { 
             System.out.println("- Byte");
         }
          //pengecekan kedua jika nilai yang diinput cocok disimpan di tipe data short, maka akan melakukan print -short
          //min short = -32768, max short =  32767
          if (b >= Short.MIN_VALUE && b <= Short.MAX_VALUE) {
             System.out.println("- Short");
         }
          //pengecekan ketiga jika nilai yang diinput cocok disimpan di tipe data integer, maka akan melakukan print -integer
          //min integer = -2147483648, max integer =  2147483647
          if (b >= Integer.MIN_VALUE && b <= Integer.MAX_VALUE) {
             System.out.println("- Integer");
         }
          //pengecekan keempat jika nilai yang diinput cocok disimpan di tipe data long, maka akan melakukan print -long
          //min long = -9223372036854775808, max long = 9223372036854775807
          if (b >= Long.MIN_VALUE && b <= Long.MAX_VALUE) {
             System.out.println("- Long");
         } 
       }
        /*jika nilai yang dikonveri ke long gagal(nilai melebihi batas maksimal penyimpanan atau selain numerik), maka tidak akan 
          error, dan menjalankan program dibawah*/
        catch(NumberFormatException e){
            System.out.println(a + " can't be fitted anywhere.");
       }
    }
}

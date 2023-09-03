/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
public class Constants2 {
    //deklarasi variabel CM_PER_INCH dengan tipe data double 
    //menggunakan kata final bertujuan untuk memiliki nilai konstan (konstanta) dengan tipe data double
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
     //variabel bernama paperWidth dengan tipe data double, dan nilai 8.5
     double paperWidth = 8.5;
     //variabel dengan nama paperHeight dengan tipe data double, bernilai 11
     double paperHeight = 11;
     //menampilkan hasil paper size dalam berntuk centimeter, lebar = paperWidth * CM_PER_INCH, dan tinggi = paperHeight * CM_PER_INCH
     System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    } 
}

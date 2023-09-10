/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soalno3;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class SoalNo3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input sistem berhitung dengan spasi");
        //melakukan input nilai sebagai string dan disimpan di variabel string
        String string = input.nextLine();
        //melakukan pemecahan menjadi kata jika bertemu spasi
        String[] kataString = string.split(" ");
        
        //kata pertama akan dirubah menjadi integer dan disimpan di variabel A
        int A = Integer.parseInt(kataString[0]);
        //kata kedua akan tetap menjadi  string dan disimpan di variabel operator
        String operator = kataString[1];
        //kata ketiga akan dirubah menjadi integer dan disimpan di variabel B
        int B = Integer.parseInt(kataString[2]);
        
        // Melakukan operasi matematika sesuai operator
        int hasil = 0;
        switch (operator) {
            case "+":
                hasil = A + B;
                break;
            case "-":
                hasil = A - B;
                break;
            case "*":
                hasil = A * B;
                break;
            case "/":
                hasil = A / B;
                break;
            case "%":
                hasil = A % B;
                break;
            default:
                System.out.println("Operator tidak valid"); //jika operatornya tidak ada yang sama diatas
                break;
        }
        
        
        // Menampilkan hasil operasi
        if (!operator.equals("Operator tidak valid")) {
            System.out.println(hasil);
        }
        
    }
}

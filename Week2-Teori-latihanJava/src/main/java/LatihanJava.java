/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class LatihanJava {

    public static void main(String[] args) {
        float nilaiTugas, nilaiUTS, nilaiUAS;
        float nilaiAkhir;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan Nilai Tugas : " );
        nilaiTugas = keyboard.nextFloat();
        
        System.out.print("Masukan Nilai UTS : " );
        nilaiUTS = keyboard.nextFloat();
        
        System.out.print("Masukan Nilai UAS : " );
        nilaiUAS = keyboard.nextFloat();
        
        
        nilaiAkhir =(float) ((0.2 * nilaiTugas)+(0.35 * nilaiUTS)+(0.45 * nilaiUAS)); 
       
        System.out.println("Nilai akhir anda : " + nilaiAkhir );
        if(nilaiAkhir >= 85){
            System.out.println("Grading : A");     
        }
        else if(nilaiAkhir <= 84 && nilaiAkhir >= 75){
            System.out.println("Grading : B");
        }
        else if(nilaiAkhir <= 74 && nilaiAkhir >= 65){
            System.out.println("Grading : C");
        }
        else if(nilaiAkhir <= 64 && nilaiAkhir >= 50){
            System.out.println("Grading : D");
        }
        else{
            System.out.println("Grading : E");
        }
        
              
    }
}
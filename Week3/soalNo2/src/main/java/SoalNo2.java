/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
//mengimpor kelas ArrayList untuk menyimpan data secara dinamis
import java.util.ArrayList;

public class SoalNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //membuat 2 ArrayList dengan nama "kata" dan "angka"
        ArrayList<String> kata = new ArrayList<>();
        ArrayList<Integer> angka = new ArrayList<>();
       
        //melakukan looping, agar bisa input nilai dinamis, dengan kondisi true
        while(true) {
            //menginput string yang nantinya akan disimpan di ArrayList kata, jika kata yang diinput selai "exit"
            String inputKata = input.next();
            
            //jika yang diinput kata "exit" maka akan keluar dari looping, dengan break
            if(inputKata.equalsIgnoreCase("exit")){
                break;
            }
            //jika yang diinput selain kata "exit", maka akan lanjutkan input angka
            else{
                int inputAngka = input.nextInt();

                //string inputKata akan di masukan di ArrayList kata
                kata.add(inputKata);
                //integer inputAngka akan di masukan di ArrayList angka
                angka.add(inputAngka);
            }                            
        }
        
        //menampilkan nilai yang tadi disimpan di ArrayList dengan looping for
        System.out.println("================================");
        for (int j = 0; j < kata.size(); j++){
            //setiap indeks dari yang diambil akan masuk ke metode layOut untuk formating penulisan
            layOut(kata.get(j), angka.get(j));
        }
        System.out.println("================================");

        input.close();
    }

    private static void layOut(String inputLine, int number) {
        // melakukan formating penulisan menggunakan fungsi yang ada pada string, yaitu format()
        //%-15s artinya menyiapkan minimal 15 karakter untuk tipe data string, dan - artinya dimulai dari kiri
        //%03d artinya menyiapkan minimal 3 karakter untuk tipe data integer, jika kurang dari 3 digit, maka ditambahkan 0 didepan angka
        //hasil formating disimpan di variabel formatedString
        String formatedString = String.format("%-15s%03d", inputLine, number);

        // menampilkan hasil formating      .
        System.out.println(formatedString);
    }
}


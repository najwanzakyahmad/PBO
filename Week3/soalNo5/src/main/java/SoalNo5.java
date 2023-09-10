/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class SoalNo5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String platNomor = input.nextLine();

        platNomor = platNomor.replaceAll(" ", "");
        long platNomorAngka = Long.parseLong(platNomor);

        if ((platNomorAngka - 999999) % 5 != 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}

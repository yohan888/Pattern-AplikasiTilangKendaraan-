/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.pattern.aplikasi.tilang.kendaraan;

import java.util.Scanner;

/**
 *
 * @author Banjarnahor Yohan's
 */
public class BuilderPatternAplikasiTilangKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ulang = "y";
        TilangBuilder tilangBuilder = new TilangBuilder();
        
        while (ulang.equals("Y") || ulang.equals("y")){
            Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("  Aplikasi Tilang Kendaraan  ");
        System.out.println("=============================");
        System.out.println("            Menu             ");
        System.out.println(" 1. MOTOR");
        System.out.println(" 2. MOBIL");
        System.out.println("-----------------------------");
        System.out.print(" Masukkan Pilihan Anda : ");
        int pilih = input.nextInt();
        System.out.println("-----------------------------");
        
            if(pilih==1){
                Tilang Motor = tilangBuilder.prepareMotor();
                Motor.showItems();
            }
            else if(pilih==2){
                Tilang Mobil = tilangBuilder.prepareMobil();
                Mobil.showItems();
            }
            else{
                System.out.println("Maaf Menu Tidak Tersedia");
            }
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("Ingin Mengulang (y/t) : ");
            ulang = input.next();
            if(ulang.equals("T")|| ulang.equals("t")){
                System.out.println("\n---TERIMAKASIH TELAH BERKUNJUNG---");
            }

        }
    }
    
}

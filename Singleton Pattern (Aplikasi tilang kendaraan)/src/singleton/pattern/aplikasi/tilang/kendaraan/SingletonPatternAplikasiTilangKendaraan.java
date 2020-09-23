/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.pattern.aplikasi.tilang.kendaraan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SingletonPatternAplikasiTilangKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ulang = "y";
        
        Motor motor = Motor.getInstance();
        Mobil mobil = Mobil.getInstance();
        
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
               motor.outputmotor();
            }
            else if(pilih==2){
               mobil.outputmobil();
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
    
    


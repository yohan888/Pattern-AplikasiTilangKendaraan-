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
public class TilangBuilder {
    
    public Tilang prepareMotor(){
        
        Tilang tilang = new Tilang();

            Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("      Info Tilang Motor      ");
        System.out.println("=============================");
        System.out.println("            Menu             ");
        System.out.println(" 1. SIM");
        System.out.println(" 2. STNK");
        System.out.println(" 3. Helm");
        System.out.println("-----------------------------");
        System.out.print(" Masukkan Pilihan Anda : ");
        int pilih = input.nextInt();
        System.out.println("-----------------------------");
            
            if(pilih==1){
                tilang.addKendaraan(new SIM());
            }
            else if(pilih==2){
                tilang.addKendaraan(new STNK());
            }
            else if(pilih==3){
                tilang.addKendaraan(new Helm());
            }
            else{
                System.out.println("Maaf Menu Tidak Tersedia");
                
            }
            return tilang;
        }
       
    public Tilang prepareMobil(){
        Tilang tilang = new Tilang();

            Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("      Info Tilang Mobil      ");
        System.out.println("=============================");
        System.out.println("            Menu             ");
        System.out.println(" 1. SIM");
        System.out.println(" 2. STNK");
        System.out.println(" 3. SeatBelt");
        System.out.println("-----------------------------");
        System.out.print(" Masukkan Pilihan Anda : ");
        int pilih = input.nextInt();
        System.out.println("-----------------------------");
            
            if(pilih==1){
                tilang.addKendaraan(new SIM2());
            }
            else if(pilih==2){
                tilang.addKendaraan(new STNK2());
            }
            else if(pilih==3){
                tilang.addKendaraan(new SeatBelt());
            }
            else{
                System.out.println("Maaf Menu Tidak Tersedia");
                
            }
            return tilang;
        
    }
}


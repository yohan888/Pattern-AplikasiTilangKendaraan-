/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *  
 */
package pkgabstract.factory.aplikasi.tilang.kendaraan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class AbstractFactoryAplikasiTilangKendaraan {
    public static void main(String[] args){
        String ulang = "y";
        
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
            System.out.println("=============================");
            System.out.println("     Daftar Tilang Motor     ");
            System.out.println("=============================");
            System.out.println("            Menu             ");
            System.out.println(" 1. SIM");
            System.out.println(" 2. STNK");
            System.out.println(" 3. Helm");
            System.out.println("-----------------------------");
            System.out.print(" Masukkan Pilihan Anda : ");
            pilih = input.nextInt();
            System.out.println("-----------------------------");
                
                if(pilih==1){
                    MotorFactory motorFactory = new MotorFactory();
                    Motor motor1 = motorFactory.getMotor("SIM");
                    motor1.roda2();
                }
                else if(pilih==2){
                    MotorFactory motorFactory = new MotorFactory();
                    Motor motor2 = motorFactory.getMotor("STNK");
                    motor2.roda2();
                }
                else if(pilih==3){
                    MotorFactory motorFactory = new MotorFactory();            
                    Motor motor3 = motorFactory.getMotor("Helm");
                    motor3.roda2();
                }
                else{
                    System.out.println("Maaf Menu Tidak Tersedia");
                }
        }
            
        else if(pilih==2){
            System.out.println("=============================");
            System.out.println("     Daftar Tilang Mobil     ");
            System.out.println("=============================");
            System.out.println("            Menu             ");
            System.out.println(" 1. SIM");
            System.out.println(" 2. STNK");
            System.out.println(" 3. SeatBelt");
            System.out.println("-----------------------------");
            System.out.print(" Masukkan Pilihan Anda : ");
            pilih = input.nextInt();
            System.out.println("-----------------------------");  
            
                if(pilih==1){
                    AbstractFactory mobilFactory = FactoryProducer.getFactory("Mobil");
                    Mobil mobil1 = mobilFactory.getMobil("SIM2");
                    mobil1.roda4();
                }
                else if(pilih==2){
                    AbstractFactory mobilFactory = FactoryProducer.getFactory("Mobil");
                    Mobil mobil2 = mobilFactory.getMobil("STNK2");
                    mobil2.roda4();
                }
                else if(pilih==3){
                    AbstractFactory mobilFactory = FactoryProducer.getFactory("Mobil");
                    Mobil mobil3 = mobilFactory.getMobil("Seatbelt");
                    mobil3.roda4();
                }
                else{
                    System.out.println("Maaf Menu Tidak Tersedia");
                }
        }
            
        else{            
             System.out.println("Maaf Menu Tidak Tersedia");
        }
            System.out.print("Ingin Mengulang (y/t) : ");
            ulang = input.next();
            if(ulang.equals("T")|| ulang.equals("t")){
                System.out.println("TERIMAKASIH");
            }
        }
    
    }
}



package pattern.factory.aplikasi.tilang.kendaraan;

import java.util.Scanner;

public class PatternFactoryAplikasiTilangKendaraan {

    public static void main(String[] args) {
        String ulang = "y";
      
        while (ulang.equals("Y") || ulang.equals("y")){
            Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("    Aplikasi Tilang Motor    ");
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
            System.out.print("Ingin Mengulang (y/t) : ");
            ulang = input.next();
            if(ulang.equals("T")|| ulang.equals("t")){
                System.out.println("TERIMAKASIH");
            }
            
        }
        
    }
    
}


package singleton.pattern.aplikasi.tilang.kendaraan;

import java.util.Scanner;

public class Mobil {
    private static Mobil instance = new Mobil();
   
    private Mobil(){}
    
    public static Mobil getInstance(){
    return instance;
    }
    
    public void outputmobil(){
        Scanner input = new Scanner(System.in);
      
        String nama, jenis, surat, plat;
  
        System.out.print("Nama Pelanggar Mobil     : ");
        nama = input.nextLine();
     
        System.out.println("Jenis Pelanggaran Mobil");
        System.out.print("(SIM/ STNK/ SeatBelt)    : ");
        jenis = input.nextLine();
     
        System.out.println("Surat Tilang Mobil");
        System.out.print("(Merah/ Biru)            : ");
        surat = input.nextLine();
    
        System.out.print("Merk Mobil + Plat        : ");
        plat = input.nextLine();
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                            INFO DATA PENILANGAN MOTOR                         ");
        System.out.println("\nNama Pelanggar Mobil    = "+nama);
        System.out.println("Jenis Pelanggaran Mobil");
        System.out.println("(SIM/ STNK/ SeatBelt)   = "+jenis);
        System.out.println("Surat Tilang Mobil");
        System.out.println("(Merah/ Biru)           = "+surat);
        System.out.println("Merk Mobil + Plat       = "+plat);
    }
    
}

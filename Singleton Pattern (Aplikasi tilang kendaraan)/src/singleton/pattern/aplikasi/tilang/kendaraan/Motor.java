
package singleton.pattern.aplikasi.tilang.kendaraan;

import java.util.Scanner;

public class Motor {
     
    private static Motor instance = new Motor();

    static void nama() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private Motor(){}

    public static Motor getInstance(){
    return instance;
    }
    
    public void outputmotor(){
        Scanner input = new Scanner(System.in);
      
        String nama, jenis, surat, plat;
  
        System.out.print("Nama Pelanggar Motor     : ");
        nama = input.nextLine();
     
        System.out.println("Jenis Pelanggaran Motor");
        System.out.print("(SIM/ STNK/ Helm)        : ");
        jenis = input.nextLine(); 
     
        System.out.println("Surat Tilang Motor");
        System.out.print("(Merah/ Biru)            : ");
        surat = input.nextLine();
    
        System.out.print("Merk Motor + Plat        : ");
        plat = input.nextLine();
    
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                            INFO DATA PENILANGAN MOTOR                         ");
        System.out.println("\nNama Pelanggar Motor    = "+nama);
        System.out.println("Jenis Pelanggaran Motor");
        System.out.println("(SIM/ STNK/ Helm)       = "+jenis);
        System.out.println("Surat Tilang Motor");
        System.out.println("(Merah/ Biru)           = "+surat);
        System.out.println("Merk Motor + Plat       = "+plat);
    }
    
}

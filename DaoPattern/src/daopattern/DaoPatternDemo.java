
package daopattern;

import java.util.Scanner;

public class DaoPatternDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        String ulang = "y";
        PenilanganDao penilanganDao = new PenilanganDaoImpl();
        
        while (ulang.equals("Y") || ulang.equals("y")){
            Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("  Aplikasi Tilang Kendaraan  ");
        System.out.println("=============================");
        System.out.println("            Menu             ");
        System.out.println(" 1. Daftar Data Tilangan");
        System.out.println(" 2. Penjelasan & Exit");
        System.out.println("-----------------------------");
        System.out.print(" Masukkan Pilihan Anda : ");
        int pilih = input.nextInt();
        System.out.println("-----------------------------");
            
            if(pilih==1){
                //print all students
                for (Penilangan penilangan : penilanganDao.getAllPenilangans()) {
                    System.out.println("Penilangan: [PlatNo :" +penilangan.getPlatNo
                    ()+", Name : "+penilangan.getName()+" ]");
                }
                //update student 
                Penilangan penilangan = penilanganDao.getAllPenilangans().get(0);
                penilangan.setName("Glenn");
                penilanganDao.updatePenilangan(penilangan);
                //get all student
                penilanganDao.getPenilangan(0);
                System.out.println("Penilangan: [PlatNo : "
                +penilangan.getPlatNo()+", Name : "+penilangan.getName()+" ]");
            }
            else if(pilih==2){
                System.out.println("Penjelasan....");
                System.out.println("Plat 0 semula dimiliki oleh Daniel, dan di-update menjadi punya Glenn, \nuntuk Plat no 1 tetap dimiliki oleh Yohan karena tidak ada data yang menggantikannya.");
                System.out.println("Terimakasih....");
            }
            else{            
             System.out.println("Maaf Menu Tidak Tersedia");
            }
                System.out.print("\nIngin Mengulang (y/t) : ");
                ulang = input.next();
                if(ulang.equals("T")|| ulang.equals("t")){
                    System.out.println("TERIMAKASIH");
                }
        
        }
        
        
    }
    
}

    


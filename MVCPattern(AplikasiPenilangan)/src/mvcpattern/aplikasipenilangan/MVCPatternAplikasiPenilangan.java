
package mvcpattern.aplikasipenilangan;

import java.util.Scanner;

public class MVCPatternAplikasiPenilangan {

    public static void main(String[] args){
        Penilangan model = retrivePenilanganFromDatabase();
            
            String ulang = "y";
        
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Pilihan Anda Lagi : ");
            int pilih = input.nextInt();
            if(pilih==1){
                PenilanganView view = new PenilanganView();
                PenilanganController controller = new PenilanganController(model, view);
                controller.updateView();
                System.out.print("\nUpdate Data ");
                controller.setPenilanganNama("Daniel Harliano Sitorus");
                controller.updateView();
                System.out.println("\nTerimakasih Telah Berkunjung");
            }
            else if(pilih==2){
                PenilanganView view = new PenilanganView();
                PenilanganController controller = new PenilanganController(model, view);
                controller.updateView();
                System.out.println("Update Data ");
                controller.setPenilanganNama("Jala Pratama"); 
                controller.updateView();
                System.out.println("\nTerimakasih Telah Berkunjung");
            }
            else if(pilih==3){
                PenilanganView view = new PenilanganView();
                PenilanganController controller = new PenilanganController(model, view);
                controller.updateView();
                System.out.println("Update Data ");
                controller.setPenilanganNama("Jono");        
                controller.updateView();
                System.out.println("\nTerimakasih Telah Berkunjung");
            }
            else if(pilih==4){
                PenilanganView view = new PenilanganView();
                PenilanganController controller = new PenilanganController(model, view);
                controller.updateView();
                System.out.println("Update Data ");
                controller.setPenilanganNama("Budiman Samsudil");        
                controller.updateView();
                System.out.println("\nTerimakasih Telah Berkunjung");
            }
            else if(pilih==5){
                PenilanganView view = new PenilanganView();
                PenilanganController controller = new PenilanganController(model, view);
                controller.updateView();
                System.out.println("Update Data ");
                controller.setPenilanganNama("Yohan's Banjarnahor");        
                controller.updateView();
                System.out.println("\nTerimakasih Telah Berkunjung");
            }
            else if(pilih==6){
                PenilanganView view = new PenilanganView();
                PenilanganController controller = new PenilanganController(model, view);
                controller.updateView();
                System.out.println("Update Data ");
                controller.setPenilanganNama("Budi Santoso Purnomo");        
                controller.updateView();
                System.out.println("\nTerimakasih Telah Berkunjung");
            }
            else{
                System.out.println("Maaf Menu Tidak Tersedia");
            }
    }
    private static Penilangan retrivePenilanganFromDatabase(){
        String ulang = "y";
        Penilangan penilangan = new Penilangan();
        
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
                penilangan.setNama("Daniel");
                penilangan.setPlatNo("H 1234 DI");
                return penilangan;
            }
            else if(pilih==2){
                penilangan.setNama("Jaka Pramana");
                penilangan.setPlatNo("B 2315 JKI");
                return penilangan;
            }
            else if(pilih==3){
                penilangan.setNama("Joko");
                penilangan.setPlatNo("H 8765 KA");
                return penilangan;
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
            System.out.println(" 4. SIM");
            System.out.println(" 5. STNK");
            System.out.println(" 6. SeatBelt");
            System.out.println("-----------------------------");
            System.out.print(" Masukkan Pilihan Anda : ");
            pilih = input.nextInt();
            System.out.println("-----------------------------");
             
            if(pilih==4){
                penilangan.setNama("Budi Samsudil");
                penilangan.setPlatNo("B 9876 IK");
                return penilangan;
            }
            else if(pilih==5){
                penilangan.setNama("Yohan");
                penilangan.setPlatNo("D 4567 JI");
                return penilangan;
            }
            else if(pilih==6){
                penilangan.setNama("Budi");
                penilangan.setPlatNo("AB 123 UI");
                return penilangan;
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
        return null;
    }
}

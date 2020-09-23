/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.factory.aplikasi.tilang.kendaraan;

/**
 *
 * @author Banjarnahor Yohan's
 */
public class Helm implements Motor{
    
    @Override
    public void roda2(){
        System.out.println("        Tilang tidak memakai Helm       ");
        System.out.println("========================================");
        System.out.println("  Putra Sinaga            - H 1245 PS   ");
        System.out.println("  Anton Supardiman Fran   - B 1999 ARN  ");
        System.out.println("  Yantok Basnah           - H 2180 TBN  ");
        System.out.println("========================================");
    }
}

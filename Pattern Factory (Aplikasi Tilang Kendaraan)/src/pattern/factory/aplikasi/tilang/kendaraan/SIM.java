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
public class SIM implements Motor{
    @Override
    public void roda2(){
        System.out.println("        Tilang tidak membawa SIM        ");
        System.out.println("========================================");
        System.out.println("  Daniel Harliano Sitorus - H 1234 DH   ");
        System.out.println("  Yohan's Banjarnahor     - H 5678 YB   ");
        System.out.println("  Gadtrianus Banangi t    - H 1357 JKL  ");
        System.out.println("========================================");
    }
}

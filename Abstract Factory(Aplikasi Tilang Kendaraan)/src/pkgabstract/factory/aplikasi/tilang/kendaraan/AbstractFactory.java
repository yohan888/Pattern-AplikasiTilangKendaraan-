/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory.aplikasi.tilang.kendaraan;

/**
 *
 * @author ASUS
 */
public abstract class AbstractFactory {
    abstract Mobil getMobil(String mobil);
    abstract Motor getMotor(String motor);
    
}

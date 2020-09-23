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
public class MobilFactory extends AbstractFactory {
    
    @Override
    public Motor getMotor(String motorType){
        return null;
    }
    
    @Override
    Mobil getMobil(String mobil) {
        if(mobil == null){
            return null;
        }
        if(mobil.equalsIgnoreCase("SIM2")){
            return new SIM2();
        } else if(mobil.equalsIgnoreCase("STNK2")){
            return new STNK2();
        } else if(mobil.equalsIgnoreCase("Seatbelt")){
            return new Seatbelt();
        }
        return null;
    }
    
}

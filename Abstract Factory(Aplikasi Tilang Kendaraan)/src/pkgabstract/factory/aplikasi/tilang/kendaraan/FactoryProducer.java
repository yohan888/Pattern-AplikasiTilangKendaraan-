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
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Motor")){
            return new MotorFactory();
        } else if(choice.equalsIgnoreCase("Mobil")){
            return new MobilFactory();
        }
        return null;
    }
}

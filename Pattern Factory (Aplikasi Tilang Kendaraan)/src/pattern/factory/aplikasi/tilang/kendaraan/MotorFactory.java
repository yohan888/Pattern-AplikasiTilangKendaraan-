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
public class MotorFactory {
    public Motor getMotor(String motorType){
        if(motorType == null){
            return null;
        }
        if(motorType.equalsIgnoreCase("SIM")){
            return new SIM();
        }else if(motorType.equalsIgnoreCase("STNK")){
            return new STNK();
        }else if(motorType.equalsIgnoreCase("Helm")){
            return new Helm();
        }
        return null;
    }
}

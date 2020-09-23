/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.pattern.aplikasi.tilang.kendaraan;

/**
 *
 * @author Banjarnahor Yohan's
 */
public abstract class Mobil implements Kendaraan{
    
    @Override
    public Polisi polisi(){
        return new SuratTilangMobil();
    }
    
    @Override
    public abstract float denda();
}

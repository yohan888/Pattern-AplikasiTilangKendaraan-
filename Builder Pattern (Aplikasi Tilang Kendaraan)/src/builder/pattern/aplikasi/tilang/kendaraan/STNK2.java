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
public class STNK2 extends Mobil{
    
    @Override
    public float denda(){
        return 500.0f;
    }
    
    @Override
    public String jenis(){
        return "STNK Roda4";
    }
    
    @Override
    public String hukum(){
        return "Setiap pengendara yang tidak dilengkapi Surat Tanda Nomor Kendaraan Bermotor atau "
                + "\n        Surat Tanda Coba Kendaraan Bermotor dipidana dengan pidana kurungan paling lama "
                + "\n        2 bulan atau denda paling banyak Rp500 ribu (Pasal 288 ayat 1)";
    }
}

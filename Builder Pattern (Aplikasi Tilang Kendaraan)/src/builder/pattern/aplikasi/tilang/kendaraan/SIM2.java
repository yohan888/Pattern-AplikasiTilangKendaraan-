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
public class SIM2 extends Mobil{
    
    @Override
    public float denda(){
        return 250.0f;
    }
    
    @Override
    public String jenis(){
        return "SIM A";
    }
    
    @Override
    public String hukum(){
        return "Setiap pengendara kendaraan bermotor yang memiliki SIM namun tak dapat "
                + "\n        menunjukkannya saat razia dipidana dengan pidana kurungan paling lama "
                + "\n        1 bulan atau denda paling banyak Rp250 ribu (Pasal 288 ayat 2)";
    }
}

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
public class SeatBelt extends Mobil{
    
    @Override
    public float denda(){
        return 500.0f;
    }
    
    @Override
    public String jenis(){
        return "SeatBelt";
    }
    
    @Override
    public String hukum(){
        return "Setiap pengemudi atau penumpang yang duduk disamping pengemudi mobil "
                + "\n        tak mengenakan sabuk keselamatan dipidana dengan pidana kurungan paling lama "
                + "\n        1 bulan atau denda paling banyak Rp250 ribu (Pasal 289)";
    }
}

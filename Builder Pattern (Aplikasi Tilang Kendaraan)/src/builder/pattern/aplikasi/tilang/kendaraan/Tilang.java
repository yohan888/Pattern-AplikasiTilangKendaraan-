/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.pattern.aplikasi.tilang.kendaraan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Banjarnahor Yohan's
 */
public class Tilang {
    private List<Kendaraan> items = new ArrayList<Kendaraan>();
    
    public void addKendaraan(Kendaraan kendaraan){
        items.add(kendaraan);
    }
    
    public float getCost(){
        float cost = 0.0f;
        for(Kendaraan kendaraan : items){
            cost += kendaraan.denda();
        }
        return cost;
    }
    public void showItems(){
        for(Kendaraan kendaraan : items){
            System.out.println("Jenis : "+kendaraan.jenis());
            System.out.println("Bukti : "+kendaraan.polisi().bukti());
            System.out.println("Denda : "+kendaraan.denda());
            System.out.println("Info  : "+kendaraan.hukum());
        }
    }
}

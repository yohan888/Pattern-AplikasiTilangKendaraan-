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
public interface Kendaraan {
    public String jenis();
    public String hukum();
    public Polisi polisi();
    public float denda();
}

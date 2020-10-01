/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpattern.aplikasipenilangan;

/**
 *
 * @author Banjarnahor Yohan's
 */
public class PenilanganView {
    public void printPenilanganDetails(String penilanganNama, String penilanganPlatNo){
        System.out.println("Pelaku Penilangan");
        System.out.println("---     ");
        System.out.println("Nama: " + penilanganNama);
        System.out.println("Plat No: " + penilanganPlatNo);
    }
}

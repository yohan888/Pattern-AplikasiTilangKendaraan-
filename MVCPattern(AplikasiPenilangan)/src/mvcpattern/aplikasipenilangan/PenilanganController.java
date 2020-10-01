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
public class PenilanganController {
    private Penilangan model;
    private PenilanganView view;
    
    public PenilanganController(Penilangan model, PenilanganView view){
        this.model = model;
        this.view = view;
    }
    public void setPenilanganNama(String nama){
        model.setNama(nama);
    }
    public String getPenilanganNama(){
        return model.getNama();
    }
    public void setPenilanganPlatNo(String platNo){
        model.setPlatNo(platNo);
    }
    public String getPenilanganPlatNo(){
        return model.getPlatNo();    
    }
    public void updateView(){
        view.printPenilanganDetails(model.getNama(), model.getPlatNo());
    }
}

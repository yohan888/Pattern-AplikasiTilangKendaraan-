
package daopattern;

import java.util.ArrayList;
import java.util.List;

public class PenilanganDaoImpl implements PenilanganDao {
    
    //list is working as a database
    List<Penilangan> penilangans;
    
    public PenilanganDaoImpl(){
        penilangans = new ArrayList<Penilangan>();
        Penilangan penilangan1 = new Penilangan("Daniel",0);
        Penilangan penilangan2 = new Penilangan("Yohan",1);
        penilangans.add(penilangan1);
        penilangans.add(penilangan2);
        
    }
    
    @Override
    public void deletPenilangan(Penilangan penilangan) {
        penilangans.remove(penilangan.getPlatNo());
        System.out.println("Penilangan: Plat No " + penilangan.getPlatNo()
        +", deleted from database");
    }
    
    @Override
    public List<Penilangan> getAllPenilangans(){
        return penilangans;
    }
    
    @Override
    public Penilangan getPenilangan(int platNo) {
        return penilangans.get(platNo);
    }
    
    @Override
    public void updatePenilangan(Penilangan penilangan) {
        penilangans.get(penilangan.getPlatNo()).setName(penilangan.getName());
        System.out.println("Penilangan: Plat No " + penilangan.getPlatNo()
        +", update in the database");
    }
    
}

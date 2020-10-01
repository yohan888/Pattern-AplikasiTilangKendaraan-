
package daopattern;

import java.util.List;

public interface PenilanganDao {
    public List<Penilangan> getAllPenilangans();
    public Penilangan getPenilangan(int platNo);
    public void updatePenilangan(Penilangan penilangan);
    public void deletPenilangan(Penilangan penilangan);
    
}

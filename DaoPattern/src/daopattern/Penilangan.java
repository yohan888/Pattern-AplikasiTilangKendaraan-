
package daopattern;

public class Penilangan {
    private String name;
    private int platNo;
    
    Penilangan(String name, int platNo){
        this.name = name;
        this.platNo = platNo;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPlatNo() {
        return platNo;
    }
    public void setPlatNo(int platNo) {
        this.platNo = platNo;
    }
    
}

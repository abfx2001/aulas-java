
package lista_telefonica;

public class Fones {
    
    private String fone;
    
    public Fones (String fone){
        this.fone = fone;
    }
    
    public void setNovofone (String fone){
        this.fone = fone;
    }
    
    @Override
    public String toString() {
        return String.format(fone);
    }
}

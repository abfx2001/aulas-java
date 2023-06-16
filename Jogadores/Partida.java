
package jogadores_e_times;

import java.util.Random;

public class Partida {
    private String estadio;
    private int vencer; 
    
    public Partida (String est, int ven){ // construtor
        estadio = est;
        vencer = ven;
    }

    public void setEstadio(String est){
        estadio = est;
    }
    
    public String getEstadio(){
        return estadio;
    }
    
    public void setVencer(int ven){
        vencer = ven;
    }
    
    public int getVencer(){
        return vencer;
    }
    
    public int getVitoria(){
        Random random = new Random();
        return random.nextInt(2);
    }
    
    
}

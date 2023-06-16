
package jogadores_e_times;


public class Times {
    private String nometime;
    private int idadetime;
    
    public Times (String no, int nu){ // construtor
        nometime = no;
        idadetime = nu;
    }

    public void setTime(String no){
        nometime = no;
    }
    
    public String getTime(){
        return nometime;
    }
    
    public void setIda(int nu){
        idadetime = nu;
    }
    
    public int getIda(){
        return idadetime;
    }
}


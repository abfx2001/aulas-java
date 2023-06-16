
package jogadores_e_times;


public class Jogadores {
    private String nome;
    private int numero;
    
    public Jogadores (String n, int num){ // construtor
        nome = n;
        numero = num;
    }

    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNumero(int num){
        numero = num;
    }
    
    public int getNumero(){
        return numero;
    }
    
 
}



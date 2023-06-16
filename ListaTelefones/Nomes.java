
package lista_telefonica;

public class Nomes {
    
    private String nome;
    
    public Nomes (String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    @Override
    public String toString() {
        return String.format(nome);
    }
}

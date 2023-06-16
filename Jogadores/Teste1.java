
package jogadores_e_times;

public class Teste1 {
    public static void main(String args[]){
    Jogadores jogador1 = new Jogadores("Heitor", 9); //objeto
    Jogadores jogador2 = new Jogadores("Paulo", 74);
    Times time1 = new Times("Vasco", 100);
    Times time2 = new Times("Bota Fogo", 120);
    Partida jogo1 = new Partida("Morumbi", 13);
    //aqui queria adicionar mais jogos, e fazer com que o usuário escolha o que ele quer, posso incrementar o código posteriormente,
    //sinceramente eu não consigo ainda desenvolver um pensamento rápido para o código, gosto de procurar os problemas e resolve-los
    //e isso me demanda mais tempo, por isso não pude desenvolver muito meu código.

    System.out.println("Nome do jogador: " + jogador1.getNome() + " Número do jogador: " + jogador1.getNumero());
    
    System.out.println("Nome do jogador: " + jogador2.getNome() + " Número do jogador: " + jogador2.getNumero());
    
    System.out.println("Nome do Time 1: "+ time1.getTime() + ", Idade de: "+ time1.getIda()+" anos");
    
    System.out.println("Nome do Time 2: "+ time2.getTime() + ", Idade de: "+ time2.getIda()+" anos");
    
    System.out.println("A partida vai ser no estádio: " + jogo1.getEstadio() + ", Número de jogos ate agora: "+ jogo1.getVencer());
    
    int cond = jogo1.getVitoria();
    
    if (cond == 2){
        System.out.println("O time do "+time1.getTime()+" venceu!!");
    }
    else{
        System.out.println("O time do "+time2.getTime()+" venceu!!");
    }
    
    
    }
}
// professor, pelo tempo não pude encrementar muito o exemplo, pesso que revise o campo do número randomico na classe da partida
// mais para frente eu posso fazer com que o usuário digite os campos e o programa defina um vencedor.


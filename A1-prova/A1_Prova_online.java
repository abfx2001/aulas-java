
package a1_prova_online;

import java.util.Scanner;

public class A1_Prova_online {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        // scanner que lê o que o usuário escreve no terminal.
        
        double soma = 0;
        // declaração da variavel.
        
        System.out.print("Digite a seguir o número de notas que se vai realizar a média: ");
        int notas = ler.nextInt();
        // aqui ele faz a leitura de quantas notas se vai fazer a média, no caso, será 50 notas.
        
        for ( int i = 1; i <= notas; i++ ){
            System.out.print("Digite a "+ i +"º nota: ");
            double numero = ler.nextDouble();
            // aqui o programa pergunta todos as notas dependendo da quantidade que foi escolhida.
            soma += numero;
            // e aqui é feita a soma dessas notas.
        }
        
        double media = soma / notas;
        // aqui é realizado a media das notas.
        
        System.out.println("A média das "+ notas +" notas é: "+ media);
        // aqui é exibido para o usuário qual foi a média.
    }
    
}

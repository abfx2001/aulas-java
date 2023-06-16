//b) [while] Elabore um programa que recebe valores naturais até que seja digitado o valor zero. 
//O programa deverá exibir a média aritmética. 
//Lembre-se: o valor zero apenas sinaliza o fim da entrada, não deve ser contabilizado.

package Atividade02;

import java.util.Scanner;

public class ExeB {
    public static void main(String[] args) {
        System.out.println("Digite números naturais a seguir. Digite ZERO(0) para parar de mandar números");
        Scanner ler = new Scanner(System.in);
        int cond = 0;
        int vezes = 0;
        double soma = 0;
        while(cond == 0){
            double n = ler.nextDouble();
            if (n != 0){
                soma = soma + n;
                vezes ++;
            }
            else{
                cond = 1;
            }
        }
        double media = soma / vezes;
        System.out.println("A média dos números digiteados é: "+media);
    }
}

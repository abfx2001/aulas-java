//e) [for] Desenvolva um programa que exibe a tabuada de um número natural escolhido pelo usuário. 
//Os múltiplos apresentados devem ser de 1 a 10.

package Atividade02;

import java.util.Scanner;

public class ExeE {
    public static void main(String[] args) {
        System.out.print("Digite um número natural para ter sua tabuada de 1 a 10: ");
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(i+" x "+n+" = "+(n*i));
        }
    }
}

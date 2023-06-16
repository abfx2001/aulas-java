//a) Elabore um programa que lê um número inteiro n, seguido de n inteiros, e exibe a média dos n números lidos.
package Atividade02;

import java.util.Scanner;

public class ExeA {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro para ser a quantidade de números para fazer a média");
        int n = ler.nextInt();        
        int somamedia = 0;
        for (int i = 1; i < n + 1; i++ ){
            System.out.println("Digite o "+i+"° número: ");
            int soma = ler.nextInt();
            somamedia = soma + somamedia;            
        }
        double media = somamedia / n ;
        System.out.println("A média dos números escritos é: "+media);
    }
}

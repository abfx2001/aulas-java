//c) Elabore um programa que exibe qual o número natural que mais se aproxima da raiz quadrada 
//de um número natural fornecido pelo usuário sem ultrapassá-lo. 
//Use apenas as operações básicas (adição, subtração, multiplicação e divisão). 
//Exemplo: O número natural que mais se aproxima de √48, sem ultrapassar, é 6.

package Atividade02;

import java.util.Scanner;

public class ExeC {
    public static void main(String[] args) {
        System.out.print("Digite um número natural, para se ter a aproximação de sua Raiz Qaudrada: ");
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        System.out.print("A aproximação da Raiz Qaudrada de "+n+" é: "+(Math.floor(Math.sqrt(n))));
    }
}

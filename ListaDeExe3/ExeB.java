//b) Faça um programa que preenche um vetor com cem inteiros e, ao final, exibe o vetor em ordem
//contrária.

import java.util.Random;

public class ExeB {
    public static void main(String[] args) {
        int [] x = new int [100];
        Random gerador = new Random();
        
        for(int i = 0; i < x.length; i ++ ){
            x[i] = gerador.nextInt(100);
        }
 
        for(int i = x.length-1;i>=0;i--){
            System.out.print(x[i]+" ");
        }
        
    }
}

//d) Faça um programa que lê um vetor de cinquenta elementos e exibe, ao final, o menor valor lido.

import java.util.Random;

public class ExeD {
    public static void main(String[] args) {
        Random gerador = new Random();
        int [] x = new int [50];
        int menor = 200;
        for(int i = 0; i < x.length; i ++ ){
            x[i] = gerador.nextInt(200);
            System.out.print(x[i]+" ");
            if(x[i] < menor){
                menor = x[i];
            }
        }
        System.out.println("O menor valor do vetor é: "+ menor);
    }
}

//o) Faça um programa que recebe cinquenta números inteiros em um vetor, os ordena e exibe o vetor
//ordenado crescente.

import java.util.Arrays;
import java.util.Random;

public class ExeO {
    public static void main(String[] args) {
        int [] x = new int [50];
        Random gerador = new Random();
        
        for(int i = 0; i < x.length; i ++ ){
            x[i] = gerador.nextInt(200);
            //System.out.print(x[i]+" ");
        }
        Arrays.sort(x);
        for(int i = 0; i < x.length; i ++ ){
            System.out.print(x[i]+" ");
        }
    }
}

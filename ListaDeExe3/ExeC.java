//c) Faça um programa que preenche um vetor com cinquenta elementos inteiros e altera todo valor
//negativo para seu oposto positivo, ao final o programa deve exibir o vetor já modificado.

import java.util.Random;

public class ExeC {
    public static void main(String[] args) {
        Random gerador = new Random();
        int [] x = new int [50];
        
        for(int i = 0; i < x.length; i ++ ){
            x[i] = gerador.nextInt(80) - 20;
        }
        
        for(int i = 0; i < x.length; i ++){
            if (x[i] < 0){
                x[i] = x[i]*-1;
            }
            System.out.print(x[i]+" ");
        }
       
    }
}

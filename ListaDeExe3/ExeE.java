
//e) Construa um programa que lê um vetor de números reais com quinze elementos e zera todos os
//valores negativos. No final, o programa deve apresentar todos os elementos do vetor.

import java.util.Random;

public class ExeE {
    public static void main(String[] args) {
        Random gerador = new Random();
        double [] x = new double [15];
        
        for(int i = 0; i < x.length; i ++ ){
            x[i] = gerador.nextDouble()*100 - 30.0;
            //System.out.println(x[i]);
        }
        for(int i = 0; i < x.length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
            System.out.println(x[i]);
        }
    }
}

//Elabore um programa que lê as medidas de três cubos retangulares (base, altura e largura) 
//e exibe a ordem que eles devem ser colocados em um caminhão, 
//obedecendo ao critério de que cubos com maior área devem ser colocados primeiro. Observe o exemplo a seguir:
//• Cubo 1 – Base: 2 / Altura: 4 / Comprimento: 5;
//• Cubo 2 – Base: 4 / Altura: 4 / Comprimento: 4;
//• Cubo 3 – Base: 2 / Altura: 1 / Comprimento: 2.
//Ordem da colocação: cubo 2, cubo 1 e cubo 3.

import java.util.Scanner;

public class ExercQ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("primeiro Cubo \n digite a Base: ");
        double b1 = ler.nextDouble();
        
        System.out.println("digite a altura: ");
        double a1 = ler.nextDouble();
        
        System.out.println("digite a largura: ");
        double l1 = ler.nextDouble();
        
        System.out.println("Segundo Cubo \n digite a Base: ");
        double b2 = ler.nextDouble();
        
        System.out.println("digite a altura: ");
        double a2 = ler.nextDouble();
        
        System.out.println("digite a largura: ");
        double l2 = ler.nextDouble();
        
        System.out.println("Terceiro Cubo \n digite a Base: ");
        double b3 = ler.nextDouble();
        
        System.out.println("digite a altura: ");
        double a3 = ler.nextDouble();
        
        System.out.println("digite a largura: ");
        double l3 = ler.nextDouble();
        
        double area1 = ((a1 * b1 * 2)+(b1 * l1 * 2)+(a1 * l1 * 2));
        double area2 = ((a2 * b2 * 2)+(b2 * l2 * 2)+(a2 * l2 * 2));
        double area3 = ((a3 * b3 * 2)+(b3 * l3 * 2)+(a3 * l3 * 2));
        
        if ((area1 >= area2)&&(area1 >= area3)){
            if (area2 >= area3){
                System.out.println("A ordem é: Cubo1 , Cubo2, Cubo3");
            }
            else{
                System.out.println("A ordem é: Cubo1, Cubo3, Cubo2");
            }
        }
        else if ((area2 >= area1)&&(area2 >= area3)){
            if (area1 >= area3){
                System.out.println("A ordem é: Cubo2, Cubo1, Cubo3");
            }
            else{
                System.out.println("A ordem é: Cubo2, Cubo3, Cubo1");
            }
        }
        else if ((area3 >= area1)&&(area3 >= area2)){
            if (area1 >= area2){
                System.out.println("A ordem é: Cubo3, Cubo1, Cubo2");
            }
            else{
                System.out.println("A ordem é: Cubo3, Cubo2, Cubo1");
            }
        }
        
    }
}

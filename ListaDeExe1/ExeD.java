//d) Crie um programa que exibe uma lista de graus Fahrenheit (F) e os correspondentes em graus centígrados (C),
//variando de 50 a 150, com passos de uma unidade. A fórmula de conversão é C = 5 ÷ 9 × (F − 32).

package Atividade02;


public class ExeD {
    public static void main(String[] args) {
        for (int f = 50; f < 151; f++){
            System.out.println(f + " Fahrenheit coresponde á: " +((9*(f-32.00))/5)+ "° centígrados");
        }
    }
}

//e) Faça um programa que recebe um número inteiro e exibe uma mensagem indicando se ele é par ou ímpar (use o 
//operador % para obter o resto de uma divisão inteira).

import javax.swing.JOptionPane;

public class ExercE {
    public static void main (String args[]){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digigte um número inteiro: "));
        
        if (numero % 2 == 0){
            JOptionPane.showMessageDialog(null,"Esse número é PAR!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Esse número é IMPAR!!");
        }
    }
}

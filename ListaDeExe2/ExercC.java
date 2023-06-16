
//c) Faça um programa que recebe dois números inteiros distintos e exibe o maior.

import javax.swing.JOptionPane;

public class ExercC {
    public static void main (String args[]){
        JOptionPane.showMessageDialog(null,"Digite a seguir dois números inteiros:");
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digigte o Primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digigte o Segundo número: "));
        
        if (n1 > n2){
            JOptionPane.showMessageDialog(null,"O maior número é: " + n1);
        }
        else if (n1 < n2){
            JOptionPane.showMessageDialog(null,"O maior número é: " + n2);
        }
        else{
            JOptionPane.showMessageDialog(null,"Os dois números são iguais!");
        }
    }
    
}

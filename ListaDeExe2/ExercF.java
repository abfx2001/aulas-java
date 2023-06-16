//f) Faça um programa que recebe três números reais e os exibe em ordem crescente.

import javax.swing.JOptionPane;

public class ExercF {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Digite a seguir três números reais:");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digigte o Primeiro número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digigte o Segundo número: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digigte o Terceiro número: "));
        
        if ((n1 <= n2)&&(n1 <= n3)){
            if (n2 <= n3){
                JOptionPane.showMessageDialog(null,"Na ordem Crescente fica: " + n1 +" , "+ n2 +" , "+n3);
            }
            else{
                JOptionPane.showMessageDialog(null,"Na ordem Crescente fica: " + n1 +" , "+ n3 +" , "+n2);
            }
        }
        else if((n2 <= n1)&&(n2 <= n3)){
            if (n1 <= n3){
                JOptionPane.showMessageDialog(null,"Na ordem Crescente fica: " + n2 +" , "+ n1 +" , "+n3);
            }
            else{
                JOptionPane.showMessageDialog(null,"Na ordem Crescente fica: " + n2 +" , "+ n3 +" , "+n1);
            }
        }
        else if((n3 <= n1)&&(n3 <= n2)){
            if (n1 <= n2){
                JOptionPane.showMessageDialog(null,"Na ordem Crescente fica: " + n3 +" , "+ n1 +" , "+n2);
            }
            else{
                JOptionPane.showMessageDialog(null,"Na ordem Crescente fica: " + n3 +" , "+ n2 +" , "+n1);
            }
        }
    }
}

//d) Faça um programa que recebe dois números reais e exibe o menor deles e com duas casas decimais.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ExercD {
    public static void main (String args[]){
        JOptionPane.showMessageDialog(null,"Digite a seguir dois números reais:");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digigte o Primeiro número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digigte o Segundo número: "));
        DecimalFormat formatador = new DecimalFormat("0.00");
        if (n1 < n2){
            JOptionPane.showMessageDialog(null,"O menor número é: " + formatador.format(n1));
        }
        else if (n1 > n2){
            JOptionPane.showMessageDialog(null,"O menor número é: " + formatador.format(n2));
        }
        else{
            JOptionPane.showMessageDialog(null,"Os dois números são iguais!");
        }
    }
}

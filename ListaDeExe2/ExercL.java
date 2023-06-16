//Faça um programa que recebe o nome e a data de nascimento de duas pessoas e exibe o nome da mais velha. 
//Cada data deve ser fornecida em três valores inteiros, 
//onde o primeiro representa o dia, o segundo o mês e o terceiro o ano.

import javax.swing.JOptionPane;

public class ExercL {
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite o primeiro nome ");
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da primeira data "));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da primeira data "));
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da primeira data "));
        String nome2 = JOptionPane.showInputDialog("Digite o segundo nome ");
        int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da segunda data "));
        int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da segunda data "));
        int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da segunda data "));
        
        if (ano1 < ano2){
            JOptionPane.showMessageDialog(null, "A " +nome1+" é mais velho/velha");
        }
        else if (ano1 > ano2){
            JOptionPane.showMessageDialog(null, "A " +nome2+" é mais velho/velha");
        }
        else{
            if (mes1 < mes2){
                JOptionPane.showMessageDialog(null, "A " +nome1+" é mais velho/velha");
            }
            else if (mes1 > mes2){
                JOptionPane.showMessageDialog(null, "A " +nome2+" é mais velho/velha");
            }
            else{
                if (dia1 < dia2){
                    JOptionPane.showMessageDialog(null, "A " +nome1+" é mais velho/velha");
                }
                else if (dia1 > dia2){
                    JOptionPane.showMessageDialog(null, "A " +nome2+" é mais velho/velha");
                }
                else{
                    JOptionPane.showMessageDialog(null, "As duas datas são as mesmas");
                }
            }
        }
    }
}

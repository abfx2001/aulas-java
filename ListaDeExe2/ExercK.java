//Faça um programa que recebe duas datas distintas e exibe a mais recente. 
//Cada data deve ser fornecida como três valores inteiros, onde o primeiro representa o dia, 
//o segundo o mês e o terceiro o ano. Dica: comece verificando pelo ano.

import javax.swing.JOptionPane;

public class ExercK {
    public static void main(String[] args) {
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da primeira data "));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da primeira data "));
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da primeira data "));
        int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da segunda data "));
        int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da segunda data "));
        int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da segunda data "));
        
        if (ano1 > ano2){
            JOptionPane.showMessageDialog(null, "A primeira data é mais recente " + dia1+"/" + mes1 +"/"+ ano1 );
        }
        else if (ano1 < ano2){
            JOptionPane.showMessageDialog(null, "A segunda data é mais recente " + dia2+"/" + mes2 +"/"+ ano2 );
        }
        else{
            if (mes1 > mes2){
                JOptionPane.showMessageDialog(null, "A primeira data é mais recente " + dia1+"/" + mes1 +"/"+ ano1 );
            }
            else if (mes1 < mes2){
                JOptionPane.showMessageDialog(null, "A segunda data é mais recente " + dia2+"/" + mes2 +"/"+ ano2 );
            }
            else{
                if (dia1 > dia2){
                    JOptionPane.showMessageDialog(null, "A primeira data é mais recente " + dia1+"/" + mes1 +"/"+ ano1 );
                }
                else if (dia1 < dia2){
                    JOptionPane.showMessageDialog(null, "A segunda data é mais recente " + dia2+"/" + mes2 +"/"+ ano2 );
                }
                else{
                    JOptionPane.showMessageDialog(null, "As duas datas são as mesmas: " + dia2+"/" + mes2 +"/"+ ano2 );
                }
            }
        }
    }
}

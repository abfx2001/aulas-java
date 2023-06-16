// Desenvolva um programa que, com base em duas notas de provas e três notas de trabalhos dadas pelo usuário, 
//exibe uma mensagem indicando se o aluno foi aprovado, reprovado ou se fará o exame.
//• 6 ≤ media final ≤ 10, aprovado
//• 4 ≤ media final < 6, exame
//• 0 ≤ media final < 4, reprovado
//• Considere que media final =
//provas+trabalhos

import javax.swing.JOptionPane;

public class ExercO {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova:"));
        double trab1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do primeiro trabalho:"));
        double trab2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do segundo trabalho:"));
        double trab3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do terceiro trabalho:"));
        
        double medianota = (nota1 + nota2)/2;
        double mediatrab = (trab1 + trab2 + trab3)/3;
        
        double mediafinal = (medianota + mediatrab)/2;
        
        if ((mediafinal >= 0)&&(mediafinal < 4)){
            JOptionPane.showMessageDialog(null,"0 ≤"+ mediafinal +"< 4, reprovado");
        }
        else if ((mediafinal >= 4)&&(mediafinal < 6)){
            JOptionPane.showMessageDialog(null,"4 ≤"+ mediafinal +"< 6, exame");
        }
        else if ((mediafinal >= 6)&&(mediafinal <= 10)){
            JOptionPane.showMessageDialog(null,"6 ≤"+ mediafinal +"≤ 10, aprovado");
        }
    }
}

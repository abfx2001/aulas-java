
import javax.swing.JOptionPane;
public class ExercA {
    public static void main(String args[]){
        float nota01 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua primeira nota: "));   
        float nota02 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua segunda nota: "));    
        float media = (nota01 + nota02)/2;   
        if (media > 6){
            JOptionPane.showMessageDialog(null, "A sua média é: " + media);
            JOptionPane.showMessageDialog(null, "Parabéns você foi aprovado!!!");
        }
        else {
        JOptionPane.showMessageDialog(null, "A sua média é: " + media);
        JOptionPane.showMessageDialog(null, "Que pena você não Passou!!!");
        }       
    }
}
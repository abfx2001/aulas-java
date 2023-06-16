//j) Faça um programa que recebe os coeficientes A, B e C (A ≠ 0) de uma equação de segundo grau e exibe os 
//valores das raízes, se forem reais, ou a mensagem "nao existem raizes reais", caso contrário.

import javax.swing.JOptionPane;

public class ExercJ {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite a seguir os valores [A], [B] e [C] da equação, sendo que (A ≠ 0)");
        double a = Double.parseDouble(JOptionPane.showInputDialog("A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("C: "));
        double x1,x2;
        double delta = (Math.pow(b,2))+(-4*a*c);
        
        if (delta > 0){
            x1 = (-b +(Math.sqrt(delta)))/2*a;
            x2 = (-b -(Math.sqrt(delta)))/2*a;
            JOptionPane.showMessageDialog(null, "As duas raizes são: "+ x1 +" e "+ x2);
        }
        else if (delta == 0){
            x1 = (-b/(2*a));
            JOptionPane.showMessageDialog(null, "A única raiz real é: "+ x1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Essa equação NÃO possui raizes reais...");
        }
      
        
    }
    
}

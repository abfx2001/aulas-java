//i) Faça um programa que recebe o valor de três arestas e exibe uma mensagem indicando se podem formar um 
//triângulo. Em caso afirmativo, indique se ele é equilátero, isósceles ou escaleno. Lembre-se: Para que um 
//triângulo exista, a medida de qualquer um dos lados deve ser menor que a soma das medidas dos outros dois

import javax.swing.JOptionPane;

public class ExercI {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite a seguir os valores das arestas de um triângulo");
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("ARESTA 1: "));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("ARESTA 2: "));
        double a3 = Double.parseDouble(JOptionPane.showInputDialog("ARESTA 3: "));
        
        if((a1 < (a2+a3))&&(a2 < (a1+a3))&&(a3 < (a1+a2))){
            if ((a1==a2)&&(a2==a3)){
                JOptionPane.showMessageDialog(null, "É um triângulo EQUILÁTERO");
            }
            else if ((a1==a2)||(a1==a3)||(a2==a3)){
               JOptionPane.showMessageDialog(null, "É um triângulo ISÓSCELES"); 
            }
            else {
               JOptionPane.showMessageDialog(null, "É um triângulo ESCALENO");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Este triângulo NÃO EXISTE!!");
        }
    }
    
}

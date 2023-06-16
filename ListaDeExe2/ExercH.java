//h) Desenvolva um programa que recebe a base e a altura de três triângulos e exibe a maior área. Lembre-se da 
//fórmula: a = base * altura / 2

import javax.swing.JOptionPane;

public class ExercH {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite a seguir os valores da BASE e ALTURA de TRÊS triângulos");
        JOptionPane.showMessageDialog(null, "Primeiro Triângulo:");
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("BASE: "));
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("ALTURA: "));
        JOptionPane.showMessageDialog(null, "Segundo Triângulo:");
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("BASE: "));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("ALTURA: "));
        JOptionPane.showMessageDialog(null, "Terceiro Triângulo:");
        double b3 = Double.parseDouble(JOptionPane.showInputDialog("BASE: "));
        double a3 = Double.parseDouble(JOptionPane.showInputDialog("ALTURA: "));
        
        double area1, area2, area3;
        
        area1 = b1 * (a1/2);
        area2 = b2 * (a2/2);
        area3 = b3 * (a3/2);
        
        if ((area1 > area2)&&(area1 > area3)){
            JOptionPane.showMessageDialog(null, "O primeiro trinângulo tem a maior área, que é de: "+ area1);
        }
        else if ((area2 > area1)&&(area2 > area3)){
            JOptionPane.showMessageDialog(null, "O segundo trinângulo tem a maior área, que é de: "+ area2);
        }
        else if ((area3 > area1)&&(area3 > area2)){
            JOptionPane.showMessageDialog(null, "O Terceiro trinângulo tem a maior área, que é de: "+ area3);
        }
        else{
            JOptionPane.showMessageDialog(null, "Dois ou mais triângulos tem a mesma área!!!");
        }
        
    }
    
}

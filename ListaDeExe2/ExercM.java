//Faça um programa que recebe a quantidade de cilindradas (cc) de um veículo de competição e exibe a categoria 
//a qual ele pertence, sendo:
//• De 0cc a 120cc: “Sub Production”;
//• De 121cc a 240cc: “Production”;
//• Acima de 240cc: “Super Production”.

import javax.swing.JOptionPane;

public class ExercM {
    public static void main(String[] args) {
        double cc = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de cilindradas (CC) que o carro possui: "));
        if ((cc > 0)&&(cc <=120)){
            JOptionPane.showMessageDialog(null,"De 0cc a 120cc: Sub Production");
        }
        else if ((cc >= 121)&&(cc <= 240)){
            JOptionPane.showMessageDialog(null,"De 121cc a 240cc: Production");
        }
        else
            JOptionPane.showMessageDialog(null,"Acima de 240cc: Super Production");
    }
}

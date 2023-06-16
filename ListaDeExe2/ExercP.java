//Uma empresa decide presentear seus funcionários com um bônus de Natal. O valor é definido como segue:
//• 20% do salário para os funcionários homens com mais de quinze anos de casa;
//• 25% do salário para as funcionárias mulheres com mais de dez anos de casa;
//• R$ 200,00 para os demais que não se encaixaram nas categorias anteriores.
//Elabore um programa que recebe o sexo, o tempo de casa e o salário de um funcionário 
//e exibe o valor total que o funcionário receberá no Natal (salário + bônus).

import javax.swing.JOptionPane;

public class ExercP {
    public static void main(String[] args) {
        char sexo = JOptionPane.showInputDialog("Digite seu Sexo \n [utilize (F) para Feminino e (M) para masculino]: ").charAt(0);
        double casa = Double.parseDouble(JOptionPane.showInputDialog("Digite seu tempo de casa:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:"));
        int cond = 0;
        while (cond == 0){
            if (sexo == 'M' || sexo == 'm'){
                if (casa > 15){
                    JOptionPane.showMessageDialog(null, "Vecê recebera: "+ ((salario*0.2) + salario));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Vecê recebera: "+ (200 + salario));
                }
                cond = 1;
            }
            else if (sexo == 'f' || sexo == 'F'){
                if (casa > 10){
                    JOptionPane.showMessageDialog(null, "Vecê recebera: "+ ((salario*0.2) + salario));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Vecê recebera: "+ (200 + salario));
                }
                cond = 1;
            }
            else{
                sexo = JOptionPane.showInputDialog("Opa! você digitou um valor invalido, digite de novo! \n [utilize (F) para Feminino e (M) para masculino]: ").charAt(0);
            }
        }
    }
}

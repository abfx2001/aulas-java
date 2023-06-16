//g) Faça um programa que mostre um menu com as opções "adição", "subtração", "multiplicação" e "divisão", 
//recebe dois valores reais, a operação escolhida pelo usuário e exibe o resultado da operação sobre os valores.

import javax.swing.JOptionPane;

public class ExercG {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite a seguir dois números reis");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digigte o segundo valor: "));
        char operador = JOptionPane.showInputDialog("Escolha o Operador da equação: \n[+]para SOMAR\n[-]para SUBTRAIR\n[*]para MULTIPLICAR\n[/]para DIVIDIR\n ").charAt(0);
        
        if(operador == '+'){
            JOptionPane.showMessageDialog(null, "O resultado é: "+(n1 + n2));
        }
        else if(operador == '-'){
            JOptionPane.showMessageDialog(null, "O resultado é: "+(n1 - n2));
        }
        else if(operador == '*'){
            JOptionPane.showMessageDialog(null, "O resultado é: "+(n1 * n2));
        }
        else{
            if(n2 == 0){
                JOptionPane.showMessageDialog(null, "Não exite divisão com ZERO!!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "O resultado é: "+(n1 / n2));
            }
        }
    }
}

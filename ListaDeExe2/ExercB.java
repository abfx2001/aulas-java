import javax.swing.JOptionPane;

public class ExercB {
    public static void main (String args[]){
        char sexo = JOptionPane.showInputDialog("Digite seu Sexo \n [utilize (F) para Feminino e (M) para masculino]: ").charAt(0);
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));
        int cond = 0;
        while (cond == 0){
            if (sexo == 'M' || sexo == 'm'){
                float pesom = (float) ((72.7*altura)-58);
                JOptionPane.showMessageDialog(null,"Seu peso ideal é: " + pesom);
                cond = 1;
            }
            else if (sexo == 'f' || sexo == 'F'){
                float pesof = (float) ((62.1*altura)-44.7);
                JOptionPane.showMessageDialog(null,"Seu peso ideal é: " + pesof);
                cond = 1;
            }
            else{
                sexo = JOptionPane.showInputDialog("Opa! você digitou um valor invalido, digite de novo! \n [utilize (F) para Feminino e (M) para masculino]: ").charAt(0);
            }
        }
    }
}




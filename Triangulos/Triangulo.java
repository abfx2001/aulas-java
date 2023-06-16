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
        //Teste de controle para verificar se o Triângulo Existe.
        else{
            JOptionPane.showMessageDialog(null, "Este triângulo NÃO EXISTE!!");
        }
    }  
}

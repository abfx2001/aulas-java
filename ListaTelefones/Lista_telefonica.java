package lista_telefonica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lista_telefonica {
    
    public static void main(String[] args) {
        
        String menu = "0- Sair \n1- Adicionar Nome e Telefone \n2- Alterar Telefone \n3- Consultar Telefone\n4- Excluir Nome e Telefone \n5- Listar Agenda";
        
        ArrayList <Nomes> nomes = new ArrayList <> ();
        ArrayList <Fones> fones = new ArrayList <> ();
        
        int opcao;
        do{
           opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
           switch (opcao){
               case 1:
                   String lernome = JOptionPane.showInputDialog("Qual o nome ?");
                   Nomes nome = new Nomes (lernome);
                   nomes.add(nome);
                   
                   String lerfone = JOptionPane.showInputDialog("Qual o Telefone ?");
                   Fones fone = new Fones (lerfone);
                   fones.add(fone);
                   
                   break;
               case 2:
                   String alterar = JOptionPane.showInputDialog("De qual nome deseja alterar o Telefone ? \n" + nomes);
                   String novofone = JOptionPane.showInputDialog("Digite o novo Telefone:");
                   int i;
                   for (i = 0; i < nomes.size(); i++){
                       if (nomes.get(i).getNome().equals(alterar)){
                           fones.get(i).setNovofone(novofone);
                           break;
                       }
                   }
                   JOptionPane.showMessageDialog(null, i < nomes.size()? "Telefone alterado com sucesso" : "Ops!! nome está errado ou não existe!");
                   break;
               case 3:
                   String verfone = JOptionPane.showInputDialog("De qual nome deseja ver o Telefone ?\n" + nomes);
                   int j;
                   for (j = 0; j < nomes.size(); j++){
                       if (nomes.get(j).getNome().equals(verfone)){
                           JOptionPane.showMessageDialog(null, "O telefone de "+ nomes.get(j)+" é: "+ fones.get(j));
                           break;
                       }
                   }
                   break;
               case 4:
                   String remover = JOptionPane.showInputDialog("De qual nome deseja REMOVER os dados ?\n" + nomes);
                   int k;
                   for (k = 0; k < nomes.size(); k++){
                       if (nomes.get(k).getNome().equals(remover)){
                           nomes.remove(k);
                           fones.remove(k);
                           JOptionPane.showMessageDialog(null, "O Nome e Telefone foram removidos da agenda");
                           break;
                       }
                   }
                   break;
               case 5: 
                   JOptionPane.showMessageDialog(null,"A lista da agenda se encontra no painel do Terminal!!!");
                   int l;
                   for (l = 0; l < nomes.size(); l++){
                       System.out.println("Nome: "+ nomes.get(l)+" - Telefone: " + fones.get(l));
                   }
                   break;
               case 0:
                   JOptionPane.showMessageDialog(null, "Até mais ver!!");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opção inválida");
           }
        }while (opcao != 0);
        
    }
    
}

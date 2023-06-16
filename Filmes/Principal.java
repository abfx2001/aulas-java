
package com.mycompany.lista_de_filmes;

import java.util.List;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        String menu = "1-Cadastrar Filme\n2-Atualizar Filme\n3-Apagar Filme\n4-Listar\n0-Sair";
        int op = -1;
        do{
            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (op){
                    case 1:{
                        String titulo = JOptionPane.showInputDialog("Qual é o Título?");
                        String diretor = JOptionPane.showInputDialog("Qual é o Diretor?");
                        String ator = JOptionPane.showInputDialog("Qual é o Ator Principal?");
                        String genero = JOptionPane.showInputDialog("Qual é o Gênero do Filmes?");
                        Filme f = new Filme (titulo, diretor, ator, genero);
                        f.inserir();
                        JOptionPane.showMessageDialog(null, "inserção OK");
                    }
                        break;
                    case 2:{
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("qual o código?"));
                        String titulo = JOptionPane.showInputDialog("Qual é o Título?");
                        String diretor = JOptionPane.showInputDialog("Qual é o Diretor?");
                        String ator = JOptionPane.showInputDialog("Qual é o Ator Principal?");
                        String genero = JOptionPane.showInputDialog("Qual é o Gênero do Filmes?");
                        Filme f = new Filme (codigo, titulo, diretor, ator, genero);
                        f.atualizar();
                        JOptionPane.showMessageDialog(null, "Atualização OK");
                    }
                        break;
                    case 3:
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o Código?"));
                        Filme f = new Filme(codigo);
                        f.apagar();
                        JOptionPane.showMessageDialog(null, "Apagado com sucesso");
                        break;
                    case 4:
                        
                        Filme.listar();                
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Até mais");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opção invalida");
                        break;
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite um número do menu");
            }
        }while (op != 0);
    }
}

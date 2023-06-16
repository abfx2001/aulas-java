
package com.mycompany.lista_de_filmes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Filme {
    
    private int codigo;
    private String titulo;
    private String diretor;
    private String ator;
    private String genero;

    
    public String getTitulo(){
        return this.titulo;
    }
    
    
    
    public Filme (String titulo, String diretor, String ator, String genero){
        this.titulo = titulo;
        this.diretor = diretor;
        this.ator = ator;
        this.genero = genero;
    }
    
    public Filme (int codigo, String titulo, String diretor, String ator, String genero){
        this(titulo, diretor, ator, genero);
        this.codigo = codigo;
    }
    
    public Filme (int codigo){
        this.codigo = codigo;
    }
    
    
    public void inserir (){
        String sql = "INSERT INTO tb_filme (titulo, diretor, ator, genero) VALUES (?, ?, ?, ?);";
        ConnectionFactory fabrica = new ConnectionFactory();
        Connection c = null;
        try{
           c = fabrica.obterConexao();
           PreparedStatement ps = c.prepareStatement(sql);
           ps.setString(1, titulo);
           ps.setString(2, diretor);
           ps.setString(3, ator);
           ps.setString(4, genero);
           ps.execute();
           
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try{
               c.close(); 
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            
        }
    }
    
    public void atualizar (){
        String sql = "UPDATE tb_filme SET titulo = ?, diretor = ?, ator = ?, genero = ? WHERE codigo = ?";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setString(2, diretor);
            ps.setString(3, ator);
            ps.setString(4, genero);
            ps.setInt(5, codigo);
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void apagar(){
        String sql = "DELETE FROM tb_filme WHERE codigo = ?";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static List <Filme> buscar (){
        List <Filme> filmes = new ArrayList <>();
        String sql = "SELECT * FROM tb_filme";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String titulo = rs.getString("titulo");
                String diretor = rs.getString("diretor");
                String ator = rs.getString("ator");
                String genero = rs.getString("genero");
                Filme f = new Filme (codigo, titulo, diretor, ator, genero);
                filmes.add(f);
            }
            
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return filmes;
    }
    
    public static void listar(){
        String sql = "SELECT*FROM tb_filme";
        try(Connection conexao = new ConnectionFactory().obterConexao()){
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String titulo = rs.getString("titulo");
                String diretor = rs.getString("diretor");
                String ator = rs.getString("ator");
                String genero = rs.getString("genero");
                String aux = String.format(
                "Código do Filme: %d \nTítulo: %s, \nDiretor: %s, \nAtor Principal: %s, \nGênero: %s \n"
                , codigo, titulo, diretor, ator, genero);
                System.out.println(aux);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

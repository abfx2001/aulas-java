
package com.mycompany.lista_de_filmes;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "senha";
    private String host = "localhost";
    private String porta = "3306";
    private String db = "bd_filmes";
    
    public Connection obterConexao (){
        
        try{
           Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC",
                usuario,
                senha
            ); 
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

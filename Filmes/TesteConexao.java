
package com.mycompany.lista_de_filmes;

import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        ConnectionFactory fabrica = new ConnectionFactory();
        Connection c = fabrica.obterConexao();
        if (c != null){
            System.out.println("deu bom");
        }
        else{
            System.out.println("não deu certo");
        }
    }
}

package projetohineni;

import projetohineni.TelaEntrada;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ProjetoHINENI {

    public static void main(String[] args) {
    Connection conn = null;
    
    try {

    Class.forName("com.mysql.cj.jdbc.Driver");

    conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root");

    System.out.println("Conexão com o banco de dados estabelecida.");
} catch (ClassNotFoundException | SQLException e) {
    System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
}
   
    }
    
    
    javax.swing.SwingUtilities.invokeLater(() ->  {
        TelaEntrada TelaEntrada()= new TelaEntrada;
        new TelaEntrada().setVisible(true);
    });
}
package projetohineni;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ProjetoHINENI {

    public static void main(String[] args) {
        
    try {
        
        conn = DriverManager.getConnection("com.mysql.cj.jdbc.Driver");
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro na conexão" + erro.getMessage());
        }
        Connection con = null;
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root");
            System.out.println( "Conexao com o banco de dados estabelecida." );
        } catch ( SQLException sqle ) {
            System.out.println( "Erro na conexao ao Bando de Dados : " +
                                        sqle.getMessage() );
        }
    }
    }


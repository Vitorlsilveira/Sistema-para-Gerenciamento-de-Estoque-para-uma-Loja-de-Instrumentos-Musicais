/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almondessol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author estevao
 */
public class ConexaoBanco {
    public Statement stm; 
    public ResultSet rs; 
    private String driver= "com.mysql.jdbc.Driver"; 
    private String caminho = "jdbc:mysql://localhost:3306/almonde_sol"; 
    private String usuario="root";
    private String senha="ribeiro3#"; 
    public java.sql.Connection conection; 
    
    public void Conexao(){ 

        try { 

            System.setProperty("jbdc.Drivers", driver ); 
            conection=DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("Banco iniciado");

        } catch (SQLException ex) { 

            JOptionPane.showMessageDialog(null, "Error na conexao " + ex.getMessage());

        }

    }
    
    
    public void cadastrar(Instrumento instrumento){

        ConexaoBanco conexaobanco = new ConexaoBanco();
        conexaobanco.Conexao();
        
        String cmd = "insert into instrumento (nome, marca, tipo, modelo, descricao, codBar, preco, quant) values(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = conexaobanco.conection.prepareStatement(cmd);
            pst.setString(1,instrumento.nome);
            pst.setString(2,instrumento.marca);
            pst.setString(3,instrumento.tipo);
            pst.setString(4,instrumento.modelo);
            pst.setString(5,instrumento.descricao);
            pst.setInt(6,instrumento.codBar);
            pst.setDouble(7,instrumento.preco);
            pst.setInt(8,instrumento.quant);
            
            
            pst.execute();            
            pst.close();
            System.out.println("Valores inseridos");
        } catch (SQLException ex) {
            
        }

    }    
   
}
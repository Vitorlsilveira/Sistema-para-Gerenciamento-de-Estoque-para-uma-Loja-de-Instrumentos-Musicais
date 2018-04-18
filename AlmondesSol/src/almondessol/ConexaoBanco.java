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
   
    
    public ArrayList<Instrumento> Listar(){

        ConexaoBanco conexaobanco = new ConexaoBanco();
        conexaobanco.Conexao();
        ArrayList<Instrumento> Informacoes = new ArrayList<>();
        String cmd = "select * from instrumento";              
        try {
           
            PreparedStatement pst = conexaobanco.conection.prepareStatement(cmd);
            conexaobanco.rs = pst.executeQuery(cmd);
            while(conexaobanco.rs.next()){
                    Instrumento dados = new Instrumento(
                        conexaobanco.rs.getString("nome"), 
                        conexaobanco.rs.getString("marca"), 
                        conexaobanco.rs.getString("tipo"), 
                        conexaobanco.rs.getString("modelo"), 
                        conexaobanco.rs.getString("descricao"), 
                        conexaobanco.rs.getInt("codBar"), 
                        (int) conexaobanco.rs.getDouble("preco"), 
                        conexaobanco.rs.getInt("quant")
                    );                       

                    Informacoes.add(dados);
            }            
            pst.execute();
            pst.close();
            
            
            return Informacoes;

        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        return null;
    }
    
    public ArrayList<Instrumento> Buscar(String busca, int op){

        ConexaoBanco conexaobanco = new ConexaoBanco();
        conexaobanco.Conexao();
        ArrayList<Instrumento> Informacoes = new ArrayList<>();
        
        String pesq=null;
        
        if(op == 1)
            pesq = "nome";
        if (op == 2)
            pesq = "marca";            
        if (op == 3)
            pesq = "modelo";
        
                
        String cmd = "select * from instrumento where '%"+pesq+"%' like '%"+busca+"%';";
        
        try {
           
            PreparedStatement pst = conexaobanco.conection.prepareStatement(cmd);
            conexaobanco.rs = pst.executeQuery(cmd);
            while(conexaobanco.rs.next()){
                    Instrumento dados = new Instrumento(
                        conexaobanco.rs.getString("nome"), 
                        conexaobanco.rs.getString("marca"), 
                        conexaobanco.rs.getString("tipo"), 
                        conexaobanco.rs.getString("modelo"), 
                        conexaobanco.rs.getString("descricao"), 
                        conexaobanco.rs.getInt("codBar"), 
                        (int) conexaobanco.rs.getDouble("preco"), 
                        conexaobanco.rs.getInt("quant")
                    );                       

                    Informacoes.add(dados);
            }            
            pst.execute();
            pst.close();
            
            
            return Informacoes;

        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        return null;
    }
    
        
    
}
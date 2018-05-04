/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Gerente;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tomaz
 */
public class DAOGerente {

    public boolean save(Gerente g){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        try {
            stmt = con.prepareStatement("INSERT INTO gerente (usuario,senha)VALUES(?,?)");
            stmt.setString(1, g.getUsuario());
            stmt.setString(2,g.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
            return false;
        }finally{
             ConnectionFactory.closeConection(con, stmt);
            return false;
        }
        
    }
    
    public boolean update(Gerente g){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String str = "update produto set usuario = "+g.getUsuario()+",senha="+g.getSenha()+" where id_servico = "+g.getUsuario()+";";
        
        try {
            stmt = con.prepareStatement(str);
            stmt.executeUpdate();
             return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na Edição");
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
       
    }
    
    public boolean delete(Gerente g){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String str = "delete from gerente where id="+g.getUsuario()+";";
        
        try {
            stmt = con.prepareStatement(str);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas ao Deletar!");
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
}

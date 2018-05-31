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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tomaz
 */
public class DAOGerente {

    public boolean save(Gerente g){
        Connection con = ConnectionFactory.getInstance().getConnection();
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
        
        String str = "update gerente set usuario= "+g.getUsuario()+", senha= "+g.getSenha()+" where usuario= "+g.getUsuario()+";";

        try {
            stmt = con.prepareStatement(str);
            stmt.executeUpdate();
            stmt.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas na Edição");
            System.out.println(ex);
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
       
    }
    
    public boolean delete(String user){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String str = "delete from gerente where usuario="+user+";";
        
        try {
            stmt = con.prepareStatement(str);
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Usuario deletado!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas ao Deletar!");
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean login(Gerente g){
        ResultSet rs = null;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Produto> result = new ArrayList();
        String str = "select * from gerente;";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
                if((rs.getString("usuario").equals(g.getUsuario())) && (rs.getString("senha").equals(g.getSenha()))){                    
                    return true;
                }               
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
      
    }
}

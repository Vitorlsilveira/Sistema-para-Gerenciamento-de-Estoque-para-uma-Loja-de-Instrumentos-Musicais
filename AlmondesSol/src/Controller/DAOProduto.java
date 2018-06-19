/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
public class DAOProduto {
    ConnectionFactory intance = ConnectionFactory.getInstance();
    
    public boolean save(Produto p){
        Connection con = intance.getConnection();
        PreparedStatement stmt = null; 
        if(!verificacao(p)){
            return false;
        }
        try {
            stmt = con.prepareStatement("INSERT INTO produto (codBar,nome,marca,modelo,descricao,preco,quant)VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, p.getCode());
            stmt.setString(2, p.getNome());
            stmt.setString(3,p.getMarca() );
            stmt.setString(4,p.getModelo() );
            stmt.setString(5, p.getDecricao());
            stmt.setFloat(6,p.getPreco() );
            stmt.setInt(7, p.getQuant());
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            return true;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConection(con, stmt);
            return true;
        }
        
    }
    
    public boolean update(Produto p){
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        String str = "update produto set codBar = "+p.getCode()+",nome='"+p.getNome()+"',marca='"+ p.getMarca()+"',modelo='"+p.getModelo()+"',descricao='"+p.getDecricao()+"',preco="+p.getPreco()+", quant="+p.getQuant()+" where id = "+p.getId()+";";
        if(!verificacao(p)){
            return false;
        }
        try {
            stmt = con.prepareStatement(str);
            stmt.executeUpdate();
             return true;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Problemas na Edição");
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
       
    }
    
    public boolean delete(Produto p){
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        String str = "delete from produto where id="+p.getId()+";";
        
        try {
            stmt = con.prepareStatement(str);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Problemas ao Deletar!");
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public ArrayList<Produto> listar_todos(){
        ResultSet rs = null;
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Produto> result = new ArrayList();
        String str = "select * from produto;";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
               Produto p1 = new Produto(rs.getInt("id"),rs.getInt("codBar"),rs.getInt("quant"),rs.getString("nome"),rs.getString("marca"),rs.getString("modelo"),rs.getString("descricao"),rs.getFloat("preco"));
               result.add(p1);
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public ArrayList<Produto> listar_por_cod(int code){
        ResultSet rs = null;
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Produto> result = new ArrayList();
        String str = "select * from produto where codBar like '%"+code+"%';";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
               Produto p1 = new Produto(rs.getInt("id"),rs.getInt("codBar"),rs.getInt("quant"),rs.getString("nome"),rs.getString("marca"),rs.getString("modelo"),rs.getString("descricao"),rs.getFloat("preco"));
               result.add(p1);
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public ArrayList<Produto> listar_por_prod(String nome){
        ResultSet rs = null;
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Produto> result = new ArrayList();
        String str = "select * from produto where nome like '%"+nome+"%';";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
               Produto p1 = new Produto(rs.getInt("id"),rs.getInt("codBar"),rs.getInt("quant"),rs.getString("nome"),rs.getString("marca"),rs.getString("modelo"),rs.getString("descricao"),rs.getFloat("preco"));
               result.add(p1);
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public boolean verificarCodBarras(String code){
        ResultSet rs = null;
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Produto> result = new ArrayList();
        String str = "select * from produto;";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
                if(rs.getString("codBar").equals(code)){
                    
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
    
    public boolean verificacao(Produto p){
        if((p.getDecricao().equals(""))||(p.getNome().equals(""))||(p.getMarca().equals(""))||(p.getModelo().equals(""))){
           return false; 
        }
        if(p.getQuant()<0){
            return false;
        }
        if(p.getPreco()<=0){
            return false;
        }
        if(p.getCode()==0){
            return false;
        }
        return true;
    }
}


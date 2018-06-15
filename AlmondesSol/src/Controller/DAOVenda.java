/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import Model.Venda;
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
public class DAOVenda {
    ConnectionFactory intance = ConnectionFactory.getInstance();
    public boolean save(Venda v){
        Connection con = intance.getConnection();
        System.err.println(intance);
        PreparedStatement stmt = null;
        if(!verifica(v)){
            return false;
        }
        try {
            stmt = con.prepareStatement("INSERT INTO venda (data_venda,total)VALUES(?,?)");
            stmt.setString(1, v.getData());
            stmt.setFloat(2,v.getTotal());
            stmt.executeUpdate();
            ConnectionFactory.closeConection(con, stmt);
            boolean result = listSave(v.getShopping());
            if(result){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar "+ ex);
            return false;
        }
        
    }
    public boolean saveWhithCpf(Venda v){
        Connection con = intance.getConnection();
        PreparedStatement stmt = null; 
        if(!verifica(v)){
            return false;
        }
        try {
            stmt = con.prepareStatement("INSERT INTO venda (data_venda,total,cpf_cli)VALUES(?,?,?)");
            stmt.setString(1, v.getData());
            stmt.setFloat(2,v.getTotal());
            stmt.setString(3, v.getCpf_cli());
            stmt.executeUpdate();
            ConnectionFactory.closeConection(con, stmt);
            boolean result = listSave(v.getShopping());
            if(result){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
            return false;
        }
    }
    
    public boolean listSave(ArrayList<Produto> shoping){
        ResultSet rs = null;
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        if(!verivicaListaProd(shoping)){
            return false;
        }
        int id=0;
        String str = "select max(id) as id from venda;";
        try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
            }
            ConnectionFactory.closeConection(con, stmt,rs);
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.err.println(id);
        for(Produto p: shoping){
            con = ConnectionFactory.getConnection();
            stmt = null;
            try {
                stmt = con.prepareStatement("INSERT INTO venda_instrumento (id_venda,id_prod,quant_prod,valor_unit)VALUES(?,?,?,?)");
                stmt.setInt(1, id);
                stmt.setInt(2, p.getId());
                stmt.setInt(3, p.getQuant());
                stmt.setFloat(4,p.getPreco());
                stmt.executeUpdate();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
                return false;
            }
        }
        return true;
    }
    public ArrayList<Venda> listar_todos(){
        ResultSet rs = null;
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Venda> result = new ArrayList();
        String str = "select * from venda;";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
                int id = rs.getInt("id");
                ArrayList<Produto> p = listar_por_cod(id);
                Venda v = new Venda(id,rs.getString("cpf_cli"),rs.getString("data_venda"),rs.getFloat("total"),p);
                result.add(v);
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    public ArrayList<Venda> listar_por_data(String data){
        ResultSet rs = null;
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Venda> result = new ArrayList();
        String str = "select * from venda where data_venda like '%"+data+"%';";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
                int id = rs.getInt("id");
                ArrayList<Produto> p = listar_por_cod(id);
                Venda v = new Venda(id,rs.getString("cpf_cli"),rs.getString("data_venda"),rs.getFloat("total"),p);
                result.add(v);
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    public ArrayList<Venda> listar_por_cli(String cpf){
        ResultSet rs = null;
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Venda> result = new ArrayList();
        String str = "select * from venda where cpf_cli like '%"+cpf+"%';";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
                int id = rs.getInt("id");
                ArrayList<Produto> p = listar_por_cod(id);
                Venda v = new Venda(id,rs.getString("cpf_cli"),rs.getString("data_venda"),rs.getFloat("total"),p);
                result.add(v);
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
        String str = "select produto.id,produto.codBar,produto.nome,produto.marca, produto.modelo, produto.descricao,produto.preco,result.quantidade from (select id_prod as iden,quant_prod as quantidade  from venda_instrumento where id_venda="+code+") as result inner join produto on result.iden=produto.id;";
        try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
               Produto p1 = new Produto(rs.getInt("id"),rs.getInt("codBar"),rs.getInt("quantidade"),rs.getString("nome"),rs.getString("marca"),rs.getString("modelo"),rs.getString("descricao"),rs.getFloat("preco"));
               result.add(p1);
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
         return result;
    }
    
    public boolean delete(Venda v){
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        String str = "delete from venda where id="+v.getId()+";";
        
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
    
   
    public boolean verifica(Venda v){
        if(v.getData().equals("")){
            return false;
        }
        if(v.getTotal()<=0){
           return false; 
        }
        if(v.getShopping()==null){
          return false; 
        }
        if(v.getShopping().isEmpty()){
            return false;
        }
        return true;
    }
    
    public boolean verivicaListaProd(ArrayList<Produto> shoping){
         DAOProduto instance = new DAOProduto();
         for(Produto p:shoping){
             Produto aux = instance.listar_por_cod(p.getCode()).get(0);
             if(aux.getQuant()< p.getQuant()){
                 return false;
             }
         }
        return true;
    }
}

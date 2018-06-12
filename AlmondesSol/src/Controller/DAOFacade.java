package Controller;
import Model.Gerente;
import Model.Venda;
import Model.Produto;
import java.util.ArrayList;

public class DAOFacade {

    private Gerente gerente;
    private Produto produto;
    private Venda venda;
    
    public DAOFacade(){
        this.gerente = gerente;
        this.produto = produto;
        this.venda = venda;
    }
    
    public static boolean saveProduto(Produto produto){
        DAOProduto operacaoDAO = new DAOProduto();
        System.err.println(produto.getCode());
        return operacaoDAO.save(produto);
    }
    
    public static ArrayList<Produto> listaProduto(){
        DAOProduto produtos = new DAOProduto();
        return produtos.listar_todos();
    }
    
    public static ArrayList<Produto> listaProdutoCod(int code){
        DAOProduto produtos = new DAOProduto();
        return produtos.listar_por_cod(code);
    }
    
    public static ArrayList<Produto> listaProdutoNome(String nome){
        DAOProduto produtos = new DAOProduto();
        return produtos.listar_por_prod(nome);
    }
    
    public static boolean deleteProduto(Produto produto){
        DAOProduto produtos = new DAOProduto();
        return produtos.delete(produto);
    }
    
}

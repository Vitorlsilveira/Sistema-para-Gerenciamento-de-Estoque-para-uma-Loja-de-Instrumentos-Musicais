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
    
    public static ArrayList<Venda> listaVenda(){
        DAOVenda vendas = new DAOVenda();
        return vendas.listar_todos();
    }
    
    public static ArrayList<Venda> listaVendaData(String data){
        DAOVenda vendas = new DAOVenda();
        return vendas.listar_por_data(data);
    }
    
    public static ArrayList<Venda> listaVendaClinte(String cpf){
        DAOVenda vendas = new DAOVenda();
        return vendas.listar_por_cli(cpf);
    }
    
    public static boolean salvaGerente(String nome, String senha){
        Gerente gerente = new Gerente(nome, senha);
        DAOGerente operacaoDAO = new DAOGerente();
        return operacaoDAO.save(gerente);
    }
    
    public static boolean excluiGerente(String nome){
        Gerente gerente = new Gerente(nome,null);
        DAOGerente operacaoDAO = new DAOGerente();
        return operacaoDAO.delete(nome);
    }
    
    public static boolean loginGerente(String nome, String senha){
        Gerente gerente = new Gerente(nome,senha);
        DAOGerente operacaoDAO = new DAOGerente();
        return operacaoDAO.login(gerente);
    }
    
    public static boolean alterarGerente(String nome, String senha){
        Gerente gerente = new Gerente(nome,senha);
        DAOGerente operacaoDAO = new DAOGerente();
        return operacaoDAO.update(gerente);
    }
    
    
}

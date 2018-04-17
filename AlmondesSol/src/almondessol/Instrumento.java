/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almondessol;

/**
 *
 * @author tomaz
 */
public class Instrumento {
    
    
    String nome,marca,modelo,tipo,descricao;
    double preco;
    int quant, codBar;
    
    
    public Instrumento(){
     
    }
    
    public Instrumento(String nome,String marca,String modelo, String tipo, String descricao, int codBar, double preco, int quant){
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.quant = quant;
        this.codBar = codBar;
    } 

    public Instrumento(String nome,String marca,String modelo, String tipo, String descricao, double preco, int quant){
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.quant = quant;
    }     

    public int getCodBar() {
        return codBar;
    }

    public void setCodBar(int codBar) {
        this.codBar = codBar;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "nome=" + nome + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", descricao=" + descricao + ", preco=" + preco + ", quant=" + quant + ", codBar=" + codBar + '}';
    }
    
}

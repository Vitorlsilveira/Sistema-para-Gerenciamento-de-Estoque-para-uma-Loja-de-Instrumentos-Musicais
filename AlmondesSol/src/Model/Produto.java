/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tomaz
 */
public class Produto {
    private int code,quant,id;
    private String nome,marca,modelo,decricao;
    private float preco;

    public Produto(int code, int quant, String nome, String marca, String modelo, String decricao, float preco) {
        this.code = code;
        this.quant = quant;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.decricao = decricao;
        this.preco = preco;
    }

    public Produto(int id,int code, int quant, String nome, String marca, String modelo, String decricao, float preco) {
        this.code = code;
        this.quant = quant;
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.decricao = decricao;
        this.preco = preco;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the decricao
     */
    public String getDecricao() {
        return decricao;
    }

    /**
     * @param decricao the decricao to set
     */
    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
}

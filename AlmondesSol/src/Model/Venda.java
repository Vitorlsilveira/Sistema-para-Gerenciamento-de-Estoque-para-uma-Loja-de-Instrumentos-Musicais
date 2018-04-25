/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author tomaz
 */
public class Venda {
   private int id;
   private String cpf_cli,data;
   private float total;
   private ArrayList<Produto> shopping;

    public Venda(String cpf_cli, String data, float total, ArrayList<Produto> shopping) {
        this.cpf_cli = cpf_cli;
        this.data = data;
        this.total = total;
        this.shopping = shopping;
    }

    public Venda(int id, String cpf_cli, String data, float total, ArrayList<Produto> shopping) {
        this.id = id;
        this.cpf_cli = cpf_cli;
        this.data = data;
        this.total = total;
        this.shopping = shopping;
    }

    public String getCpf_cli() {
        return cpf_cli;
    }
    
    public void setCpf_cli(String cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<Produto> getShopping() {
        return shopping;
    }

    public void setShopping(ArrayList<Produto> shopping) {
        this.shopping = shopping;
    }
}

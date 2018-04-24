/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author tomaz
 */
public class MainView extends JFrame{
    JLabel lbTitulo,lbImagem;
    JButton btVender,btListar,btCadastrar,btHisto,btadm;
    boolean validacao;
    
    
     public MainView(boolean validacao){
        super("AlmondesSol");
        this.validacao = validacao;
        int sizeSub = 0;
        if(this.validacao){
            sizeSub = 50;
        }
        setSize(600,(550+sizeSub));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);  
        setLocation(450,100);
        initComponents();
        setVisible(true);

        
    }
    public void initComponents(){
       setLayout(null);
        Icon img = new ImageIcon("Imagens\\sol.png");
        Icon imgvend= new ImageIcon("Imagens\\cart.png");
        Icon imglist = new ImageIcon("Imagens\\glass.png");
        Icon imghits = new ImageIcon("Imagens\\history.png");
        Icon imgadm = new ImageIcon("Imagens\\tie.png");
        Icon imgcad = new ImageIcon("Imagens\\write.png");
        lbImagem = new JLabel(img);
        lbImagem.setSize(300,300);
        lbImagem.setLocation(150,0);
        add(lbImagem);
        btadm = new JButton();
        btadm.setSize(40,45);
        btadm.setLocation(540,0);
        btadm.setIcon(imgadm);
        btadm.setToolTipText("Funções de Gerente");
        add(btadm);
        btVender = new JButton("Vender");
        btVender.setSize(400,45);
        btVender.setLocation(100,300);
        btVender.setIcon(imgvend);
        add(btVender);
        btListar = new JButton("Listar Produtos");
        btListar.setSize(400,45);
        btListar.setLocation(100,350);
        btListar.setIcon(imglist);
        add(btListar);
        btHisto = new JButton("Historico de Vendas");
        btHisto.setSize(400,45);
        btHisto.setLocation(100,400);
        btHisto.setIcon(imghits);
        add(btHisto);
        if(this.validacao){
            btCadastrar = new JButton("Cadastrar Produtos");
            btCadastrar.setSize(400,45);
            btCadastrar.setLocation(100,450);
            btCadastrar.setIcon(imgcad);
            add(btCadastrar);
        }
      
    }
}

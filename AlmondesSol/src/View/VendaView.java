/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DAOFacade;
import Controller.DAOProduto;
import Controller.DAOVenda;
import Model.Produto;
import Model.Venda;
import java.awt.Color;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tomaz
 */
public class VendaView extends javax.swing.JFrame {

    /**
     * Creates new form VendaView
     */
    public VendaView() {
        super("Almondes Sol - Vendas");
        initComponents();this.setLocationRelativeTo(null);
        rbCod.setSelected(true);
        DAOFacade produtos = new DAOFacade();
        list = produtos.listaProduto();
        construirTabla(list);
        
    }
   
    public void construirTabla(ArrayList<Produto> produtos){
        modelo = (DefaultTableModel) tabela_lista_produtos.getModel();
        modelo.setNumRows(0);
       
        for(Produto p: produtos){
            modelo.addRow(new Object[]{
                p.getCode(),
                p.getNome(),
                p.getMarca(),
                p.getModelo(),
                p.getPreco(),
                p.getQuant()
            });
        }
        
    }
    
    
    
    public void construirTabla2(ArrayList<Produto> produtos){
        modelo2 = (DefaultTableModel) tabela_lista_compra.getModel();
        modelo2.setNumRows(0);
       
        for(Produto p: produtos){
            modelo2.addRow(new Object[]{
                p.getCode(),
                p.getNome(),
                p.getMarca(),
                p.getModelo(),
                p.getPreco(),
                p.getQuant()
            });
        }
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jFrame1 = new javax.swing.JFrame();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        menuBar4 = new java.awt.MenuBar();
        menu7 = new java.awt.Menu();
        menu8 = new java.awt.Menu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        rbCod = new javax.swing.JRadioButton();
        rbProduto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_lista_produtos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_vender = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_limpar_listar_produtos = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_finalizar_venda = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_lista_compra = new javax.swing.JTable();
        tfcpfcli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_retirar_produto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_Realizar_Venda = new javax.swing.JMenu();
        menu_Historico_Venda = new javax.swing.JMenu();
        menu_lista_produtos = new javax.swing.JMenu();
        admin = new javax.swing.JMenu();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        menu7.setLabel("File");
        menuBar4.add(menu7);

        menu8.setLabel("Edit");
        menuBar4.add(menu8);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("jMenu1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar:");

        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarKeyReleased(evt);
            }
        });

        rbCod.setText("Código de Barras");
        rbCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodActionPerformed(evt);
            }
        });

        rbProduto.setText("Produto");
        rbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProdutoActionPerformed(evt);
            }
        });

        tabela_lista_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Barras", "Produto", "Marca", "Modelo", "Preço", "Quantidade em Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_lista_produtos.setToolTipText("");
        jScrollPane1.setViewportView(tabela_lista_produtos);

        jLabel2.setText("Lista de Produtos");

        btn_vender.setText("Vender");
        btn_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venderActionPerformed(evt);
            }
        });

        jLabel3.setText("Produtos Selecionados");

        btn_limpar_listar_produtos.setText("Limpar Lista de Produtos");
        btn_limpar_listar_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar_listar_produtosActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_finalizar_venda.setText("Finalizar Venda");
        btn_finalizar_venda.setToolTipText("");
        btn_finalizar_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizar_vendaActionPerformed(evt);
            }
        });

        tabela_lista_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Barras", "Produto", "Marca", "Modelo", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabela_lista_compra);

        jLabel4.setText("Cpf  Cliente:");

        btn_retirar_produto.setText("Retirar Produto");
        btn_retirar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirar_produtoActionPerformed(evt);
            }
        });

        menu_Realizar_Venda.setText("Realizar Venda");
        menu_Realizar_Venda.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_Realizar_VendaMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(menu_Realizar_Venda);

        menu_Historico_Venda.setText("Historico Venda");
        menu_Historico_Venda.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_Historico_VendaMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(menu_Historico_Venda);

        menu_lista_produtos.setText("Lista Produtos");
        menu_lista_produtos.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_lista_produtosMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(menu_lista_produtos);

        admin.setText("Administrador");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        jMenuBar1.add(admin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfcpfcli, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(btn_finalizar_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limpar_listar_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(btn_retirar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rbCod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rbProduto))
                        .addComponent(jLabel1)
                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_vender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCod)
                    .addComponent(rbProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_vender)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_retirar_produto)
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpar_listar_produtos)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_finalizar_venda)
                    .addComponent(tfcpfcli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyReleased
        // TODO add your handling code here:
        
        if(tfBuscar.getText().equals("")){
                    DAOFacade produtos = new DAOFacade();
                    list = produtos.listaProduto();
                    construirTabla(list);
                  }else{
                        DAOFacade produtos = new DAOFacade();
                        int code = Integer.parseInt(tfBuscar.getText());
                        if(rbCod.isSelected()){
                            try{
                               list = produtos.listaProdutoCod(code);
                               construirTabla(list); 
                            }catch(NumberFormatException e){
                                list = new ArrayList();
                                construirTabla(list);
                            }   
                        }
                        if(rbProduto.isSelected()){
                            list = produtos.listaProdutoCod(code);
                            construirTabla(list);
                        }
                    
                }
    }//GEN-LAST:event_tfBuscarKeyReleased

    private void rbCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodActionPerformed
        if(evt.getSource()==rbCod){
           rbProduto.setSelected(false);
        }
    }//GEN-LAST:event_rbCodActionPerformed

    private void rbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProdutoActionPerformed
                                      
         if(evt.getSource()==rbProduto){
            rbCod.setSelected(false);
        }
    }//GEN-LAST:event_rbProdutoActionPerformed

    private void btn_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venderActionPerformed
        int i = tabela_lista_produtos.getSelectedRow();
        if(i!=-1){
           int op =Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade desejada: "));
           Produto p = list.get(i);
           if(p.getQuant()>=op){
               p.setQuant(op);
               list2.add(p);
               construirTabla2(list2);
               
           }else{
               JOptionPane.showMessageDialog(null, "A Quantidade Solicitada Excede o Estoque!");
           }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Produto Selecionado!");
        }
            
    }//GEN-LAST:event_btn_venderActionPerformed

    private void btn_retirar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retirar_produtoActionPerformed
        int i = tabela_lista_compra.getSelectedRow();
        if(i!=-1){
             int dialogButton = JOptionPane.YES_NO_OPTION;
             int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja realmene excluir o prouto selecionado?","Warning",dialogButton);
             if(dialogResult==JOptionPane.YES_OPTION){
                 list2.remove(i);
                 construirTabla2(list2);
             }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Produto Selecionado!");
        }
           
    }//GEN-LAST:event_btn_retirar_produtoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       new HistVendasView().setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_limpar_listar_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpar_listar_produtosActionPerformed
       int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja realmene excluir o prouto selecionado?","Warning",dialogButton);
       if(dialogResult==JOptionPane.YES_OPTION){
            list2.clear();
            construirTabla2(list2);
       }
    }//GEN-LAST:event_btn_limpar_listar_produtosActionPerformed
    
    private String getDateTime() { 
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
	Date date = new Date(); 
	String t[] = dateFormat.format(date).split(" "); 
        return t[0].replace("/","-");
    }
    float totalCompra(ArrayList<Produto> produtos){
        float total = 0;
        for(Produto p: produtos){
            total = total + (p.getPreco()* p.getQuant());
        }
        return total;
    }
    
    private void btn_finalizar_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizar_vendaActionPerformed
        DAOVenda venda = new DAOVenda();
        if(!list2.isEmpty()){
            float total  = totalCompra(list2);
            Venda v = new Venda(tfcpfcli.getText(),getDateTime(),total,list2);
            if(v.getCpf_cli().equals("")){
                boolean verifica = venda.save(v);                                
            }else{
                boolean verifica = venda.saveWhithCpf(v);
            }
            
            list2.clear();
            construirTabla2(list2);
            JOptionPane.showMessageDialog(null, "Compra Confirmada!");
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Produto Selecionado!");
        }
    }//GEN-LAST:event_btn_finalizar_vendaActionPerformed

    private void menu_Realizar_VendaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_Realizar_VendaMenuSelected
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_Realizar_VendaMenuSelected

    private void menu_Historico_VendaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_Historico_VendaMenuSelected
        // TODO add your handling code here:
        new HistVendasView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_Historico_VendaMenuSelected

    private void menu_lista_produtosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_lista_produtosMenuSelected
        // TODO add your handling code here:
        new ListarProdView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_lista_produtosMenuSelected

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        // TODO add your handling code here:
        new UserLog().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VendaView().setVisible(true);
//            }
//        });
//    }
    ArrayList<Produto> list;
    ArrayList<Produto> list2 = new ArrayList();
    DefaultTableModel modelo,modelo2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admin;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_finalizar_venda;
    private javax.swing.JButton btn_limpar_listar_produtos;
    private javax.swing.JButton btn_retirar_produto;
    private javax.swing.JButton btn_vender;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.Menu menu7;
    private java.awt.Menu menu8;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private java.awt.MenuBar menuBar4;
    private javax.swing.JMenu menu_Historico_Venda;
    private javax.swing.JMenu menu_Realizar_Venda;
    private javax.swing.JMenu menu_lista_produtos;
    private javax.swing.JRadioButton rbCod;
    private javax.swing.JRadioButton rbProduto;
    private javax.swing.JTable tabela_lista_compra;
    private javax.swing.JTable tabela_lista_produtos;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfcpfcli;
    // End of variables declaration//GEN-END:variables
}

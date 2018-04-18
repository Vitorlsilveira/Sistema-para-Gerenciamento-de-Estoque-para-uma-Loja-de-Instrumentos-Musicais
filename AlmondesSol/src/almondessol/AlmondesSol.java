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
public class AlmondesSol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TelaCadastrar cadastrar = new TelaCadastrar();
        //cadastrar.setVisible(true);
        TelaListar listar = new TelaListar();
        listar.setVisible(true);
        TelaBuscar buscar = new TelaBuscar();
        buscar.setVisible(true);
    }
    
}

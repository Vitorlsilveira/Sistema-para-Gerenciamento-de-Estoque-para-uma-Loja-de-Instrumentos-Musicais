/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tom
 */
public class DAOProdutoTest {
    
    Produto p, edit;
    DAOProduto instance = new DAOProduto();
    
    
    public DAOProdutoTest() {
    }
    
    @Before
    public void setUp() {
        p = new Produto(222222, 4, "Violino", "Phender", "ECD00", "Violino asiatico Marron", 140);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class DAOProduto.
     */
    @Test
    public void testSavesemNome() {
        p.setNome("");
        boolean result = instance.save(p);
        assertFalse("Para se cadastrar um produto deve informar o nome!",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     @Test
    public void testSavesemMarca() {
        p.setMarca("");
        boolean result = instance.save(p);
        assertFalse("Para se cadastrar um produto deve informar a Marca!",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testSavesemModelo() {
        p.setModelo("");
        boolean result = instance.save(p);
        assertFalse("Para se cadastrar um produto deve informar o Modelo!",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testSavesemDeescricao() {
        p.setDecricao("");
        boolean result = instance.save(p);
        assertFalse("Para se cadastrar um produto deve informar a Descricao!",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testSaveqtdneg() {
        p.setQuant(-1);
        boolean result = instance.save(p);
        assertFalse("Para se cadastrar um produto deve informar o quantidade diferente de 0!",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
     @Test
    public void testSaveprco0() {
        p.setPreco(0);
        boolean result = instance.save(p);
        assertFalse("Para se cadastrar um produto deve informar o preco diferente de 0!",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSaveprconegativo(){
        p.setPreco(-1);
        boolean result = instance.save(p);
        assertFalse("Para se cadastrar um produto deve informar o preco maior que 0!",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testSave(){
        boolean result = instance.save(p);
        assertTrue("Com todas as infrmações completas o cadastro deve ser realisado!",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of update method, of class DAOProduto. boolean result = instance.update(p);
     */
    @Test
    public void testUpdateSemNome() {
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        edit.setNome("");
        boolean result = instance.update(edit);
        assertFalse("Para se alterar um produto deve informar o Nome",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSemMarca() {
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        edit.setMarca("");
        boolean result = instance.update(edit);
        assertFalse("Para se alterar um produto deve informar Marca",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSemModelo() {
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        edit.setModelo("");
        boolean result = instance.update(edit);
        assertFalse("Para se alterar um produto deve informar o Modelo",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateSemDescricao() {
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        edit.setDecricao("");
        boolean result = instance.update(edit);
        assertFalse("Para se alterar um produto deve informar a Descricao",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateqtdNegativo() {
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        edit.setQuant(-1);
        boolean result = instance.update(edit);
        assertFalse("Para se alterar um produto deve informar a Descricao",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testUpdateprecoNegativo() {
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        edit.setPreco(-1);
        boolean result = instance.update(edit);
        assertFalse("Para se alterar um produto deve informar a Descricao",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testUpdateqpreco0() {
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        edit.setPreco(0);
        boolean result = instance.update(edit);
        assertFalse("Para se alterar um produto deve informar a Descricao",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testUpdate() {
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        edit.setQuant(10);
        boolean result = instance.update(edit);
        assertTrue("Alteração deve acontecer Normalmente",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     /**
     * Test of verificarCodBarras method, of class DAOProduto.
     */
    @Test
    public void testVerificarCodBarrassemcode() {
        //System.out.println("verificarCodBarras");
        boolean result = instance.verificarCodBarras("0");
        assertFalse("Não aparecer codigo dentre os salvos!",result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testVerificarCodBarrascomcode() {
        //System.out.println("verificarCodBarras");
        boolean result = instance.verificarCodBarras("222222");
        assertTrue("Deve aparecer ser encotrado algum codigo dentre o banco!",result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verificacao method, of class DAOProduto.
     */
    @Test
    public void testVerificacao() {
        System.out.println("verificacao");
        Produto p = null;
        DAOProduto instance = new DAOProduto();
        boolean expResult = false;
        boolean result = instance.verificacao(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of delete method, of class DAOProduto.
     */
    @Test
    public void testDelete() {
        //System.out.println("delete");
        ArrayList<Produto> aux = instance.listar_por_cod(222222);
        edit = aux.get(0);
        boolean result = instance.delete(p);
        ///assertEquals(expResult, result);
        assertTrue("Alteração deve acontecer Normalmente",result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

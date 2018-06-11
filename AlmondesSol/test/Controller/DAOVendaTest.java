/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import Model.Venda;
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
public class DAOVendaTest {
     Venda v = null;
     DAOVenda instance = new DAOVenda();
     DAOProduto instanceprod = new DAOProduto();
     ArrayList<Produto> list;
    public DAOVendaTest() {
      
    }

    
    @Before
    public void setUp() {
        Produto p = new Produto(888888,20, "Tetse 1", "Marca Teste 1", "Modelo Teste 1", "Descicao Teste 1", 47);
        Produto p1 = new Produto(99999,10, "Tetse 1", "Marca Teste 1", "Modelo Teste 1", "Descicao Teste 1", 44);
        instanceprod.save(p);
        instanceprod.save(p1);
        
        Produto p3 = instanceprod.listar_por_cod(888888).get(0);
        Produto p2 = instanceprod.listar_por_cod(99999).get(0);
        list = new ArrayList();
        list.add(p2);
        list.add(p3);
        v = new Venda("055.335.047-97", "2018-07-07", 100, list);
    }
    
    @After
    public void tearDown() {
    
    
    }

    /**
     * Test of save method, of class DAOVenda.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Venda v = null;
        DAOVenda instance = new DAOVenda();
        boolean expResult = false;
        boolean result = instance.save(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveWhithCpf method, of class DAOVenda.
     */
    @Test
    public void testSaveWhithCpf() {
        System.out.println("saveWhithCpf");
        Venda v = null;
        DAOVenda instance = new DAOVenda();
        boolean expResult = false;
        boolean result = instance.saveWhithCpf(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listSave method, of class DAOVenda.
     */
    @Test
    public void testListSave() {
        System.out.println("listSave");
        ArrayList<Produto> shoping = null;
        DAOVenda instance = new DAOVenda();
        boolean expResult = false;
        boolean result = instance.listSave(shoping);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_todos method, of class DAOVenda.
     */
    @Test
    public void testListar_todos() {
        System.out.println("listar_todos");
        DAOVenda instance = new DAOVenda();
        ArrayList<Venda> expResult = null;
        ArrayList<Venda> result = instance.listar_todos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_por_data method, of class DAOVenda.
     */
    @Test
    public void testListar_por_data() {
        System.out.println("listar_por_data");
        String data = "";
        DAOVenda instance = new DAOVenda();
        ArrayList<Venda> expResult = null;
        ArrayList<Venda> result = instance.listar_por_data(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_por_cli method, of class DAOVenda.
     */
    @Test
    public void testListar_por_cli() {
        System.out.println("listar_por_cli");
        String cpf = "";
        DAOVenda instance = new DAOVenda();
        ArrayList<Venda> expResult = null;
        ArrayList<Venda> result = instance.listar_por_cli(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_por_cod method, of class DAOVenda.
     */
    @Test
    public void testListar_por_cod() {
        System.out.println("listar_por_cod");
        int code = 0;
        DAOVenda instance = new DAOVenda();
        ArrayList<Produto> expResult = null;
        ArrayList<Produto> result = instance.listar_por_cod(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DAOVenda.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Venda v = null;
        DAOVenda instance = new DAOVenda();
        boolean expResult = false;
        boolean result = instance.delete(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifica method, of class DAOVenda.
     */
    @Test
    public void testVerifica() {
        System.out.println("verifica");
        Venda v = null;
        DAOVenda instance = new DAOVenda();
        boolean expResult = false;
        boolean result = instance.verifica(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verivicaListaProd method, of class DAOVenda.
     */
    @Test
    public void testVerivicaListaProd() {
        System.out.println("verivicaListaProd");
        ArrayList<Produto> shoping = null;
        DAOVenda instance = new DAOVenda();
        boolean expResult = false;
        boolean result = instance.verivicaListaProd(shoping);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

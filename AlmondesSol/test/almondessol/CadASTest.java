/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almondessol;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomaz
 */
public class CadASTest {
    Instrumento i;
    CadAS cad;
    TelaCadastrar tcad;
    @Before
    public void setUp() {
        i = new Instrumento("Violão", "Fender","CD-60CE",  "Instrumento de Corda","Violão Preto com abertura Lateral", 2.8, 3);
    }
    

    @Test
    public void cadastroCompletotest() {
        cad = new CadAS(i);
        assertTrue("O texte deve funcionar sem Falhas", cad.cadastro());
    }
    
/*    
    @Test
    public void faltodeCampoNometest() {
        i.setNome("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter nome do instrumento", cad.cadastro());
    }
    
    @Test
    public void faltodeCampoMarcatest() {
        i.setMarca("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Marca do instrumento", cad.cadastro());
    }
    
    @Test
    public void faltodeCampoModelotest() {
        i.setModelo("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Modelo do instrumento", cad.cadastro());
    }
    
    @Test
    public void faltodeCampoTipotest() {
        i.setTipo("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Tipo do instrumento", cad.cadastro());
    }
    
    @Test
    public void faltodeCampoDesctest() {
        i.setDescricao("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Descricao do instrumento", cad.cadastro());
    }*/
    
    public void stringVaziaTest() {
        i.setNome("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Nome do instrumento", cad.cadastro());
        
        i.setMarca("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Marca do instrumento", cad.cadastro());
        
        i.setModelo("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Modelo do instrumento", cad.cadastro());
        
        i.setDescricao("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Descricao do instrumento", cad.cadastro());
        
        i.setTipo("");
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Tipo do instrumento", cad.cadastro());
        
        i.setPreco(Double.valueOf("2.6"));
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Preço do instrumento", cad.cadastro());
        
        i.setQuant(Integer.valueOf("1"));
        cad = new CadAS(i);
        assertFalse("O cadastro de Instrumentos deve ter Quantidade do instrumento", cad.cadastro());
    }
    
    @Test
    public void numeroEmCampoDeLetrasTest(){
        i.setNome("e");
        cad = new CadAS(i);
        assertFalse("Não é permitido número neste tipo de campo",tcad.letrasEmCampoDeNumero(i.getNome()));
    }
    
    @Test
    public void precoNegativoTest() {
        i.setPreco(-1.8);
        cad = new CadAS(i);
        assertFalse("O preco não pode ser Negativo", cad.cadastro());
    }
    
    @Test
    public void precoZeroTest() {
        i.setPreco(0);
        cad = new CadAS(i);
        assertFalse("O preco não pode ser Negativo", cad.cadastro());
    }
    
    @Test
    public void quantNegativoTest() {
        i.setPreco(-1.8);
        cad = new CadAS(i);
        assertFalse("O preco não pode ser Negativo", cad.cadastro());
    }
    
    
}

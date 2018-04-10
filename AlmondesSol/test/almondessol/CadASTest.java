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
    @Before
    public void setUp() {
        i = new Instrumento("Violão", "Fender","CD-60CE",  "Instrumento de Corda","Violão Preto com abertura Lateral", 2.8, 3);
    }
    

    @Test
    public void cadastroCompletotest() {
        cad = new CadAS(i);
        assertTrue("O texte deve fuincionar sem Falhas", cad.cadastro());
    }
    
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
    }
    
    
    @Test
    public void precoNegativotest() {
        i.setPreco(-1.8);
        cad = new CadAS(i);
        assertFalse("O preco não pode ser Negativo", cad.cadastro());
    }
    
    @Test
    public void precoZerotest() {
        i.setPreco(0);
        cad = new CadAS(i);
        assertFalse("O preco não pode ser Negativo", cad.cadastro());
    }
    
    @Test
    public void quantNegativotest() {
        i.setPreco(-1.8);
        cad = new CadAS(i);
        assertFalse("O preco não pode ser Negativo", cad.cadastro());
    }
}

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
public class CadAS {
    Instrumento i;
    
    public CadAS(Instrumento i) {
        this.i= i;
    }

    public boolean cadastro(){
        boolean isvalid;
        isvalid = this.campoVasio()||this.erroPreco()||this.erroQuant();
        if(isvalid){
            //erros de cadastro algum campo invalido!
            return false;
        }else{
            // executar o cadastro de valores no banco de dados!
            return true;
        }
    }
    public boolean campoVasio(){
        return (i.getNome().isEmpty()||i.getMarca().isEmpty()||i.getDescricao().isEmpty()||i.getModelo().isEmpty()||i.getTipo().isEmpty());
    }
    
    public boolean erroPreco(){
        if(i.getPreco()<=0){
            return true;
        }else{
            return false;
        }
    }

    public boolean erroQuant(){
        if(i.getQuant()<0){
            return true;
        }else{
            return false;
        }
    }

}

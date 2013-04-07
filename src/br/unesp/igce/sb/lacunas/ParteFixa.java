/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.sb.lacunas;

import br.unesp.igce.sb.lacunas.ParteDeExpressao;

/**
 * parte de uma expressao geradora que gera sempre a mesma string.
 * 
 * @author orlando
 */
public class ParteFixa implements ParteDeExpressao {
    private String texto;
    
    public ParteFixa(String texto) {
        this.texto = texto;
    }
    
    @Override
    public String gerar() {
        return texto;
    }

}

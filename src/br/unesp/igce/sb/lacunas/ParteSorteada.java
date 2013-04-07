/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.sb.lacunas;

import java.util.Random;

/**
 * parte de uma expressao geradora que e' sorteada aleatoriamente.
 * 
 * e' construida com um conjunto de valores do qual o resultado e' sorteado.
 * 
 * @author orlando
 */
public class ParteSorteada implements ParteDeExpressao {
    private String[] roleta;
    
    public ParteSorteada(String[] valores) {
        roleta = valores;
    }
    
    @Override
    public String gerar(){
        Random g = new Random();
        int sorteio = g.nextInt(roleta.length);
        return roleta[sorteio];
    }

}

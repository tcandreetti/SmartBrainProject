/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.sb.lacunas;



/**
 *gera uma nota rápida ficticia a fim de testar o programa.
 * @author Thais
 */
public class GeradorDeNotasAleatorias {
    static private String[] prefixos = {
       "A computação",
       "O corpo humano",
       "Nossos ossos",
       "Vigotsky",
       "Karl Marx",
       "O guia"
    };

    static private String[] radicais = {
       "do mochileiro",
       "expandiu a ideia",
       "é conhecido",
       "possui",
       "nasceu em",
       "se desenvolveu",
       "e Frederich",
       "tem 6",
       "são"
    };
    
    static private String[] sufixos = {
        " demais",
        " 1900",
        " livros",
        " absurdos",
        " exemplares"
          
    };
    
    static private String[] adjetivos = {
        " Incriveis",
        " Solícitos",
        " Bárbaros",
        " Gigantes",
        " Nuclear",
        " Relativista",
        " Moderna"
    };
    
    /**
     * @return [prefixo +]  radical [+ sufixo] [+ adjetivo]
     */
    static public String prox () {
        
        ExpressaoGeradora exp0 = new ExpressaoGeradora(5);
        exp0.colar(new ParteSorteada(prefixos));
        exp0.colar(new ParteSorteada(radicais));
        exp0.colar(new ParteFixa("a"));
              
        ExpressaoGeradora exp1 = new ExpressaoGeradora(2);
        exp1.colar(new ParteSorteada(radicais));
        exp1.colar(new ParteFixa("a"));
        
        ExpressaoGeradora exp2 = new ExpressaoGeradora(6);
        exp2.colar(new ParteSorteada(radicais));
        exp2.colar(new ParteSorteada(sufixos));
        
        ExpressaoGeradora[] p1 = {exp0, exp1, exp2};
        Gerador g1 = new Gerador(p1);
        String parte1 = g1.prox();
        parte1 = parte1.substring(0, 1).toUpperCase() + 
                parte1.substring(1, parte1.length());
        
        ExpressaoGeradora exp3 = new ExpressaoGeradora(2);
        exp3.colar(new ParteFixa(""));
        
        ExpressaoGeradora exp4 = new ExpressaoGeradora(3);
        exp4.colar(new ParteSorteada(adjetivos));
        
        ExpressaoGeradora[] p2 = {exp3, exp4};
        Gerador g2 = new Gerador(p2);
        
        return parte1 + g2.prox();
    }
    
}

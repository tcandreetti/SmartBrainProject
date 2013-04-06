/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author aluno
 */
public class Nota {
    
    private String categoria;
    private int tempo;
    private int quantidade;
    private String conteudo;
    private String gruposCategoria[];
    private String gruposConteudo[];
    private int contadorCat;


Nota (String categoria, int tempo,int quantidade, String conteudo )
{
    this.categoria=categoria;
    this.tempo=tempo;
    this.quantidade=quantidade;
    this.conteudo=conteudo;
    AgrupaCategoria(categoria,conteudo);
    contadorCat++;
         
}

public void AgrupaCategoria(String categoria, String conteudo)
{
    gruposCategoria[contadorCat]= categoria;
    gruposConteudo[contadorCat]= conteudo;
  
}
int CalculaFrequencia(int tempo, int quantidade)
{
    return tempo/quantidade;
}

    public static void main(String[] args) {
        
        Nota n1 = new Nota("Cálculo",20,5,"O calculo da hipotenusa é cateto um ao quadrado + cateto dois a quadrado é igual a hipotenusa.");
        
    }


}


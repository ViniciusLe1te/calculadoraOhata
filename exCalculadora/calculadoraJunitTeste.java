import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * @author Vinicius Leite
 * @version 1.0
 * @since release 1.0 da  aplicacao
 */

public class calculadoraJunitTeste {
    //cenarios de teste com somas 
    @Test
    public void testeSomas() {
        soma som = new soma();     
        int teste;
        //parametros a serem usados nos testes

        //Cenario de teste 1: teste de dois valores
        teste = som.somar(3, 7);
        //modelo de comparativo de teste
        assertEquals(10, teste);
        //Cenario de teste 2: teste de dois valores sendo um zero
        teste = som.somar(3, 0);
        assertEquals(3, teste);
        //Cenario de teste 3: teste de dois valores sendo que ambos são zeros
        teste = som.somar(0, 0);
        assertEquals(0, teste);
        //Cenario de teste 4: teste de dois valores sendo um negativo 
        teste = som.somar(3, -1);
        assertEquals(2, teste);   
    }

    //cenarios de teste com subtracoes 
    @Test
    public void testeSubtracoes(){
        subtracao sub = new subtracao();
        int teste;
        //parametros a serem usados nos testes

        //cenario de teste 5: teste de dois valores
        teste = sub.subtrair(3, 7);
        assertEquals(-4, teste);
        //cenario de teste 6: teste de dois valores sendo um zero
        teste = sub.subtrair(3, 0);
        assertEquals(3,teste);
        //cenario de teste 7: teste de dois valores sendo que ambos são zeros
        teste = sub.subtrair(0, 0);
        assertEquals(0,teste);
        //cenario de teste 8: teste de dois valores sendo um negativo
        teste = sub.subtrair(3, -1);
        assertEquals(4,teste);
    }

    //cenarios de teste com multiplicacoes 
    @Test
    public void testesMultiplicacao(){
        multiplicacao mult = new multiplicacao();
        Object teste;
        //parametros a serem usados nos testes

        //cenario de teste 9: teste de dois valores
        teste = mult.multiplicar(3,7);
        assertEquals("21",teste);
        //cenario de teste 10: teste de dois valores sendo um zero
        teste = mult.multiplicar(3, 0);
        assertEquals("0",teste);
        //cenario de teste 11: teste de dois valores sendo que ambos são zeros
        teste = mult.multiplicar(0, 0);
        assertEquals("0",teste);
        //cenario de teste 12: teste de dois valores sendo um negativo
        teste = mult.multiplicar(3, -1);
        assertEquals("-3",teste);
    }

    //cenarios de teste com divisoes
    @Test
    public void testesDivisao(){
        divisao div = new divisao();
        Object teste;
        //parametros a serem usados nos testes

        //cenario de teste 13: teste de dois valores
        teste = div.dividir(7, 3);
        assertEquals("2,33", teste);
        //cenario de teste 14: teste de dois valores sendo um zero
        teste = div.dividir(3, 0);
        assertEquals("é impossivel dividir por 0", teste);
        //cenario de teste 15: teste de dois valores sendo que ambos são zeros
        teste = div.dividir(0, 0);
        assertEquals("é impossivel dividir por 0", teste);
        //cenario de teste 16: teste de dois valores sendo um negativo
        teste = div.dividir(4, -2);
        assertEquals("-2", teste);
    }
}
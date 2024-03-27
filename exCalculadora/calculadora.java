/*
 * @author Vinicius Leite
 * @version 1.1
 * @since release 1.1 da  aplicacao
 */

public class calculadora{
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        soma som = new soma();
        //parametros a serem utilizados para testes com operacoes de soma

        subtracao sub = new subtracao();
        //parametros a serem utilizados para testes com operacoes de subtracao

        multiplicacao mult = new multiplicacao();
        //parametros a serem utilizados para testes com operacoes de multiplicacao

        divisao div = new divisao();
        //parametros a serem utilizados para testes com operacoes de divisao

        int teste;
        Object testeb, testec;
        //parametros auxiliares

        System.out.println("\n testes com soma");
        //Cenario de teste 1: teste de dois valores
        teste = som.somar(3, 7);
        System.out.println(teste);
        //Nesse cenario espera-se o valor 10

        //Cenario de teste 2: teste de dois valores sendo um zero
        teste = som.somar(3, 0);
        System.out.println(teste);
        //Nesse cenario espera-se o valor 3

        //Cenario de teste 3: teste de dois valores sendo que ambos são zeros
        teste = som.somar(0, 0);
        System.out.println(teste);
        //Nesse cenario espera-se o valor 0

        //Cenario de teste 4: teste de dois valores sendo um negativo 
        teste = som.somar(3, -1);
        System.out.println(teste);
        //Nesse cenario espera-se o valor 2

        System.out.println("\n testes com subtração");
        //cenario de teste 5: teste de dois valores
        teste = sub.subtrair(3, 7);
        System.out.println(teste);
        //Nesse cenario espera-se o valor -4

        //cenario de teste 6: teste de dois valores sendo um zero
        teste = sub.subtrair(3, 0);
        System.out.println(teste);
        //Nesse cenario espera-se o valor 3

        //cenario de teste 7: teste de dois valores sendo que ambos são zeros
        teste = sub.subtrair(0, 0);
        System.out.println(teste);
        //Nesse cenario espera-se o valor 0

        //cenario de teste 8: teste de dois valores sendo um negativo
        teste = sub.subtrair(3, -1);
        System.out.println(teste);
        //Nesse cenario espera-se o valor 4

        System.out.println("\n testes com multiplicação");
        //cenario de teste 9: teste de dois valores
        testeb = mult.multiplicar(3,7);
        System.out.println(testeb);
        //Nesse cenario espera-se o valor 21

        //cenario de teste 10: teste de dois valores sendo um zero
        testeb = mult.multiplicar(3, 0);
        System.out.println(testeb);
        //Nesse cenario espera-se o valor 0

        //cenario de teste 11: teste de dois valores sendo que ambos são zeros
        testeb = mult.multiplicar(0, 0);
        System.out.println(testeb);
        //Nesse cenario espera-se o valor 0

        //cenario de teste 12: teste de dois valores sendo um negativo
        testeb = mult.multiplicar(3, -1);
        System.out.println(testeb);
        //Nesse cenario espera-se o valor -3

        System.out.println("\n testes com divisão");
        //cenario de teste 13: teste de dois valores
        testec = div.dividir(7, 3);
        System.out.println(testec);
        //Nesse cenario espera-se o valor 2,33

        //cenario de teste 14: teste de dois valores sendo um zero
        testec = div.dividir(3, 0);
        System.out.println(testec);
        //Nesse cenario espera-se a mensagem "é impossivel dividir por 0"
        
        //cenario de teste 15: teste de dois valores sendo que ambos são zeros
        testec = div.dividir(0, 0);
        System.out.println(testec);
        //Nesse cenario espera-se a mensagem "é impossivel dividir por 0"

        //cenario de teste 16: teste de dois valores sendo um negativo
        testec = div.dividir(4, -2);
        System.out.println(testec);
        //Nesse cenario espera-se o valor -2
    }
    
}
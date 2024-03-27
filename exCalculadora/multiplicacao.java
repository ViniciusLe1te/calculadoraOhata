import java.text.DecimalFormat;
/*
 * @author Vinicius Leite
 * @version 1.0
 * @since release 1.0 da  aplicacao
 */
public class multiplicacao {
    
    /** 
     * @param a , primeiro valor a ser utilizado para soma
     * @param b , segundo valor a ser utilizado para soma
     * @return Object , resultado de retorno
     */

    public Object multiplicar (double a, double b){
        // TODO Auto-generated method stub
        double resultado = (double) a * b;
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(resultado);
    }
}

import java.text.DecimalFormat;
/*
 * @author Vinicius Leite
 * @version 1.0
 * @since release 1.0 da  aplicacao
 */
public class divisao {
    
    /** 
     * @param a , primeiro valor a ser utilizado para soma
     * @param b , segundo valor a ser utilizado para soma
     * @return Object , resultado de retorno
     */
    public Object dividir(int a, int b){
        // TODO Auto-generated method stub
        if(a != 0 && b != 0){
            double resultado = (double) a / b;
            DecimalFormat df = new DecimalFormat("#.##");
            return df.format(resultado);
        }else{
            return "é impossivel dividir por 0";
        }
    } 
}

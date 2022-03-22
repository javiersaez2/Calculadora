package operaciones;
/**
 * Operaciones ralizadas del programa calculadora
 * 
 * @author Javier
 *  * @version 11.03.2022
 *
 */
public class Operaciones {
/**
 * 
 * @param valor1: Operando 1
 * @param valor2: Operando 2
 * @return: Devuelve el resultado de la suma entre los dos valores
 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
  /**
   * 
   * @param valor1: Operando 1
   * @param valor2: Operando 2
   * @return: Devuelve el resultado de la resta entre los dos valores
   */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
   /**
    * 
    * @param valor1: Operando 1
    * @param valor2: Operando 2
    * @return: Devuelve el resultado de la multiplicación entre los dos valores
    */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
/**
 * 
 * @param valor1: Operando 1
 * @param valor2: Operando 2
 * @return Devuelve el resultado de la division entre los dos valores
 * @throws ArithmeticException contemplamos la division entre 0 no de error
 */
    public int dividir (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
   /**
    * 
    * @param valor1: Operando 1
    * @param valor2: Operando 2
    * @return  Devuelve el resultado del resto entre los dos valores
    * @throws ArithmeticException contemplamos que el resto entre 0 no de error
    */
    public int resto (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}
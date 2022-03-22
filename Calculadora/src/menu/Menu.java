package menu;
import java.util.Scanner;
/**
 * Menu de la calculadora
 * 
 * @author Javier
 * @version 11.03.2022
 * 
 */

public class Menu {
    private static Scanner teclado = new Scanner(System.in) ;
    /**
     * 
     * @return Devuelve el array
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
 /**
  * 
  * @return Devuelve el signo escrito por tecladao para hacer la operacion adeacuada
  */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    /**
     * 
     * @return Devuelve un booleanao true, cuando la respuesta sea igual a "s" para que la calculadora continue ejecutandose
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    
    }
}
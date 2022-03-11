package principal;
import menu.Menu;
import operaciones.Operaciones;
/**
 * Muestra por pantalla el resultado de las operaciones
 * 
 * @author Javier
 * @version 11.09.2022
 *
 */
public class Calculadora{
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];

        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
   
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
          try {
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operaci�n no v�lida");
            }}
            catch(ArithmeticException e) {
          	  System.out.println ("Operaci�n aritmetica no v�lida" + e.getMessage());
          }
        }         
           while (menu.repetir());
    }
}
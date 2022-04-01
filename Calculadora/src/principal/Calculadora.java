package principal;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import logs.FiltroSoloMultiplicaciones;
import logs.FormatoHTML;
import logs.LogConsolaMasFichero;
import menu.Menu;
import operaciones.Operaciones;
/**
 * Muestra por pantalla el resultado de las operaciones
 * 
 * @author Javier
 * @version 22.03.2022
 *
 */
public class Calculadora{
	private static final LogManager logManager = LogManager.getLogManager();
	private static final Logger LOGGER = Logger.getLogger("confLogger");
	public static int resultado;

	   	static {
	   		try {
	   			logManager.readConfiguration(new FileInputStream("src/logs/configLog.properties"));
	   		} catch (IOException exception) {
	   			LOGGER.log(Level.SEVERE, "Error al cargar la configuración", exception);
	   		}
	   	}
   public static void main(String[] args) {   
 
       String operacion = "";
       int[] operandos = new int [2];
       
     

       //configurarlog();
       
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
               System.out.println ("Operación no válida");
           }
           LOGGER.log(Level.FINE, " | Operación: | " + operacion + " | operando 1: | " + operandos[0] + " | 55 operando 2: | " + operandos[1] + " | Resultado: | " + resultado );
        
           }catch(ArithmeticException e){
           System.out.println("Operación aritmética no válida: " + e.getMessage());
           LOGGER.log(Level.WARNING, "Error! División y resto entre cero no valido.");

           }
       }   while (menu.repetir());
   }
  /*
   public static void configurarlog() {
	   LOGGER.setUseParentHandlers(false);
	   
       Handler fileHandler = null;
       Handler consoleHandler = new ConsoleHandler();
       LOGGER.addHandler(consoleHandler);
       
       try {
       fileHandler  = new FileHandler("./src/logs/operaciones.html");
       
	    }catch(IOException exception){
	        LOGGER.log(Level.SEVERE, "Ocurrió un error en FileHandler.", exception);
	    }
       fileHandler.setFormatter(new FormatoHTML());
   
       LOGGER.addHandler(fileHandler);
       

       consoleHandler.setLevel(Level.WARNING); 
       fileHandler.setLevel(Level.FINE);
       
       fileHandler.setFilter(new FiltroSoloMultiplicaciones());
       LOGGER.setLevel(Level.FINE);
             
   }*/
}
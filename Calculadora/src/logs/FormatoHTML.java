package logs;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import principal.Calculadora;

public class FormatoHTML extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		String [] array = record.getMessage().split("\\|");
		return "<tr>"
				+ "<td>"+ array[array.length-7]+"</td>"
				+ "<td>"+ array[array.length-5]+"</td> "
				+ "<td>"+ array[array.length-3]+"</td> "
				+ "<td>"+ array[array.length-1]+"</td> "
				+ "</tr>";
	}
@Override
public String getHead(Handler h) {
	return "<HTML> \n  <head> \n <link rel='stylesheet' href='style.css'> </head> <BODY> <table> "
			+ "<tr>" 
			+ "<th>"+ "Operacion" + "</th>"
			+ "<th>"+ "Operando 1" + "</th> "
			+ "<th>"+ "Operando 2" + "</th>"
			+ "<th>"+ "Resultado" + "</th>";
	
}

@Override
public String getTail(Handler h) {
	return  "</HTML> \n  </tr></table> </BODY>";
	
}
}

package logs;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

import principal.Calculadora;

public class FiltroLogNulo implements Filter {

	@Override
	public boolean isLoggable(LogRecord record) {
		// TODO Auto-generated method stub
		boolean guardarLog= false;
		String[] array = record.getMessage().split(" ");
		int numero = Integer.parseInt(array[array.length-1]);
		if (numero == 0) {
		if (array[array.length-1].contains("0")){
				guardarLog = true;
		}}
	
		return guardarLog;
	}

}

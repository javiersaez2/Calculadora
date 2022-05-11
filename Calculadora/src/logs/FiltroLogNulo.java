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
		String numero = (array[array.length-1]);
		if (array[array.length-1].equals("0")){
				guardarLog = true;
		}
	
		return guardarLog;
	}

}

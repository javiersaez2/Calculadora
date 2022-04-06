package logs;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

import principal.Calculadora;

public class FiltroLogNulo implements Filter {

	@Override
	public boolean isLoggable(LogRecord record) {
		// TODO Auto-generated method stub
		boolean guardarLog= false;
		
		if ( record.getMessage() != null && Calculadora.resultado == 0) {
				guardarLog = true;
				}
	
		return guardarLog;
	}

}

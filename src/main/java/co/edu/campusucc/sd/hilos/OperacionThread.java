package co.edu.campusucc.sd.hilos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperacionThread extends Thread {

	private static Logger log = LoggerFactory.getLogger(OperacionThread.class);
	
	private String idHilo;
	private Operacion operacion;
	private int repeticiones;

	public OperacionThread(String idHilo, Operacion operacion, int repeticiones) {
		super();
		this.idHilo = idHilo;
		this.operacion = operacion;
		this.repeticiones = repeticiones;
	}

	@Override
	public void run() {
		log.info("HILO: "+idHilo+" - "+operacion);
		operacion.ejecutarOperacion(repeticiones);
	}	
}

package co.edu.campusucc.sd.hilos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import co.edu.campusucc.sd.cliente.rest.modelo.ResultadoMatematico;
import co.edu.campusucc.sd.cliente.rest.services.ClienteCalculadora;
import co.edu.campusucc.sd.cliente.rest.services.ClienteCalculadoraImpl;

@Component
public class Operacion  {
	private static Logger log = LoggerFactory.getLogger(Operacion.class);
	
	private String op;
	private Long numx;
	private Long numy;
	
	private Long incremento;
	private Long esperaMilisegundos;
	
	private ClienteCalculadora clienteCalculadora = new ClienteCalculadoraImpl();
	
	public Operacion() {}

	public Operacion(String op, Long numx, Long numy, Long incremento, Long esperaMilisegundos) {
		this.op = op;
		this.numx = numx;
		this.numy = numy;
		this.incremento = incremento;
		this.esperaMilisegundos = esperaMilisegundos;
	}

	
	public void ejecutarOperacion(int cantidaRepeticiones) {
		ResultadoMatematico r ;
		
		log.info("Inicio Operacion"+this.op);
		for (int i = 0; i < cantidaRepeticiones; i++) {
			try {
				
				r = new ResultadoMatematico();
				r = clienteCalculadora.operacion(op, numx, numy);
				log.info(r.toString());
			} catch (Exception e) {
				log.error(this.op+" Excepcion: "+e.getMessage());
			}
			
			esperar();
		}
		log.info("Fin Operacion"+this.op);
	}

	public void esperar() {
		try {
			Thread.sleep(this.esperaMilisegundos);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Long getNumx() {
		return numx;
	}

	public void setNumx(Long numx) {
		this.numx = numx;
	}

	public Long getNumy() {
		return numy;
	}

	public void setNumy(Long numy) {
		this.numy = numy;
	}

	public Long getIncremento() {
		return incremento;
	}

	public void setIncremento(Long incremento) {
		this.incremento = incremento;
	}

	public Long getEsperaMilisegundos() {
		return esperaMilisegundos;
	}

	public void setEsperaMilisegundos(Long esperaMilisegundos) {
		this.esperaMilisegundos = esperaMilisegundos;
	}

	@Override
	public String toString() {
		return "Operacion [op=" + op + ", numx=" + numx + ", numy=" + numy + ", incremento=" + incremento
				+ ", esperaMilisegundos=" + esperaMilisegundos + ", clienteServices=" + clienteCalculadora + "]";
	}
	
	

}

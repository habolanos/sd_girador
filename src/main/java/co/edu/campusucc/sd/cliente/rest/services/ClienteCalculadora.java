package co.edu.campusucc.sd.cliente.rest.services;

import co.edu.campusucc.sd.cliente.rest.modelo.ResultadoMatematico;

public interface ClienteCalculadora {
	public ResultadoMatematico operacion(String op, Long numx, Long numy);
}

package co.edu.campusucc.sd.cliente.rest.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.edu.campusucc.sd.cliente.rest.modelo.ResultadoMatematico;

@Service
public class ClienteCalculadoraImpl implements ClienteCalculadora {

	private RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public ResultadoMatematico operacion(String op, Long numx, Long numy) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("op", op);
		pathVariables.put("numx", numx.toString());
		pathVariables.put("numy", numy.toString());
		
		ResultadoMatematico resultado = restTemplate.getForObject("http://localhost:9000/calculadora/{op}/numx/{numx}/numy/{numy}", ResultadoMatematico.class, pathVariables);
		return resultado;
	}

}

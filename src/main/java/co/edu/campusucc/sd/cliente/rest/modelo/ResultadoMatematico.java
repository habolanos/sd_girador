package co.edu.campusucc.sd.cliente.rest.modelo;

public class ResultadoMatematico {
	public ResultadoMatematico() {
	}

	public ResultadoMatematico(Long numX, Long numy, Long resultado, String op) {
		this.numX = numX;
		this.numy = numy;
		this.resultado = resultado;
		this.op = op;
	}

	private Long numX;
	private Long numy;
	private Long resultado;
	private String op;

	public Long getNumX() {
		return numX;
	}

	public void setNumX(Long numX) {
		this.numX = numX;
	}

	public Long getNumy() {
		return numy;
	}

	public void setNumy(Long numy) {
		this.numy = numy;
	}

	public Long getResultado() {
		return resultado;
	}

	public void setResultado(Long resultado) {
		this.resultado = resultado;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	@Override
	public String toString() {
		return "ResultadoMatematico [numX=" + numX + ", numy=" + numy + ", resultado=" + resultado + ", op=" + op + "]";
	}

}

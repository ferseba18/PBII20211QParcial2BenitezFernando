package ar.edu.unlam.pb2;

public class Venta {
	private Integer dniDelComprador;
	private String nombreDelComprador;
	private Double Importe;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		super();
		this.nombreDelComprador=nombreDelComprador;
		this.dniDelComprador=dniDelComprador;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}

	public Integer getDniDelComprador() {
		return dniDelComprador;
	}

	public void setDniDelComprador(Integer dniDelComprador) {
		this.dniDelComprador = dniDelComprador;
	}

	public Double getImporte() {
		return Importe;
	}

	public void setImporte(Double importe) {
		Importe = importe;
	}



}

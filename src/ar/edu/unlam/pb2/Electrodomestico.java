package ar.edu.unlam.pb2;

public class Electrodomestico extends Producto{
	private Boolean garantia;
	private Integer mesesgarantia;
	
	public Electrodomestico(Integer codigo, String name, String marca, Double precio, Boolean garantia,
			Integer mesesgarantia) {
		super(codigo, name, marca, precio);
		this.garantia = garantia;
		this.mesesgarantia = mesesgarantia;
	}
	public Boolean getGarantia() {
		return garantia;
	}
	public void setGarantia(Boolean garantia) {
		this.garantia = garantia;
	}
	public Integer getMesesgarantia() {
		return mesesgarantia;
	}
	public void setMesesgarantia(Integer mesesgarantia) {
		this.mesesgarantia = mesesgarantia;
	}
	


}

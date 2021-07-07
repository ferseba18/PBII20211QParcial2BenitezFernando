package ar.edu.unlam.pb2;

public class Comestible extends Producto{
private Integer elaboracion;
private Integer vencimiento;


public Comestible(Integer codigo, String name,Integer elaboracion, Integer vencimiento, String marca, Double precio) {
	super(codigo, name, marca, precio);
	this.elaboracion = elaboracion;
	this.vencimiento = vencimiento;
}
public Integer getFechaDeElaboracion() {
	return elaboracion;
}
public void setElaboracion(Integer elaboracion) {
	this.elaboracion = elaboracion;
}
public Integer getFechaDeVencimiento() {
	return vencimiento;
}
public void setVencimiento(Integer vencimiento) {
	this.vencimiento = vencimiento;
}

}

package ar.edu.unlam.pb2;

public class ProductoSinStock extends Exception {
	
	public ProductoSinStockException(String mensaje) {
		super("No queda stock del producto");
	}
}

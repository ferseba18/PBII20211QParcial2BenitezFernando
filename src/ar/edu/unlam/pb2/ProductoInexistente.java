package ar.edu.unlam.pb2;

public class ProductoInexistente extends Exception {
	
public ProductoInexistenteException(String mensaje) {
		super("El producto no existe");
	}
}

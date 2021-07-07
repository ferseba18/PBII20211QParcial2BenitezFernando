package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	private Map<Integer,Integer>carrito;
	public Supermercado(String nombre) {
		// Constructor de la clase
	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto
		Integer cantidad=0;
        for (Producto producto : productosExistentes)
        {
          if (!!producto.equals(nuevo))
        	  cantidad++;
              nuevo.setCantidadstock(cantidad);
        }
		this.productosExistentes.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		
		return productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		Integer cantidad = 0;
        for (Producto producto : productosExistentes)
        {
          if (producto.getCodigo().equals(codigo))
              cantidad++;
        }
		return cantidad;
		// Devuelve la cantidad de unidades de un producto determinado
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		// Verifica si un producto existe
		Boolean existencia = null;
				for (Producto producto : productosExistentes) {
			        if (producto.getCodigo().equals(codigoDeProducto)) {
			            existencia= true;
			        }
			        else {
			        	throw new ProductoInexistente();
			        }
				} 
			return existencia;
		}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		Producto productoPC=null;

			for (Producto producto : productosExistentes) {
		        if (producto.getCodigo().equals(codigoDeProducto)) {
		            productoPC=producto;
		        }
		        else {
		        	throw new ProductoSinStock();
		        }
		}
			
		return productoPC;
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en función de su número identificatorio
		return this.ventasRealizadas.get(nueroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		Integer ventas=null;
		Integer producto1=null;
		for (Producto producto : productosExistentes) {
	        if (producto.getCodigo().equals(codigoDeProducto)) {
	           producto1=codigoDeProducto; 
	        }
	        else {
	        	throw new ProductoInexistente();
	        }
	        for (Producto productoA : productosDisponibles) {
		        if (producto.getCantidadstock().equals(numeroDeVenta)) {
		            ventas=numeroDeVenta;
		        }
		        else {
		        	throw new ProductoSinStock();
		        }
	}
	        
}
		carrito=new HashMap(numeroDeVenta,codigoDeProducto);
		}

	public Map<Integer,Integer> getCarrito() {
		return carrito;
	}

	public void setCarrito(Map<Integer,Integer> carrito) {
		this.carrito = carrito;
	}
	
	}

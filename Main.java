package listas;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Producto producto = new Producto(1,"cactus");
		Producto producto2 = new Producto(2,"flor");
		
		LinkedList<Producto> productos = new LinkedList<Producto>();
		
		productos.add(producto);
		productos.add(0,producto2);
		
		String aux = "cactus";
		
		if (productos.contains(producto)) {
			System.out.println("la lista contiene a "+producto);
		} else {
			System.out.println("la lista no contiene el elemento buscado");
		}
		

	}
	public static void imprimir(LinkedList<Producto> productos) {
		if (productos.isEmpty()) {
			System.out.println("la lista se encuentra vacia");
		} else {
			for(Producto producto:productos)//foreach
				System.out.println(producto.getNombre()+" - ");
			System.out.println();
		}
	}
	
	public static void Borrar(LinkedList<Producto> productos,String nombre) {
		if (productos.isEmpty()) {
			System.out.println("la lista se encuentra vacia");
		} else {
		for(Producto producto: productos)
			if(producto.getNombre().equals(nombre)) {
				System.out.println("removio el elemento: "+producto.getNombre());
				productos.remove(productos.indexOf(producto));
			}
				
		}
	}
}



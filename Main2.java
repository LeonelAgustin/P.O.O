

import java.util.LinkedList;

public class Main2 {

	public static void main(String[] args) {
		Producto producto = new Producto(1,"cactus");
		Producto producto2 = new Producto(2,"flor");
		
		LinkedList<Producto> productos = new LinkedList<Producto>();
		
		productos.add(producto);
		productos.add(producto2);
		/*
		String aux = "cactus";
		
		if (productos.contains(producto)) {
			System.out.println("la lista contiene a "+producto);
		} else {
			System.out.println("la lista no contiene el elemento buscado");
		}*/
		imprimir(productos);
		cambiarElemento(productos, producto2,0);
		imprimir(productos);

	}
	public static void imprimir(LinkedList<Producto> productos) {
		if (productos.isEmpty()) {
			System.out.println("la lista se encuentra vacia");
		} else {
			for(Producto producto:productos)//foreach
				System.out.print(producto.getNombre()+" - ");
		}
		System.out.println("");
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
	
	public static void cambiarElemento(LinkedList<Producto> productos, Producto producto, int indice){
		if (productos.isEmpty()) {
			System.out.println("la lista se enuentra vacia");
		} else {
			productos.set(indice, producto);
		}
	}
}



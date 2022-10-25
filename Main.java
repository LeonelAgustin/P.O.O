import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Libros libro = new Libros(1,"12 reglas para vivir");
		Libros libro2 = new Libros(2,"Clean code");
		
		LinkedList<Libros> libreria = new LinkedList<Libros>();
		imprimir(libreria);
		
		libreria.add(libro);
		libreria.add(0,libro2);
		
		LinkedList<String> autores = new LinkedList<String>();

		
		imprimir(libreria);
		
		for (Libros libros : libreria) {
			autores.add(libros.getNombre());
		}
		
		
		String aux =  "Clean code";
		
		if(autores.contains(aux)){
			System.out.println("La lista contiene " + aux );
		}else{
			System.out.println("No contiene el elemnto buscado");
		}
		
		
		
		System.out.println("La liberia tiene: "+libreria.size()+ " libros");
	
		//Borrar(libreria,"Clean code");
		
		
		Libros libro3 = new Libros(3,"Gaturro");
		CambiarElemento(libreria,libro3,1);
		
		imprimir(libreria);
		
		System.out.println("La liberia tiene: "+libreria.size()+ " libros");
		
	
	/*
	        List<String> list = Arrays.asList("RED","BLUE","BLACK","GREEN","BROWN");
	 
	        // Java 7 y anteriores:
	 
	        // crea una lista vacía
	        List<String> filteredList = new ArrayList<>();
	 
	        // iterar a través de la lista
	        for (String entry: list)
	        {
	            // filtrar valores que comienzan con `B`
	            if (entry.startsWith("B")) {
	                filteredList.add(entry);
	            }
	        }
	 
	        System.out.println(filteredList);
	 */
	}
	
	public static void imprimir(LinkedList<Libros> lista) {
			
			if(lista.isEmpty()) {
				System.out.println("La lista se encuentra vacía");
			}else {
		    for (Libros elemento : lista)
		        System.out.print(elemento.getNombre() + " - ");
		    System.out.println();
			}
	}
	
	public static void BuscarxNombre(LinkedList<Libros> lista,String nombre) {
		
		if(lista.isEmpty()) {
			System.out.println("La lista se encuentra vacía");
		}else {
	    for (Libros elemento : lista)
	        if(elemento.getNombre().equals(nombre)) {
	        	System.out.println(elemento);
	        	System.out.println(lista.indexOf(elemento));
	        }
		}
	}
	
	public static void Borrar(LinkedList<Libros> lista,String nombre) {
		if(lista.isEmpty()) {
			System.out.println("La lista se encuentra vacía");
		}else {
	    for (Libros elemento : lista)
	        if(elemento.getNombre().equals(nombre)) {
	        	System.out.println("removio el elemento: "+elemento.getNombre());        	
	        	lista.remove(lista.indexOf(elemento));
	        }
		}
	}
	
	public static void CambiarElemento(LinkedList<Libros> lista,Libros Libro,int indice) {
		
		if(lista.isEmpty()) {
			System.out.println("La lista se encuentra vacía");
		}else {
			lista.set(indice, Libro);
	        }
		}
}

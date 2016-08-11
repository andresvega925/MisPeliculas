package logic.object;

import java.util.ArrayList;

import logic.swing.Principal;

public class gestionPelicula {
	
	
	private ArrayList<Pelicula> peliArray;

	public gestionPelicula(){
		
		
		beginComponents();
	
	}
	
	

	public void beginComponents(){
		
		
		peliArray = new ArrayList<>();
		
	}
	

	
	
	public void agregarPelicula(String id, String nombre, String genero ){
		
		
		
		Pelicula pelicula = new Pelicula(id, nombre, genero);
		
		peliArray.add(pelicula);
		
	}
	
//	public void info(){
//		
//		
//		System.out.println("Tamaño array: " + peliArray.size());
//		
//		for (int i = 0; i < peliArray.size(); i++) {
//		
//			System.out.println(peliArray.get(i).getId() + " " + peliArray.get(i).getNombre()+ " "+ 
//					peliArray.get(i).getGenero());
//		}
//	}



	public ArrayList<Pelicula> getPeliArray() {
		return peliArray;
	}



	public void setPeliArray(ArrayList<Pelicula> peliArray) {
		this.peliArray = peliArray;
	}


}

package logic.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import logic.object.dialogAddPelicula;
import logic.object.gestionPelicula;

public class Principal extends JFrame {


	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  Attributes																										 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	private Menu menu;
	private ManagementsEvents events;
	private gestionPelicula gespel;
	private dialogAddPelicula jdpelicula;
	private tablaPeliculas tbPeli;


	
	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  Building																										 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	public Principal(){

		this.setBounds(400, 100, 600, 450);
		this.setTitle("MIS PELICULAS");
		this.setResizable(true);
		this.setVisible(true);
		this.setLayout(null);
		setLocationRelativeTo(null);
		beginComponents();
		//tablaPeliculas();
		addComponents();
		

	}



	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										 Inicio Componentes																										 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	public void beginComponents(){

		tbPeli = new tablaPeliculas(this);
		
		jdpelicula = new dialogAddPelicula(this);

		gespel = new gestionPelicula();

		events = new ManagementsEvents(this);

		menu = new Menu(this);
		
	}


	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  	Agregar Componentes																									 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	public void addComponents(){

		setJMenuBar(menu);
//		this.add(tbPeli).setBounds(0, 20, 600, 400);;
	}

	
	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  	Agregar Pelicula											 *														 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	public void addPelicula(){

		
		/*
		 * Metodo para comprobar que todas las casillas han sido digitadas*/
		if (jdpelicula.getTxtId().getText().length() > 0  && jdpelicula.getTxtNombre().getText().length() >0   
			&& jdpelicula.getTxtGenero().getText().length() > 0){
			
			
			String id = jdpelicula.getTxtId().getText();
			String nombre = jdpelicula.getTxtNombre().getText();
			String genero = jdpelicula.getTxtGenero().getText();
	
				gespel.agregarPelicula(id,nombre,genero); //Agregar pelicula al array
				JOptionPane.showMessageDialog(null, "Agregado Extosamente");

			}else{
			
			JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
		}
		
	}

	
	
	public void tablaPeliculas(){
		
		tbPeli = new tablaPeliculas(this);
		this.add(tbPeli).setBounds(0, 20, 600, 400);;
		tbPeli.mostrarTable();

		
	}

	
	
	public void listaPeliculas(){

		
		if (gespel.getPeliArray().size()> 0) {
			
			tablaPeliculas();
			
			for (int i = 0; i < gespel.getPeliArray().size(); i++) {
				
				System.out.println("id" + gespel.getPeliArray());
			}
		}else{
			
			JOptionPane.showMessageDialog(null, "No hay ninguna pelicula aun");
		}

	}


	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 					 Metodo encargado de abrir el jdialog de agregar pelicula						     *																		 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	public void dialogAgregar(){
		
		jdpelicula.setVisible(true);//volver visible el jdialog
		jdpelicula.getAddPel();//dar la orden de agregar pelicula
	}
	
	
	
	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  Getters and Setters																										 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	
	public void salirAddPelicula(){
		
		jdpelicula.salir();

	}
	
	public Menu getMenu() {
		return menu;
	}



	public void setMenu(Menu menu) {
		this.menu = menu;
	}



	public ManagementsEvents getEvents() {
		return events;
	}



	public void setEvents(ManagementsEvents events) {
		this.events = events;
	}



	public static void main(String[] args) {

		Principal p = new Principal();

	}



	public gestionPelicula getGespel() {
		return gespel;
	}



	public void setGespel(gestionPelicula gespel) {
		this.gespel = gespel;
	}



	public dialogAddPelicula getJdpelicula() {
		return jdpelicula;
	}



	public void setJdpelicula(dialogAddPelicula jdpelicula) {
		this.jdpelicula = jdpelicula;
	}



	public tablaPeliculas getTbPeli() {
		return tbPeli;
	}



	public void setTbPeli(tablaPeliculas tbPeli) {
		this.tbPeli = tbPeli;
	}

	



}

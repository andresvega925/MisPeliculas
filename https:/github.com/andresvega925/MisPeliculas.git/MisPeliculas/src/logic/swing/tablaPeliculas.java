package logic.swing;

import java.awt.FlowLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import logic.object.Pelicula;
import logic.object.gestionPelicula;

public class tablaPeliculas extends JTable{



	private Principal principal;
	private JTable tabla;
	private JScrollPane scPane;
	private DefaultTableModel model;
	private gestionPelicula gsPelicula;


	public tablaPeliculas(Principal principal){

		this.principal = principal;
		this.setBounds(0, 0, 400, 300);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		//beginComponents();
		//addComponents();
	}


	public void beginComponents(){


	}

	public void addComponents(){

		add(scPane);

	}


	

	public void mostrarTable(){

		/*
		 *Creamos un arrayList con el valor de arrayList que se 
		 *creo en la clase gestionPelicula 
		 */

		ArrayList< Pelicula > miLista = principal.getGespel().getPeliArray();
	
		String titulos[] = { "ID","NOMBRE","GENERO"}; // Estos son los encabezados de la tabla
		String informacion[][] =  new String[miLista.size()][3];// obtenemos la informacion de las filas "miLista", el 3 es porque son 3 columnas



		/*creamos un ciclo para recorrer el arrayBidimencional e ir asignado el valor de cada fila*/
		for (int x = 0; x < informacion.length; x++) {
			informacion[x][0] = miLista.get(x).getId();
			informacion[x][1] = miLista.get(x).getNombre();
			informacion[x][2] = miLista.get(x).getGenero();
		}
		
		
		tabla= new JTable(informacion, titulos);//Instanciamos la tabla y le pasamos los vamose de filas y columnas
		scPane = new JScrollPane(tabla);//La tabla ira dentro del scrollPane
		tabla.setEnabled(false);
		tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		addComponents();//Llamamos al metodo donde se añade la tabla al panel


	}

}

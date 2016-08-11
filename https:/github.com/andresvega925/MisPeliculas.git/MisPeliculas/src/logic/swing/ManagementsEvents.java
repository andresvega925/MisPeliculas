package logic.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.invoke.SwitchPoint;

import javax.swing.JOptionPane;

import logic.object.dialogAddPelicula;
import logic.object.gestionPelicula;

public class ManagementsEvents implements ActionListener, KeyListener{

	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 						Métodos Final para el uso de acciones																										 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/

	private Principal prin;
	private gestionPelicula gspelicula;
	private dialogAddPelicula jdpelicula;
	public static final String ADDMOVIE = "addmovie";
	public static final String DELETEMOVIE = "deletemovie";
	public static final String EDITMOVIE = "edittmovie";
	public static final String LIST = "listmovie";
	public static final String SALIRDIALOGADDPELICULA = "salirdialogaddpelicula";
	public static final String MOVIEADD = "movieadd";



	public ManagementsEvents(Principal prin) {
		this.prin = prin;
	}



	@Override
	public void actionPerformed(ActionEvent e) {


		switch (e.getActionCommand()) {

		case ADDMOVIE:

			prin.dialogAgregar();

			break;

		case LIST: 

			prin.listaPeliculas();

			break;

		case SALIRDIALOGADDPELICULA:

			prin.salirAddPelicula();
			break;

		case MOVIEADD:

			prin.addPelicula();
			break;
		default:
			break;
		}

	}


	@Override
	public void keyPressed(KeyEvent e) {

	}




	@Override
	public void keyReleased(KeyEvent e) {

	}




	@Override
	public void keyTyped(KeyEvent e) {

	}





}

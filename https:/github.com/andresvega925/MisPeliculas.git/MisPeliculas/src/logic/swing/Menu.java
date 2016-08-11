package logic.swing;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{
	
	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  Attributes													 *													 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	private Principal  prin;	
	private JMenu file;
	private JMenuItem add;
	private JMenuItem delete;
	private JMenuItem edit;
	private JMenuItem list;

	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  	Building																										 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	
	public Menu(Principal prin){
		
		this.prin = prin;
		
		beginComponents();
		addComponents();
		
	}
	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  	Iniciar Componentes											 *															 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	
	public void beginComponents(){
		
		file = new JMenu("File");
		add = new JMenuItem("Add Movie");
		add.setActionCommand(ManagementsEvents.ADDMOVIE);
		add.addActionListener(prin.getEvents());
		
		
		delete = new JMenuItem("Delete Movie");
		
		edit = new JMenuItem("Edit Movie");
		
		list = new JMenuItem("List Movies");
		list.setActionCommand(ManagementsEvents.LIST);
		list.addActionListener(prin.getEvents());
	}
	
	
	
	/*********************************************************************************************************
	 * 																										 *
	 * 																										 *
	 * 										  	Agregar Componentes																									 *
	 * 																										 *
	 * 																										 *
	 * *******************************************************************************************************/
	
	public void addComponents(){
		
		file.add(add);
	
		file.add(delete);
		file.add(edit);
		file.addSeparator();
		file.add(list);
		
		this.add(file);
		
	}

}

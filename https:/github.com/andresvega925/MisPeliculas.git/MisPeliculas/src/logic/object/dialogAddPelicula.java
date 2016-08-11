package logic.object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logic.swing.ManagementsEvents;
import logic.swing.Principal;

public class dialogAddPelicula extends JDialog{


	private Principal prin;

	private JLabel lbId;
	private JLabel lbNombre;
	private JLabel lbGenero;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtGenero;
	private JButton exit;
	private JButton addPel;



	public dialogAddPelicula(Principal prin){

		this.prin = prin;

		this.setTitle("ADD MOVIE");
		this.setBounds(400, 300, 500, 200);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(false);

		beginComponents();
		addComponents();
	}


	public void beginComponents(){

		lbId = new JLabel("ID");
		lbNombre = new JLabel("NOMBRE");
		lbGenero = new JLabel("GENERO");

		txtId = new JTextField();
		txtNombre = new JTextField();
		txtGenero = new JTextField();

		exit = new JButton("EXIT");
	//	exit.setActionCommand(ManagementsEvents.SALIRDIALOGADDPELICULA);
	//	exit.addActionListener(prin.getEvents());
		
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				prin.salirAddPelicula();
			}
		});

		addPel = new JButton("ADD");
		//addPel.setActionCommand(ManagementsEvents.MOVIEADD);
		//addPel.addActionListener(prin.getEvents());
		
		addPel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				prin.addPelicula();
			}
		});

	}

	public void addComponents(){


		add(lbId).setBounds(30, 50, 100, 50);
		add(txtId).setBounds(50, 50, 100, 50);

		add(lbNombre).setBounds(160, 50, 100, 50);
		add(txtNombre).setBounds(225, 50, 100, 50);

		add(lbGenero).setBounds(310, 50, 100, 50);
		add(txtGenero).setBounds(380, 50, 100, 50);

		add(addPel).setBounds(140, 150, 100, 50);
		add(exit).setBounds(270, 150, 100, 50);


	}


	public void salir(){

	this.setVisible(false);
	}


	public Principal getPrin() {
		return prin;
	}


	public void setPrin(Principal prin) {
		this.prin = prin;
	}


	public JLabel getLbId() {
		return lbId;
	}


	public void setLbId(JLabel lbId) {
		this.lbId = lbId;
	}


	public JLabel getLbNombre() {
		return lbNombre;
	}


	public void setLbNombre(JLabel lbNombre) {
		this.lbNombre = lbNombre;
	}


	public JLabel getLbGenero() {
		return lbGenero;
	}


	public void setLbGenero(JLabel lbGenero) {
		this.lbGenero = lbGenero;
	}


	public JTextField getTxtId() {
		return txtId;
	}


	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtGenero() {
		return txtGenero;
	}


	public void setTxtGenero(JTextField txtGenero) {
		this.txtGenero = txtGenero;
	}


	public JButton getExit() {
		return exit;
	}


	public void setExit(JButton exit) {
		this.exit = exit;
	}


	public JButton getAddPel() {
		return addPel;
	}


	public void setAddPel(JButton addPel) {
		this.addPel = addPel;
	}

	
	
	
	
}

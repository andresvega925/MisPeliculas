//package logic.swing;
//
//import java.awt.FlowLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//
//public class run3 extends JPanel{
//	
//	
//	
//
//	private JTable tabla;
//	private JScrollPane scPane;
//
//	
//	public run3( ){
//		
//		this.setBounds(0, 0, 400, 300);
//		this.setVisible(true);
//		this.setLayout(new FlowLayout());
//		beginComponents();
//		addComponents();
//	}
//	
//	
//	public void beginComponents(){
//		
//		String p = "1";
//
//		String cabezera [] = {"ID","NOMBRE","GENERO"};
//
//		String datos [][] = {{p,p,p}};
//
//		tabla = new JTable(datos,cabezera);
//
//		scPane = new JScrollPane(tabla);
//	}
//	
//	public void addComponents(){
//		
//		add(scPane);
//
//	}
//	
//	
//	public static void main(String [] arg){
//		
//		run3 r = new run3();
//	
//	}
//
//}

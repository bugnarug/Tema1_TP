import javax.swing.*;
import java.awt.Color;

public class GUI extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel pol1 = new JLabel("Polinom1");
	private JLabel pol2 = new JLabel("Polinom2");
	private JLabel rezultat = new JLabel("Rezultat");
	private JLabel operatii = new JLabel("Operatii");

	private JButton butAduna = new JButton("Adunare");
	private JButton butExit = new JButton("Exit");
	private JButton butClear = new JButton("Sterge");
	private JButton butOK = new JButton("OK");
	private JButton butScadere = new JButton("Scadere");
	private JButton butInmultire = new JButton("Inmultire");
	private JButton butDeriveaza = new JButton("Derivare");
	private JButton butIntegreaza = new JButton("Integrare");

	private JPanel panel = new JPanel();
	private JFrame frame = new JFrame();

	private JTextField text1 = new JTextField();
	private JTextField text2 = new JTextField();
	private JTextField text3 = new JTextField();



	public GUI() {
		panel.setLayout(null);
		panel.setBounds(10, 10, 600, 500);
		pol1.setBounds(30, 30, 60, 30);
		pol2.setBounds(30, 70, 60, 30);
		operatii.setBounds(30, 200, 60, 30);
		rezultat.setBounds(300, 50, 60, 30);
		text1.setBounds(100, 30, 160, 30);
		text2.setBounds(100, 70, 160, 30);
		text3.setBounds(350, 30, 300, 70);
		butOK.setBounds(100, 110, 120, 30);
		butExit.setBounds(295, 260, 90, 30);
		butClear.setBounds(350, 110, 120, 30);
		butAduna.setBounds(100, 200, 100, 30);
		butScadere.setBounds(200, 200, 100, 30);
		butInmultire.setBounds(300, 200, 100, 30);
		butDeriveaza.setBounds(400, 200, 100, 30);
		butIntegreaza.setBounds(500, 200, 100, 30);
		

		panel.add(pol1);
		panel.add(pol2);
		panel.add(rezultat);
		panel.add(operatii);
		panel.add(butAduna);
		panel.add(butExit);
		panel.add(butClear);
		panel.add(butOK);
		panel.add(butScadere);
		panel.add(butInmultire);
		
		panel.add(butDeriveaza);
		panel.add(butIntegreaza);

		panel.add(text1);
		panel.add(text2);
		panel.add(text3);
		frame.add(panel);



		panel.setBackground(Color.gray);// seteaza culoarea background
		panel.setVisible(true);
		this.setSize(700, 400);
		this.setContentPane(panel);
		this.setTitle("Operatii pe polinoame");

		this.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public JButton add(){
		return butAduna;
	}
	
	public JButton scade(){
		return butScadere;
	}
	public JButton inmulteste(){
		return butInmultire;
	}
	
	public JButton deriveaza(){
		return butDeriveaza;
	}
	
	public JButton integreaza(){
		return butIntegreaza;
	}
	
	public JButton clear(){
		return butClear;
	}
	
	
	public JButton ok(){
		return butOK;
	}
	
	public JButton exit(){
		return butExit;
	}
	
	public JTextField getText1(){
		return text1;
	}
	public JTextField getText2(){
		
		
		
		return text2;
	}
	public JTextField getText3(){
		return text3;
	}


	
	
}

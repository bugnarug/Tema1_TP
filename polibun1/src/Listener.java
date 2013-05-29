import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Listener implements ActionListener {
	private GUI gui = new GUI();
	
	private Operatii Polinomial1 = new Operatii(); // creem obiecte pentru clasa

	private Operatii Polinomial2 = new Operatii();
	private Operatii Polinomial = new Operatii();
	
	public Listener (){
		
		//gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		
		gui.exit().addActionListener(this);
		gui.add().addActionListener(this);
		gui.clear().addActionListener(this);
		gui.ok().addActionListener(this);
		gui.scade().addActionListener(this);
		gui.inmulteste().addActionListener(this);
		gui.deriveaza().addActionListener(this);
		gui.integreaza().addActionListener(this);	

	}

	
	public void actionPerformed(ActionEvent e) {

		
		if (e.getSource() == gui.exit()) // iesire din aplicatie
			System.exit(0);
		if (e.getSource() == gui.clear()) // sterge toate text field
		{
			gui.getText1().setText("");
			gui.getText2().setText("");
			gui.getText3().setText("");
			
		}

		if (e.getSource() == gui.ok()) // creeaza doua polinoame
		{
			/*
			 * Polinoamele trebuie introduse incepand cu , coeficientul liber si
			 * se vor introduce doar coeficientii cu spatii intre ele
			 */
			String string1 = gui.getText1().getText(); // string pentru label
												// polinom1=coefficients for
												// polinom 1
			if(string1.equals("")){
				string1=Integer.toString(0);
				
			}
			
			String string2 = gui.getText2().getText(); // string from label
												// polinom2=coefficients for
												// polinom 2
			
			if(string2.equals("")){
				string2=Integer.toString(0);
				
			}
			char delimiter = ' ';// coefiecientii sunt delimitati printr-un
									// spatiu

			// calculeaza numarul de caractere delimitate
			int N1 = 0; // N1 este gradul pentru primul polinom
			for (int i = 0; i < string1.length(); i++)
				if (string1.charAt(i) == delimiter)
					N1++;

			int N2 = 0; // N2 este gradul pentru al doilea polinom
			for (int i = 0; i < string2.length(); i++)
				if (string2.charAt(i) == delimiter)
					N2++;

			String rezultat1[] = string1.split(" ");
			int[] coeff1 = new int[N1 + 1];
			for (int i = 0; i <= N1; i++)
				coeff1[i] = Integer.parseInt("" + rezultat1[i]);
			// coeff1 este un sir ce contien coeficientii primului polinom

			String rezultat2[] = string2.split(" ");
			int[] coeff2 = new int[N2 + 1];
			for (int i = 0; i <= N2; i++)
				coeff2[i] = Integer.parseInt("" + rezultat2[i]);
			// coeff2 este un sir ce contine coeficientii pentru al doilea
			// polinom

			// stabileste gradul si coeficientii pentru primul polinom
			Polinomial1.setGrad(N1);
			Polinomial1.setCoeff(coeff1);

			// stabileste gradul si coeficientii pentru al doilea polinom
			Polinomial2.setGrad(N2);
			Polinomial2.setCoeff(coeff2);
		}

		if (e.getSource() == gui.add()) // daca butonul Adunare se apasa

		{

			Polinomial = Polinomial1.aduna(Polinomial2); // aduna doua polinoame
			String polinom = Polinomial.toString(); // transforma rezultatul
													// intr-un string

			gui.getText3().setText(String.valueOf(polinom)); // afiseaza rezultatul

		}

		if (e.getSource() == gui.scade())// daca butonul Scadere se apasa
		{
			Polinomial = Polinomial1.scade(Polinomial2);// scade cele doua
														// polinoame
			String polinom = Polinomial.toString();// transforma rezultatul
													// intr-un string
			gui.getText3().setText(String.valueOf(polinom));// afiseaza rezultatul
		}

		if (e.getSource() == gui.inmulteste())// daca butonul Inmultire se apasa
		{
			Polinomial = Polinomial1.inmulteste(Polinomial2);// inmulteste cele
																// doua
																// polinoame
			String polinom = Polinomial.toString();// transforma rezultatul
													// intr-un string
			gui.getText3().setText(String.valueOf(polinom));// afiseaza rezultatul
		}

		
		if (e.getSource() == gui.deriveaza())// daca butonul Derivare se apasa
		{

			Polinomial = Polinomial1.deriveaza();// deriveaza primul polinom
			String polinom = Polinomial.toString();// transforma rezultatul
													// intr-un string
			gui.getText3().setText(String.valueOf(polinom));// afiseaza rezultatul
		}

		if (e.getSource() == gui.integreaza()) // daca butonul Integrare se apasa
		{

			String polinom = Polinomial1.integreaza();// integreaza primul
														// polinom
			gui.getText3().setText(String.valueOf(polinom));// afiseaza rezultatul
		}

	}

}

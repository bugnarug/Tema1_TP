public class Operatii extends Polinom {
	

	// metoda implemeteaza adunarea polinoamelor

	public Operatii aduna(Operatii p2) {

		Operatii p1 = this;
		Operatii rez = new Operatii();

		if (p1.grad <= p2.grad) {

			rez.grad = p2.grad;
			for (int i = 0; i <= p1.grad; i++)
				rez.coef[i] = p1.coef[i] + p2.coef[i];// adunarea termenilor de
														// acelasi grad
			for (int i = p1.grad + 1; i <= p2.grad; i++)
				rez.coef[i] = p2.coef[i]; // rezultatul este dat de coefiecintii
											// polinomului cu gradul cel mai
											// mare
		} else {
			rez.grad = p1.grad;
			for (int i = 0; i <= p2.grad; i++)
				rez.coef[i] = p1.coef[i] + p2.coef[i]; // adunarea termenilor de
														// acelasi grad
			for (int i = p2.grad + 1; i <= p1.grad; i++)
				rez.coef[i] = p1.coef[i];// rezultatul este dat de coefiecintii
											// polinomului cu gradul cel mai
											// mare

		}
		rez.setGrad(rez.grad);
		rez.setCoeff(rez.coef);
		return rez;
	}

	// implementeaza scaderea polinoamelor

	public Operatii scade(Operatii p2) {
		Operatii p1 = this;
		Operatii rez = new Operatii();
		// verifica care polinom are cel mai mare grad iar acel grad va fi
		// gradul rezultatului
		if (p1.grad >= p2.grad) {

			rez.grad = p1.grad;
			for (int i = 0; i <= p2.grad; i++)
				rez.coef[i] = p1.coef[i] - p2.coef[i]; // scaderea termenilor de
														// acelasi grad
			for (int i = p2.grad + 1; i <= p1.grad; i++)
				rez.coef[i] = p1.coef[i]; // rezultatul este dat de coefiecintii
											// polinomului cu gradul cel mai
											// mare

		} else {
			rez.grad = p2.grad;
			for (int i = 0; i <= p1.grad; i++)
				rez.coef[i] = p1.coef[i] - p2.coef[i];// scaderea termenilor de
														// acelasi grad
			for (int i = p1.grad + 1; i <= p2.grad; i++)
				rez.coef[i] = 0 - p2.coef[i];// rezultatul este dat de
												// coefiecintii polinomului cu
												// gradul cel mai mare

		}
		rez.setGrad(rez.grad);
		rez.setCoeff(rez.coef);
		return rez;
	}

	// implemantam inmultirea polinoamelor, fiecare coeficient al polinomului
	// este inmultit
	// cu toti coeficientii celululalt polinom.Rezultatul este retinut intr-un
	// alt polinom
	// si returnat de metoda

	public Operatii inmulteste(Operatii p2) {
		Operatii p1 = this;
		Operatii rez = new Operatii();
		rez.grad = p1.grad + p2.grad;
		for (int i = 0; i <= p1.grad; i++)
			for (int j = 0; j <= p2.grad; j++)
				rez.coef[i + j] += p1.coef[i] * p2.coef[j];
		rez.setGrad(rez.grad);
		rez.setCoeff(rez.coef);
		return rez;
	}

	

	public Operatii deriveaza() {
		if (grad == 0)
			return new Operatii();
		Operatii deriv = new Operatii();
		deriv.grad = grad - 1;
		for (int i = 0; i < grad; i++)
			deriv.coef[i] = (i + 1) * coef[i + 1];
		return deriv;
	}

	public String integreaza() {
		// aici avem un caz similar cu impartirea
		String s = "";
		if (grad == 0)
			return coef[0] + "x + const";
		float[] integr = new float[20];
		int integr_deg = grad + 1;
		for (int i = 1; i <= integr_deg; i++) {
			float temp = i;
			integr[i] = (coef[i - 1] / temp);

		}
		// trebuie sa transformam polinomul dat printr-un sir de coef intr-un
		// String
		// dar din moment ce nu este implementata nicio clasa pentru acest sir
		// nu avem ce metoda sa apelam

		s = integr[integr_deg] + "x^" + integr_deg;
		for (int i = integr_deg - 1; i >= 1; i--) {
			if (integr[i] == 0)
				continue;
			else if (integr[i] > 0)
				s = s + " + " + (integr[i]);
			else if (coef[i] < 0)
				s = s + " - " + (-integr[i]);
			if (i == 1)
				s = s + "x";
			else if (i > 1)
				s = s + "x^" + i;
		}

		s = s + " + const";
		return s;
	}

	// transforma polinomul in string ca sa-l poata afisa
	public String toString() {
		if (grad == 0)
			return "" + coef[0];
		if (grad == 1) {
			if (coef[0] >= 0)
				return coef[1] + "x + " + coef[0];
			else
				return coef[1] + "x - " + (-coef[0]);
		}
		String s = coef[grad] + "x^" + grad;
		for (int i = grad - 1; i >= 0; i--) {
			if (coef[i] == 0)
				continue;
			else if (coef[i] > 0)
				s = s + " + " + (coef[i]);
			else if (coef[i] < 0)
				s = s + " - " + (-coef[i]);
			if (i == 1)
				s = s + "x";
			else if (i > 1)
				s = s + "x^" + i;
		}
		return s;
	}

}

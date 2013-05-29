
public class Polinom {
	
	public int coef[] = new int[10];
	public int grad;
	
	public void setGrad(int a) {
		grad = a;
	}

	public void setCoeff(int[] tab) {
		for (int i = 0; i < tab.length; i++)
			coef[i] = tab[i];
	}

	
}

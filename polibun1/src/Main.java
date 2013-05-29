import java.awt.EventQueue;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				Listener listener = new Listener();
				//main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//main.setVisible(true);
				
			}
		});
	}
}

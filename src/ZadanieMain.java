
import java.awt.EventQueue;

import javax.swing.JFrame;

public class ZadanieMain {
	public static void main (String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new ButtonZadanie();
				
				
				frame.setTitle("ButtonZadanie");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonZadanie extends JFrame {
	
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 300;

	public ButtonZadanie() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

		JButton zadanieButton = new JButton("zadanieButton");
		JButton zadanieButtonKlasaAnonimowa = new JButton("zadanieButtonKlasaAnonimowa"); 
		JButton zadanieButtonWyrLambda = new JButton("zadanieButtonWyrLambda");
		
		buttonPanel = new JPanel();
		
		buttonPanel.add(zadanieButton);
		buttonPanel.add(zadanieButtonKlasaAnonimowa);
		buttonPanel.add(zadanieButtonWyrLambda);
		
		add(buttonPanel);
		// dla zadanieButton
		PrintAction zadanieAction = new PrintAction ();

	
		// dla zadanieButton
		zadanieButton.addActionListener(zadanieAction);
		// dla zadanieButtonKlasaAnonimowa
		zadanieButtonKlasaAnonimowa.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Akkuku ktoś mnie nacisnął!! Klasa Anonimowa ");
				}
		
		}));
		// dla zadanieButtonWyrLambda
		zadanieButtonWyrLambda.addActionListener((ActionEvent event) -> System.out.println("Akkuku ktoś mnie nacisnął!! Lambda"));
		
	}
	
	// dla zadanieButton
	private class PrintAction implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			System.out.println("Akkuku ktoś mnie nacisnął!! Normalny guzik ");
		}
		
	}
}
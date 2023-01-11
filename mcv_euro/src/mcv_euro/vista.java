package mcv_euro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class vista extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JPanel panelR;
	public JButton Dolares;
	public JButton euros;
	public JLabel LResultado;

	/**
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
* Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public vista() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panelB = new JPanel();
		contentPane.add(panelB, BorderLayout.CENTER);
		
		LResultado = new JLabel("RESULTADO");
		panelB.add(LResultado);
		
		panelR = new JPanel();
		contentPane.add(panelR, BorderLayout.SOUTH);
		
		euros = new JButton("EUROS");
		panelR.add(euros);
		
		Dolares = new JButton("DOLARES");
		panelR.add(Dolares);
	}

}

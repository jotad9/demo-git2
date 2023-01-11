package mcv_euro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Controlador implements ActionListener {

	private Modelo modelo;
	private vista vista;
	private double cantidad;
	
	
	public Controlador(Modelo modelo, vista vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
		
		this.vista.Dolares.addActionListener(this);
		this.vista.euros.addActionListener(this);
	}
	
	public void InicializarVista() {
		vista.setTitle("Conversor");
		vista.pack();
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(vista.euros==e.getSource()) {
			if(!"".equals(vista.textField.getText())) {
				try {
					cantidad=Double.parseDouble(vista.textField.getText());
					modelo.setCantidad(cantidad);
					modelo.setMoneda(0.94);
					modelo.convertirDolarEuros();
					vista.LResultado.setText(modelo.getResultado().toString());
				}catch(NumberFormatException ex) {
					vista.LResultado.setText("INTRODUZCA OTRA COSA");
				}
			}
		}else if(vista.Dolares==e.getSource()) {
			if(!"".equals(vista.textField.getText())) {
				try {
					cantidad=Double.parseDouble(vista.textField.getText());
					modelo.setCantidad(cantidad);
					modelo.setMoneda(1.06);
					modelo.convertirEurosDolar();
					vista.LResultado.setText(modelo.getResultado().toString());
				}catch(NumberFormatException ex) {
					vista.LResultado.setText("INTRODUZCA OTRA COSA");
				}
			}
		}
		
	}

}

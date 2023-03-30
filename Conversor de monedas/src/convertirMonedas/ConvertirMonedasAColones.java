package convertirMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAColones {

	public void ConvertirDolaresAColones (double valor) {
		double monedaDolar = valor * 546.42;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: $ " + monedaDolar + " Colones");
	}
	
	public void ConvertirEurosAColones (double valor) {
		double euro = valor * 546.42;
		euro = (double) Math.round(euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: ₡ " + euro + " Colones");
	}
	
	public void ConvertirLibrasEsterlinasAColones (double valor) {
		double librasEsterlinas = valor * 665.21;
		librasEsterlinas = (double) Math.round(librasEsterlinas * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: ₡ " + librasEsterlinas + " Colones");
	}
	
	public void ConvertirYenJaponesAColones (double valor) {
		double yenJapones = valor * 4.06;
		yenJapones = (double) Math.round(yenJapones *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: ₡" + yenJapones + " Colones");
	}
	
	public void ConvertirWonAColones(double valor) {
		double won = valor * 2.42;
		won = (double) Math.round(won *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: ₡" + won + "Colones");
	}
	
}

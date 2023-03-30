package convertirMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirColonesADolares (double valor) {
		double monedaDolar = valor / 546.42;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirColonesAEuros (double valor) {
		double euro = valor / 546.42;
		euro = (double) Math.round(euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: € " + euro + " Euros");
	}
	
	public void ConvertirColonesALibrasEsterlinas (double valor) {
		double librasEsterlinas = valor / 665.21;
		librasEsterlinas = (double) Math.round(librasEsterlinas * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: £ " + librasEsterlinas + " Libras Esterlinas");
	}
	
	public void ConvertirColonesAYenJapones (double valor) {
		double yenJapones = valor / 4.06;
		yenJapones = (double) Math.round(yenJapones *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: ¥" + yenJapones + " Yen Japonés");
	}
	
	public void ConvertirColonesAWon(double valor) {
		double won = valor / 2.42;
		won = (double) Math.round(won *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: ₩" + won + "Wones Surcoreanos");
	}
	
}

package convertirMonedas;

import javax.swing.JOptionPane;
	
public class funcion{

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAColones colones = new ConvertirMonedasAColones();
	
	public void ConvertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Colones a Dolar", "De Colones a Euro", "De Colones a Libras","De Colones a Yen","De Colones a Won Coreano","De Dólar a Colones", "De Euro a Colones", "De Libras a Colones","De Yen a Colones","De Won Coreano a Colones"}, 
    			"Seleccion")).toString();

		
	    switch(opcion) {
		case "De Colones a Dolar":
			monedas.ConvertirColonesADolares(Minput);
			break;
		case "De Colones a Euros":
			monedas.ConvertirColonesAEuros(Minput);
			break;
		case "De Colones a Libras Esterlinas":
			monedas.ConvertirColonesALibrasEsterlinas(Minput);
			break;
		case "De Colones a Yen":
			monedas.ConvertirColonesAYenJapones(Minput);
			break;
		case "De Colones a Won Coreano":
			monedas.ConvertirColonesAWon(Minput);
			break;
		case "De Dolar a Colones":
			colones.ConvertirDolaresAColones(Minput);
			break;
		case "De Euro a Colones":
			colones.ConvertirEurosAColones(Minput);
			break;
		case "De Libras Esterlinas a Colones":
			colones.ConvertirLibrasEsterlinasAColones(Minput);
			break;
		case "De Yen a Colones":
			colones.ConvertirYenJaponesAColones(Minput);
			break;
		case "De Won Coreano a Colones":
			colones.ConvertirWonAColones(Minput);
			break;
		}
	
	
}
}

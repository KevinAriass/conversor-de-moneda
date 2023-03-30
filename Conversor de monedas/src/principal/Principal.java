package principal;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import conversorTemperatura.FuncionTemperatura;
import convertirMonedas.ConvertirMonedas;
import convertirMonedas.funcion;

public interface Principal {
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main (String[] args) {
		
		JFrame frame = new JFrame();
		funcion monedas = new funcion();

		FuncionTemperatura temperatura = new FuncionTemperatura();
		
		while(true) {
			
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
			
			switch(opciones) {
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
				if(ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Seleccione una opción correcta");
					}else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
				
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Ingrese el valor de temperatura que quiere convertir: ");
				if(ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					temperatura.ConvertirTeperatura(Minput);
					
					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if((respuesta == 0) && (ValidarNumero(input) == true )) {
				
					}else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Valor inálido");
				}
				break;
			}
			
		}
	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}

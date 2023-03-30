package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public double ConvertirCelsiusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		JOptionPane.showConfirmDialog(null, + valor + " grados Celsius son " + farenheit + " Grados Farenheit");
		return farenheit;
	}
	
	public void ConvertirCelsiusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
	}
	
	public void ConvertirFarenheitACelcius (double valor) {
		double celcius = (valor - 32) / 1.8;
		celcius = (double) Math.round(celcius * 100d)/100;
		JOptionPane.showMessageDialog(null, " Grados Farenheit son " +celcius+ " Celcius");
	}
	
	public double ConvertirKelvinACelcius (double valor) {
		double kelvinCelcius = valor - 273.15;
		kelvinCelcius = (double) Math.round(kelvinCelcius * 100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
		return kelvinCelcius;
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = ConvertirKelvinACelcius(valor);
		kelvinFarenheit = ConvertirCelsiusAFarenheit(kelvinFarenheit);
		kelvinFarenheit = (double) Math.round(kelvinFarenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Celcius");
	}
}

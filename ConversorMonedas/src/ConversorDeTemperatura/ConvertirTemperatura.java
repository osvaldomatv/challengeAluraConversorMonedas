package ConversorDeTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void ConvertirCelsiusFahrenheit(double valor) {
		double CFahrenheit = (valor * 1.8) + 32;
		CFahrenheit = (double) Math.round(CFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + CFahrenheit + " Fahrenheit", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirCelisusKelvin(double valor) {
		double CKelvin = valor + 273.15;
		CKelvin = (double) Math.round(CKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + CKelvin + " Kelvin", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirCelsiusRankine(double valor) {
		double CRankine = (valor * 1.8) + 491.67;
		CRankine = (double) Math.round(CRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + CRankine + " Rankine", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirFahrenheitCelsius(double valor) {
		double FCelsius = (valor - 32) * (0.556);
		FCelsius = (double) Math.round(FCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + FCelsius + " Celsius", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirFahrenheitKelvin(double valor) {
		double FKelvin = (valor + 459.67) * (0.556);
		FKelvin = (double) Math.round(FKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + FKelvin + " Kelvin", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirFahrenheitRankine(double valor) {
		double FRankine = valor + 459.67;
		FRankine = (double) Math.round(FRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + FRankine + " Rankine", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirKelvinCelsius(double valor) {
		double KCelsius = valor - 273.15;
		KCelsius = (double) Math.round(KCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + KCelsius + " Celsius", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirKelvinFahrenheit(double valor) {
		double KFahrenhit = ((valor - 273.15) * (1.8)) + 32;
		KFahrenhit = (double) Math.round(KFahrenhit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + KFahrenhit + " Fahrenheit", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirKelvinRankine(double valor) {
		double KRankine = valor * 1.8;
		KRankine = (double) Math.round(KRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + KRankine + " Rankine", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirRankineCelsius(double valor) {
		double RCelsius = (valor - 491.67) * (0.556);
		RCelsius = (double) Math.round(RCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + RCelsius + " Celsius", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirRankineFahrenheit(double valor) {
		double RFahrenhit = valor - 459.67;
		RFahrenhit = (double) Math.round(RFahrenhit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + RFahrenhit + " Fahrenheit", null, JOptionPane.PLAIN_MESSAGE);
	}

	public void ConvertirRankineKelvin(double valor) {
		double RKelvin = valor * (0.556);
		RKelvin = (double) Math.round(RKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + RKelvin + " Kelvin", null, JOptionPane.PLAIN_MESSAGE);
	}

}
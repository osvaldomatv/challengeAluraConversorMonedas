package ConversorDeMonedas;
import javax.swing.JOptionPane;

public class MetodosConversorPesosMexicano {

	public void pesosADolar(double moneda) {
		double monedaConversion = moneda / 17.15;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Dolares", null, JOptionPane.PLAIN_MESSAGE);

	}

	public void pesosAEuro(double moneda) {
		double monedaConversion = moneda / 18.64;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Euros", null, JOptionPane.PLAIN_MESSAGE);

	}
	
	public void pesosALibra(double moneda) {
		double monedaConversion = moneda / 21.69;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Libras",  null, JOptionPane.PLAIN_MESSAGE);

	}
	
	public void pesosAYen(double moneda) {
		double monedaConversion = moneda / 0.12;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Yenes",  null, JOptionPane.PLAIN_MESSAGE);

	}
	
	public void pesosAWon(double moneda) {
		double monedaConversion = moneda / 0.01;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Wones",  null, JOptionPane.PLAIN_MESSAGE);

	}
	
	public void dolarAPeso(double moneda) {
		double monedaConversion = moneda * 17.15;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Pesos", null, JOptionPane.PLAIN_MESSAGE);

	}

	public void euroAPesos(double moneda) {
		double monedaConversion = moneda * 18.64;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Pesos", null, JOptionPane.PLAIN_MESSAGE);

	}
	
	public void libraAPesos(double moneda) {
		double monedaConversion = moneda * 21.69;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Pesos",  null, JOptionPane.PLAIN_MESSAGE);

	}
	
	public void yenAPesos(double moneda) {
		double monedaConversion = moneda * 0.12;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Pesos",  null, JOptionPane.PLAIN_MESSAGE);

	}
	
	public void wonAPesos(double moneda) {
		double monedaConversion = moneda * 0.01;
		monedaConversion = (double) Math.round(monedaConversion * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaConversion + " Pesos",  null, JOptionPane.PLAIN_MESSAGE);

	}


}

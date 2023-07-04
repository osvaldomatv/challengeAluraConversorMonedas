package ConversorDeMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversorMonedas {
	
  MetodosConversorPesosMexicano monedas = new MetodosConversorPesosMexicano();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", 
							"De Pesos a Yen Japonés", "De Pesos a Won Sur Coreano", 
							"De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos",
							"De Yen Japonés a Pesos", "De Won Sur Coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Pesos a Dólar": 
		monedas.pesosADolar(valor);
		break;
	
	case "De Pesos a Euro": 
		monedas.pesosAEuro(valor);
		break;
		
	case "De Pesos a Libras Esterlinas":
		monedas.pesosALibra(valor);
		break;
		
	case "De Pesos a Yen Japonés":
		monedas.pesosAYen(valor);
		break;
		
	case "De Pesos a Won Sur Coreano":
		monedas.pesosAWon(valor);
		break;
	
	case "De Dólar a Pesos":
		monedas.dolarAPeso(valor);;
		break;
		
	case "De Euro a Pesos":
		monedas.euroAPesos(valor);;
		break;
		
	case "De Libras Esterlinas a Pesos":
		monedas.libraAPesos(valor);
		break;
	 
	case "De Yen Japonés a Pesos":
		monedas.yenAPesos(valor);
		break;
		
	case "De Won Sur Coreano a Pesos":
		monedas.wonAPesos(valor);
		break;
	}
	}

}

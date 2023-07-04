package ProgramaPrincipal;

import javax.swing.JOptionPane;
import ConversorDeMonedas.OpcionesConversorMonedas;
import ConversorDeTemperatura.OpcionesConversorTemperatura;

public class Principal {

	public static void main(String[] args) {
		OpcionesConversorMonedas conversion = new OpcionesConversorMonedas();
		OpcionesConversorTemperatura conversionT = new OpcionesConversorTemperatura();
		boolean continuar = true;
		
		while (continuar) {
			String opciones = JOptionPane.showInputDialog
					(null, "Seleccione una opción de conversión", 
							"Menú", JOptionPane.PLAIN_MESSAGE,
							null, 
							new Object[] { "Conversor de Monedas", 
											"Conversor de Temperatura" }, "Elegir")
					.toString();

			switch (opciones) {
			case "Conversor de Monedas":
				 try {
                     String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir",null , JOptionPane.PLAIN_MESSAGE);
                     double valorRecibido = Double.parseDouble(input);
                     conversion.ConvertirMonedas(valorRecibido);

                     int respuesta = JOptionPane.showOptionDialog(
                             null, "¿Desea realizar otra Conversión?",
                             "Conversor de Monedas",
                             JOptionPane.YES_NO_OPTION,
                             JOptionPane.PLAIN_MESSAGE,
                             null,null,null);
                     if (JOptionPane.OK_OPTION == respuesta) {
                      
                     } else {
                         JOptionPane.showMessageDialog(null, "Programa finalizado",null , JOptionPane.PLAIN_MESSAGE);
                         continuar = false;
                     }
                 } catch (NumberFormatException e) {
                     JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido",null , JOptionPane.PLAIN_MESSAGE);
                 }
                 break;

		
			case "Conversor de Temperatura":
                try {
                    String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir",null , JOptionPane.PLAIN_MESSAGE);
                    double valorRecibidoT = Double.parseDouble(input1);
                    conversionT.ConvertirTemperaturas(valorRecibidoT);

                    int respuesta = JOptionPane.showOptionDialog(
                            null,
                            "¿Desea realizar otra Conversión?",
                            "Conversor de Temperatura",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            null,
                            null);
                    
                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Entra");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado",null , JOptionPane.PLAIN_MESSAGE);
                        continuar = false;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido",null , JOptionPane.PLAIN_MESSAGE);
                }
				break;
			}
			
		}
	}

}

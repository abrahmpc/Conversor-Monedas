package conversordemonedas;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        
        FunctionCoin monedas = new FunctionCoin();
        FunctionTemperature temperaturas = new FunctionTemperature();
        
        String input;
        double valor;
        int seleccion;
        
//        Ventana principal del conversor.
        String opciones = (JOptionPane.showInputDialog(
                null,"Seleccione una opción de conversión", "Menú", JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"Conversor de Monedas", "Conversor de Temperaturas"}, 
                "Seleccion")).toString();
    
        try {
//        Ventana de opciones
            switch (opciones) {
                case "Conversor de Monedas":
                    
                    do {
                        input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
                        valor = Double.parseDouble(input);
                        monedas.ConvertirMonedas(valor);
                        seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    } while (JOptionPane.OK_OPTION == seleccion);

                    JOptionPane.showMessageDialog(null, "Programa Terminado");
                    break;
                case "Conversor de Temperaturas":

                    do {
                        input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
                        valor = Double.parseDouble(input);
                        temperaturas.ConvertirTemperaturas(valor);
                        seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    } while (JOptionPane.OK_OPTION == seleccion);

                    JOptionPane.showMessageDialog(null, "Programa Terminado");
                    break;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Valor no válido");
        }
        
    }
    
}

package conversordemonedas;

import javax.swing.JOptionPane;

public class FunctionTemperature {
    
    ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();
    
    public void ConvertirTemperaturas(double valor) {
        
//        Ventana de opciones de temperaturas
        String opcion = (JOptionPane.showInputDialog(
                null,"Seleccione la escala de temperaturas a la que desee convertirla", "Temperaturas", 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celcius a Farentheit", "Celcius a Kelvin", 
                    "Farentheit a Rankine", "Kelvin a Rankine", "Celcius a Rankine", "Farentheit a Celcius", 
                    "Kelvin a Celcius", "Rankine a Farentheit", "Rankine a Kelvin", "Rankine a Celcius"}, 
                    "Seleccion")).toString();

        switch (opcion) {
            case "Celcius a Farentheit":
                temperaturas.ConvertirCelsiusAFarentheit(valor, true);
            break;
            case "Celcius a Kelvin":
                temperaturas.ConvertirCelsiusAKelvin(valor, true);
            break;
            case "Farentheit a Rankine":
                temperaturas.ConvertirFarentheitARankine(valor, true);
            break;
            case "Kelvin a Rankine":
                temperaturas.ConvertirKelvinARankine(valor, true);
            break;
            case "Celcius a Rankine":
                temperaturas.ConvertirCelsiusARankine(valor, true);
            break;
            case "Farentheit a Celcius":
                temperaturas.ConvertirCelsiusAFarentheit(valor, false);
            break;
            case "Kelvin a Celcius":
                temperaturas.ConvertirCelsiusAKelvin(valor, false);
            break;
            case "Rankine a Farentheit":
                temperaturas.ConvertirFarentheitARankine(valor, false);
            break;
            case "Rankine a Kelvin":
                temperaturas.ConvertirKelvinARankine(valor, false);
            break;
            case "Rankine a Celcius":
                temperaturas.ConvertirCelsiusARankine(valor, false);
            break;
        }
    }
}

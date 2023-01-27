package conversordemonedas;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {
    
//    Método de conversión
    public void ConvertirCelsiusAFarentheit(double valor, boolean aFarentheit) {
        if (aFarentheit) {
            double farentheit = (1.8 * valor) + 32;
            farentheit = (double) Math.round(farentheit * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes " + farentheit + " ºF.");
        } else {
            double celsius = (valor - 32) / 1.8;
            celsius = (double) Math.round(celsius * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes "+ celsius + " ºC.");
        }
    }
    
    public void ConvertirCelsiusAKelvin(double valor, boolean aKelvin) {
        if (aKelvin) {
            double kelvin = valor + 273.15;
            kelvin = (double) Math.round(kelvin * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes " + kelvin + " K.");
        } else {
            double celsius = valor - 273.15;
            celsius = (double) Math.round(celsius * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes "+ celsius + " ºC.");
        }
    }
    
    public void ConvertirFarentheitARankine(double valor, boolean aRankine) {
        if (aRankine) {
            double rankine = valor + 460.67;
            rankine = (double) Math.round(rankine * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes " + rankine + " R.");
        } else {
            double farentheit = valor - 460.67;
            farentheit = (double) Math.round(farentheit * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes "+ farentheit + " ºF.");
        }
    }
    
    public void ConvertirKelvinARankine(double valor, boolean aRankine) {
        if (aRankine) {
            double rankine = valor * 1.8;
            rankine = (double) Math.round(rankine * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes " + rankine + " R.");
        } else {
            double kelvin = valor / 1.8;
            kelvin = (double) Math.round(kelvin * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes "+ kelvin + " K.");
        }
    }
    
    public void ConvertirCelsiusARankine(double valor, boolean aRankine) {
        if (aRankine) {
            double rankine = (valor + 273.15) * 1.8;
            rankine = (double) Math.round(rankine * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes " + rankine + " R.");
        } else {
            double celsius = (valor / 1.8) - 273.15;
            celsius = (double) Math.round(celsius * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes "+ celsius + " ºC.");
        }
    }
    
}

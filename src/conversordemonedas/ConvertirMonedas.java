package conversordemonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
    
//    Método de conversión
    public void ConvertirDivisa(double fiat, double valor, boolean aDolar, String simbolo) {
        if (aDolar) {
            double totalDolar = valor / fiat;
            totalDolar = (double) Math.round(totalDolar * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes "+ simbolo + " " + totalDolar + " .");
        } else {
            double totalPesos = valor * fiat;
            totalPesos = (double) Math.round(totalPesos * 100d)/100;
            JOptionPane.showMessageDialog(null, "Tienes $ "+ totalPesos + " .");
        }
    }
}

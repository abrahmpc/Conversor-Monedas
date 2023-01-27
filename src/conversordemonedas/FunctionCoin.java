package conversordemonedas;

import javax.swing.JOptionPane;

public class FunctionCoin {
    
    ConvertirMonedas monedas = new ConvertirMonedas();
    
    public void ConvertirMonedas(double valor) {
        
        double dolar = 174.17;
        double euro = 185.25;
        double libra = 210.23;
        double yen = 1.31;
        double won = 0.14;
        
//        Ventana de opciones de monedas
        String opcion = (JOptionPane.showInputDialog(
                null,"Seleccione la moneda a la que desee convertir tu dinero", "Monedas", 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Pesos a Dólar", "Pesos a Euro", 
                    "Pesos a Libra", "Pesos a Yen", "Pesos a Won Coreano", "Dólar a Pesos", 
                    "Euro a Pesos", "Libra a Pesos", "Yen a Pesos", "Won Coreano a Pesos"}, 
                    "Seleccion")).toString();

        switch (opcion) {
            case "Pesos a Dólar":
                monedas.ConvertirDivisa(dolar, valor, true, "U$s");
            break;
            case "Pesos a Euro":
                monedas.ConvertirDivisa(euro, valor, true, "€");
            break;
            case "Pesos a Libra":
                monedas.ConvertirDivisa(libra, valor, true, "£");
            break;
            case "Pesos a Yen":
                monedas.ConvertirDivisa(yen, valor, true, "¥");
            break;
            case "Pesos a Won Coreano":
                monedas.ConvertirDivisa(won, valor, true, "₩");
            break;
            case "Dólar a Pesos":
                monedas.ConvertirDivisa(dolar, valor, false, "");
            break;
            case "Euro a Pesos":
                monedas.ConvertirDivisa(euro, valor, false, "");
            break;
            case "Libra a Pesos":
                monedas.ConvertirDivisa(libra, valor, false, "");
            break;
            case "Yen a Pesos":
                monedas.ConvertirDivisa(yen, valor, false, "");
            break;
            case "Won Coreano a Pesos":
                monedas.ConvertirDivisa(won, valor, false, "");
            break;
        }
    }

}

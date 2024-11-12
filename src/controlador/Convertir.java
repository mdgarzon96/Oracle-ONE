
package controlador;

/**
 *
 * @author Mitchel
 */
public class Convertir {
    
   
    
     public String Symbols(String currency) {
        switch (currency) {
            case "USD - Dólar estadounidense":
                return "USD";
            case "EUR - Euro":
                return "EUR";
            case "COP - Peso colombiano":
                return "COP";
            case "JPY - Yen Japonés":
                return "JPY";
            case "GPB - Libra Esterlina":
                return "GBP";
            case "KRW - Won surcoreano":
                return "KRW";
            default:
                return null;
        }
    }
}

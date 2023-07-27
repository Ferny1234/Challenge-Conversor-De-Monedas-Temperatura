package conversorDeMonedas;

import javax.swing.JOptionPane;

public class ProgramaMonedas {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos Mexicanos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos Mexicanos a Dólar":
        	monedas.ConvertirPesosADolares(Minput);
        	break;
        case "De Pesos Mexicanos a Euro":
        	monedas.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos Mexicanos a Libras":
        	monedas.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos Mexicanos a Yenes":
        	monedas.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos Mexicanos a Won Coreano":
        	monedas.ConvertirPesosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos Mexicanos":
        	pesos.ConvertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos Mexicanos":
        	pesos.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos Mexicanos":
        	pesos.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yenes a Pesos Mexicanos":
        	pesos.ConvertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos Mexicanos":
            pesos.ConvertirWonAPesos(Minput);
            break;
        }      
    }
        
}

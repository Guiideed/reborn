package utilid;

public class ConverteMoeda {
	 
	public static double IOF = 0.06;
	
	
	public static double converteValor(double valorDolar , double dolarAComprar) {
		return valorDolar * dolarAComprar *  (1.0+IOF) ;
		
	}
	
	
}
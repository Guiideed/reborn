package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area(){
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
	}
	
	public static String maiorArea(double area, double area2) {
		String maiorNum;
		if(area > area2) {
			maiorNum= "O maior triangulo é o X";
		}else {
			maiorNum="O maior pe o triangulo Y";
		}
		return "Então "+maiorNum;
	}
	
}

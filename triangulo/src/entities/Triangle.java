package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area(){
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
	}
	public void textoQualquer(){
		System.out.println("AAAAAAAAAAAAA");
	}
	
	public static String maiorArea(double area, double area2) {
		String maiorNum;
		if(area > area2) {
			maiorNum= "OOOOOOOOOO";
		}else {
			maiorNum="llllllllll";
		}
		return "Então "+maiorNum;
	}
	
}

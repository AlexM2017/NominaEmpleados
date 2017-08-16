package utils;

public class Calculadora {
	
	public static double suma( double a, double b ){
		return a+b;
	}
	
	public double suma( double a, double b, double c){
		return a+b+c;
	}
	
	public int suma( double a, double b, double c, double d ){
		return (int) (a+b+c+d);
	}
	
	public static double suma( double...parametros  ){
		
		double acumulado = 0;
		
		for (int i = 0; i < parametros.length; i++) {
			acumulado += parametros[i];
		}
		
		return acumulado;
		
	}

}
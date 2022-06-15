package entities;

public class Calculadora {
	
	public double Somar(double numero1, double numero2) {
		return numero1 + numero2;
	}

    public double Somar(double... numeros) {
		double total = numeros[0];
		for(int i = 1; i < numeros.length; i++){
		    total += numeros[i];
		}
		return total;
	}
	
    public double subtrair(double numero1, double numero2){
        return numero1 - numero2;
    }
    
    public double subtrair(double... numeros){
        double total = numeros[0];
		for(int i = 1; i < numeros.length; i++){
		    total -= numeros[i];
		}
		return total;
    }
    
    public double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }
	
	public double multiplicar(double... numeros){
	    double total = numeros[0];
		for(int i = 1; i < numeros.length; i++){
		    total *= numeros[i];
		}
		return total;
	}
	
	public double dividir(double numero1, double numero2){
	    return numero1 / numero2;
	}
	
	public double dividir(double... numeros){
	    double total = numeros[0];
		for(int i = 1; i < numeros.length; i++){
		    total /= numeros[i];
		}
		return total;
	}
}
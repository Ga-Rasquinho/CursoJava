package entities;

public class Calculadora2 {
	   private int x1;
	   private int x2;
	   
	public Calculadora2() {		
	}
	
	public Calculadora2(int x1, int x2) {
	    this.x1 = x1;
	    this.x2 = x2;
	}
	public int getX1() {
	    return x1;
	}
	public void setX1(int x1) {
	    this.x1 = x1;
	}
	public int getX2() {
	    return x2;
	}
	public void setX2(int x2) {
	    this.x2 = x2;
	}

	public int somar(int x1, int x2) {
	    return x1 + x2;
	}
	
	public int somar(int... x) {
		int total = x[0];
		for(int i = 1; i < x.length; i++) {
			total += x[i];
		}
		return total;
	}
	
	
}

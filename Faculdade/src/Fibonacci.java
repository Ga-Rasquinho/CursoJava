
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 100, f1 = 0, f2 = 1, f3;
		
		System.out.println("0");
		System.out.println("1");
		
		while(f2 < numero) {
			f3 = f2 + f1;
			if(f3 < 100) {
			System.out.println("" + f3);
			}
			f1 = f2;
			f2 = f3;
		}
	}

}

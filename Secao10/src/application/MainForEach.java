package application;

import java.util.Locale;

public class MainForEach {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(String obj: vect) {
			System.out.println(obj);
		}
//		O código acima possui a mesma função que esse código: 
//		for(int i = 0; i < vect.length; i ++) {
//		System.out.println(vect[i]);
//	}
	}

}

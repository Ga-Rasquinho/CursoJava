import java.util.Arrays;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int[3][];
		int[] linha = {9,10,8};
		int contador = 1;
		for(int i = 0; i < 3; i++) {
			a[i] = new int[linha[i]];
			for(int j = 0; j < a[i].length; j++, contador++) {
				a[i][j] = contador;
			}
			System.out.println(Arrays.toString(a[i]));
		}	
	}
}

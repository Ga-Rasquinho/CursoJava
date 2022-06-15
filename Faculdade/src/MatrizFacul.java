
public class MatrizFacul {

	public static void main(String[] args) {

		int[][] matriz = new int[8][];
		int[] tamanho = {0, 1, 2, 3, 4, 5, 6, 7};
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			if (i == 0) {
				System.out.println("null");
				continue;
			}
			System.out.print("[");
			matriz[i] = new int[tamanho[i]];
			for (int j = 0; j < matriz[i].length; j++) {
				count++;
				matriz[i][j] = count;
				System.out.print(count + (j == matriz[i].length - 1 ? "" : ", "));
			}
			System.out.println("]");
		}
	}

}
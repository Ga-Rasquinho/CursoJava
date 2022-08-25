package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulandoArquivosExercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho: ");
		String strPath = sc.nextLine();

		boolean sucess = new File(strPath + "\\subdir").mkdir();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		System.out.print("\nDigite o caminho com o nome do arquivo que deseja criar: ");
		strPath = sc.nextLine();

		String[] nomes = new String[] { "Jorge", "Renato", "Matheus" };
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))) {
			for (String nome : nomes) {
				bw.write(nome);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}

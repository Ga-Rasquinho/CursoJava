package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import services.LogEntry;

public class ExercicioResolvidoSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String path = "D:\\Curso-Java\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				System.out.println(username + " " + moment);
				set.add(new LogEntry(username, moment));

				line = br.readLine();

			}
			System.out.println();
			System.out.println("Total user: " + set.size());
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}

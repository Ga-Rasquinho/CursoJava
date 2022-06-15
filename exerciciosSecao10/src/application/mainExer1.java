package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Reserva;

public class mainExer1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Reserva[] vect = new Reserva[10];

		System.out.print("How many rooms will be rented? ");
		var rent = sc.nextInt();
		
		var quantRent = 0;
		for (var i = 0; i < rent; i++) {
			sc.nextLine();
			quantRent++;
			System.out.println("Rent #" + quantRent);
			System.out.print("Name: ");
			var name = sc.nextLine();
			System.out.print("Email: ");
			var email = sc.nextLine();
			System.out.print("Room: ");
			var room = sc.nextInt();
			vect[room] = new Reserva(name, email, room);
		}

		System.out.println("Busy rooms: ");
		for	(var i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " +vect[i].getName() + ", " + vect[i].getEmail());	
			}			
		}
		sc.close();
	}

}

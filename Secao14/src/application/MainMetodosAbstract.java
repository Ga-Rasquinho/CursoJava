package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class MainMetodosAbstract {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		var n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Cicle (r/c)? ");
			var ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			var color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				var width = sc.nextDouble();
				System.out.print("Height: ");
				var height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				var radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		sc.close();
	}

}

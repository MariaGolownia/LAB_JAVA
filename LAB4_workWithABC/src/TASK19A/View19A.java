package TASK19A;

import java.util.Scanner;

public class View19A {
	public static void main(String[] args) {
		double number1 = 0;
		double number2 = 0;
		double number3 = 0;
		String str = "";
		
		System.out.println("Enter three numbers through a space: ");
		
		try {
		Scanner scanner = new Scanner (System.in);
		str = scanner.nextLine().trim();
		String [] stringArray = new String [3];
		stringArray = str.split(" ");
		number1 = Integer.parseInt(stringArray[0]);
		number2 = Integer.parseInt(stringArray[1]);
		number3 = Integer.parseInt(stringArray[2]);
		System.out.println("\"This triangle is a right triangle and isosceles" + "\". This statement is " + Logic19A.isRectangularAndIsosceles(number1, number2, number3) +".");	
		}
		catch (Exception e){System.out.println("Error! Try again!");}
		
	}

}

package application;

import entities.Printer;
import entities.Scanner;

public class Program {
	
	public static void main(String args[]) {
		
		Printer printer = new Printer("1080");
		printer.processDoc("My Letter");
		printer.print("My Letter");
		
		Scanner scanner = new Scanner("2003");
		scanner.processDoc("My Email");
		System.out.println("Scan result: " + scanner.scan());
		
	}

}

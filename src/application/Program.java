package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program {
	
	public static void main(String args[]) {
		
		ConcretePrinter printer = new ConcretePrinter("1080");
		printer.processDoc("My Letter");
		printer.print("My Letter");
		
		ConcreteScanner scanner = new ConcreteScanner("2003");
		scanner.processDoc("My Email");
		System.out.println("Scan result: " + scanner.scan());
		
		ComboDevice comboDevice = new ComboDevice("2080");
		comboDevice.processDoc("My dissertation");
		comboDevice.print("My dissertation");
		System.out.println("Scan result: " + comboDevice.scan());
	}

}

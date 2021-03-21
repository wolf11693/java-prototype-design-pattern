package com.ra.pattern.prototype.client;

import com.ra.pattern.prototype.ComputerType;
import com.ra.pattern.prototype.Desktop;
import com.ra.pattern.prototype.Laptop;
import com.ra.pattern.prototype.Server;
import com.ra.pattern.prototype.factory.ComputerPrototypeFactory;
import com.ra.pattern.prototype.factory.ComputerPrototypeFactoryImpl;

public class MainApp {

	public static void main(String[] args) throws Exception {
		ComputerPrototypeFactory computerPrototypeFactory = new ComputerPrototypeFactoryImpl();
		
		Desktop desktop1 = (Desktop) computerPrototypeFactory.getComputerProtype(ComputerType.DESKTOP);
		System.out.println(desktop1);
		Desktop desktop2 = (Desktop) computerPrototypeFactory.getComputerProtype(ComputerType.DESKTOP);
		System.out.println(desktop2);
		Desktop desktop3 = (Desktop) computerPrototypeFactory.getComputerProtype(ComputerType.DESKTOP);
		System.out.println(desktop3);
		Desktop desktop4 = (Desktop) computerPrototypeFactory.getComputerProtype(ComputerType.DESKTOP);
		System.out.println(desktop4);
		
		Laptop laptop1 = (Laptop) computerPrototypeFactory.getComputerProtype(ComputerType.LAPTOP);
		System.out.println(laptop1);
		Laptop laptop2 = (Laptop) computerPrototypeFactory.getComputerProtype(ComputerType.LAPTOP);
		System.out.println(laptop2);
		Laptop laptop3 = (Laptop) computerPrototypeFactory.getComputerProtype(ComputerType.LAPTOP);
		System.out.println(laptop3);

		Server server1 = (Server) computerPrototypeFactory.getComputerProtype(ComputerType.SERVER);
		System.out.println(server1);
		Server server2 = (Server) computerPrototypeFactory.getComputerProtype(ComputerType.SERVER);
		System.out.println(server2);
	}

}

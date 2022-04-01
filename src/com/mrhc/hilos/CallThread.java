package com.mrhc.hilos;

public class CallThread {

	public static void main(String[] args) {
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println("Proceso 1");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Proceso 2");
		}
		*/
		
		HiloClass hiloClass = new HiloClass();
		//hiloClass.setName("Uno");
		
		HiloClass hiloClass1 = new HiloClass();
		//hiloClass1.setName("Dos");
		
		Thread hiloInterface = new Thread(new HiloInterface("tres"));
		Thread hiloInterface1 = new Thread(new HiloInterface("cuatro"));
		
		hiloClass.start();
		hiloClass1.start();
		hiloInterface.start();
		hiloInterface1.start();
	}
}

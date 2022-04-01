package com.mrhc.hilos;

public class HiloInterface implements Runnable{
	
	protected String nombre; 
	
	public HiloInterface(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(nombre);
		}
	}
	
}

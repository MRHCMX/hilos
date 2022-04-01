package com.mrhc.hilos;

public class HiloClass extends Thread{
	
	String nombre;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName());
		}
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

/**
 * 
 */
package com.nttdata.bootcamp.patrones.builder;

/**
 * @author fmarcoss
 *
 */
public class Puerta {
	private int numeroPuertas;
	
	public Puerta(int numeroPuerta) {
		this.numeroPuertas=numeroPuerta;
	}

	/**
	 * @return the numeroPuertas
	 */
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	/**
	 * @param numeroPuertas the numeroPuertas to set
	 */
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

}

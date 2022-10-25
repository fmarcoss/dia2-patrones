/**
 * 
 */
package com.nttdata.bootcamp.patrones.builder;

/**
 * @author fmarcoss
 *
 */
public class CasaBuilder implements Builder {
	private Puerta puerta;
	private Pared pared;
	private Tejado tejado;
	
	public void setPuerta(Puerta puerta) {
		this.puerta=puerta;
		
	}
	
	public void setTejado(Tejado tejado) {
		this.tejado=tejado;
	}
	
	public void setPared(Pared pared) {
		this.pared=pared;
	}
	
	
	public Casa getResult() {
		return new Casa(puerta,tejado,pared);
	}

}

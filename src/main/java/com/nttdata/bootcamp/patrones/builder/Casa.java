package com.nttdata.bootcamp.patrones.builder;

public class Casa {
	private final Tejado tejado;
	private final Pared pared;
	private final Puerta puerta;
	
		public Casa(Tejado tejado, Pared pared, Puerta puerta) {
			this.tejado=tejado;
			this.pared=pared;
			this.puerta=puerta;
			
		}

		public Casa(Puerta puerta, Tejado tejado, Pared pared) {
			this.puerta=puerta;
			this.tejado=tejado;
			this.pared=pared;
		}

		/**
		 * @return the tejado
		 */
		public Tejado getTejado() {
			return tejado;
		}

		/**
		 * @return the pared
		 */
		public Pared getPared() {
			return pared;
		}

		/**
		 * @return the puerta
		 */
		public Puerta getPuerta() {
			return puerta;
		}
}

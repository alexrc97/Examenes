package trimestre2.POO1;

public class coche {
	
		private int cantidad_combustible = 5;
		private int consumo = 7;
		public int getCantidad_combustible() {
			return cantidad_combustible;
		}
		public void setCantidad_combustible(int cantidad_combustible) {
			this.cantidad_combustible = cantidad_combustible;
		}
		public int getConsumo() {
			return consumo;
		}
		public void setConsumo(int consumo) {
			this.consumo = consumo;
		}
		public int autonomia () {
			return (cantidad_combustible/consumo)*100;
		}
		
		public static void main(String[] args) {
			coche coche1 = new coche();
			coche1.setCantidad_combustible(14);
			coche1.setConsumo(14);
			System.out.println(coche1.autonomia());
			coche coche2 = new coche();
			coche2.setConsumo(5);
			System.out.println("Si el consumo es: " +coche2.getConsumo() + 
					" la autonomia sera: " + coche2.autonomia());
		}
	}
	


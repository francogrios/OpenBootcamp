public class Ejercicio8_IntProgramación__OB {
	
	public static void main(String[] args) {
		
		Persona miPersona = new Persona();
		miPersona.setEdad(30);
		miPersona.setNombre("Frank");
		miPersona.setTelefono(118931712);
		
		System.out.println("Mi nombre es " + miPersona.getNombre() + " y tengo " + miPersona.getEdad() + " anos. Mi numero de telefono es " + miPersona.getTelefono());
	}
}
	
	class Persona {
		
		private int edad = 0;
		private String nombre;
		private int telefono;
		
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
}

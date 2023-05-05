
public class Ejercicio9_IntProgramación__OB {
	
	public static void main(String[] args) {
		
		Cliente Cliente = new Cliente();
		Cliente.setNombre("Frank");
		Cliente.setEdad(23);
		Cliente.setTelefono(118943567);
		Cliente.setCredito(131000);
		
		System.out.println("Mi nombre es " + Cliente.getNombre() + " tengo " + Cliente.getEdad() + " anos. Este es mi numero "
				+ " de telefono " + Cliente.getTelefono() + "." + " Me otorgaron un credito de " + Cliente.getCredito() + " dolares.");
		
		Trabajador Trabajador = new Trabajador();
		
		Trabajador.setNombre("Gabriel");
		Trabajador.setEdad(25);
		Trabajador.setTelefono(338541273);
		Trabajador.setSalario(2500);
		
		System.out.println("Mi nombre es " + Trabajador.getNombre() + " tengo " + Trabajador.getEdad() + 
				" años. Este es mi numero de telegono " + Trabajador.getTelefono() + "." + " Tengo un salario de "
				+ Trabajador.getSalario() + " dolares.");
		
		
	}

}

class Persona {
	private int edad;
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

class Cliente extends Persona {
	private double credito;

	public double getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
}

class Trabajador extends Persona {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
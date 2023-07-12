package entidad;

import java.util.Scanner;

public class Cliente {

	private int id;
	private String nombre;
	private int edad;
	private double altura;
	private double peso;
	private String objetivo;
	

	public Cliente() {
		
	}

	public Cliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.objetivo = objetivo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura2) {
		this.altura = altura2;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@Override
	public String toString() {
		return "Cliente "
				+ "[id=" + id + 
				"nombre=" + nombre + 
				", edad=" + edad + 
				", altura=" + altura + 
				", peso=" + peso +
				", objetivo=" + objetivo + "]";
	}
	
	public Cliente crearCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el id del usuario");
		int id = sc.nextInt();
		System.out.println("Ingrese el nombre del usuario");
		String nombre = sc.next();
		System.out.println("Ingrese la edad del usuario");
		int edad = sc.nextInt();
		System.out.println("Ingrese la altura del usuario");
		double altura = sc.nextDouble();
		System.out.println("Ingrese el peso del usuario");
		double peso = sc.nextDouble();
		System.out.println("Ingrese el objetivo del usuario");
		String objetivo = sc.next();
		Cliente cliente = new Cliente(id,nombre,edad,altura,peso,objetivo);
		
		return cliente;
	}
	
}

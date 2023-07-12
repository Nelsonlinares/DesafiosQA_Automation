package entidad;

import java.util.Scanner;

public class Rutina {

	private int id;
	private String nombre;
	private int duracion;
	private String nivelDificultad;
	private String descripcion;
	
	
	
	public Rutina() {
	}

	public Rutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
		this.nivelDificultad = nivelDificultad;
		this.descripcion = descripcion;
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

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(String nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Rutina [id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", nivelDificultad="
				+ nivelDificultad + ", descripcion=" + descripcion + "]";
	}
	
	public Rutina crearRutina() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el id de la rutina");
		int id = sc.nextInt();
		System.out.println("Ingrese el nombre de la rutina");
		String nombre = sc.next();
		System.out.println("Ingrese la duración de la rutina");
		int duracion = sc.nextInt();
		System.out.println("Ingrese el nivel de dificultad de la rutina");
		String nivelDificultad = sc.next();
		System.out.println("Ingrese la descripción de la rutina");
		String descripcion = sc.next();
		Rutina rutina = new Rutina(id,nombre,duracion,nivelDificultad,descripcion);
		return rutina;
	}
	
}

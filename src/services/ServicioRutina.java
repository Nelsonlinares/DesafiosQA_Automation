package services;

import java.util.ArrayList;
import java.util.List;

import entidad.Rutina;

public class ServicioRutina {

	private List<Rutina> listaRutinas;

	public ServicioRutina() {
		this.listaRutinas = new ArrayList<Rutina>();
	}

	public List<Rutina> getListaRutinas() {
		return listaRutinas;
	}

	public void setListaRutinas(List<Rutina> listaRutinas) {
		this.listaRutinas = listaRutinas;
	}
	
	//CRUD
	
	//Create
	public void crearRutina(Rutina rutina) {
		listaRutinas.add(rutina);
	}
	
	//Read
	public void obtenerRutinas() {
		for (Rutina rutina: listaRutinas) {
			System.out.println(rutina);
		}
	}
	
	//Update
	public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
		boolean existe = false;
		for (Rutina rutina: listaRutinas) {
			if (rutina.getId()== id) {
				rutina.setNombre(nombre);
				rutina.setDuracion(duracion);
				rutina.setNivelDificultad(nivelDificultad);
				rutina.setDescripcion(descripcion);
				existe = true;
				System.out.println("La rutina ha sido actualizada");
		}
			if (existe == false) {
				System.out.println("No se ha encontrado una rutina con el id ingresado");
		}
		}	
	}
	
	//Delete
	public void eliminarRutina(int id) {
		boolean existe = false;
		Rutina rutinaEliminada = null;
		for (Rutina rutina: listaRutinas) {
			if (rutina.getId()== id) {
				existe = true;
				rutinaEliminada = rutina;
				System.out.println("La rutina ha sido eliminada del sistema");
			}
		}
		if (existe == true) {
			listaRutinas.remove(rutinaEliminada);
		} else {
			System.out.println("No existe una rutina con el id ingresado");
		}
		
	}
	
}

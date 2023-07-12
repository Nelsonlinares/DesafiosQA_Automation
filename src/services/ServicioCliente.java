package services;

import java.util.ArrayList;
import java.util.List;

import entidad.Cliente;
import entidad.Rutina;

public class ServicioCliente {

	private List<Cliente> listaClientes;
	
	public ServicioCliente() {
		this.listaClientes = new ArrayList<Cliente>();
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	//CRUD
	
	//Create
	public void registarClientes(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	//Read
	public void obtenerClientes() {
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
	}
	
	//Update
	public void actualizarCliente(int id, String nombre, int edad, double altura,  double peso, String objetivo) {
		boolean existe = false;
		for (Cliente cliente : listaClientes) {
			if (cliente.getId()== id) {
				cliente.setNombre(nombre);
				cliente.setEdad(edad);
				cliente.setAltura(altura);
				cliente.setPeso(peso);
				cliente.setObjetivo(objetivo);
				existe = true;
				System.out.println("Los datos del cliente han sido actualizados");
			}
			if (existe == false) {
					System.out.println("No se ha encontrado un cliente con el id ingresado");
			}
		}
	}
	
	
	//Delete
	public void eliminarCliente(int id) {
		boolean existe = false;
		Cliente clienteEliminado = null;
		for (Cliente cliente : listaClientes) {
			if (cliente.getId()== id) {
				clienteEliminado = cliente;
				existe = true;
				System.out.println("El cliente ha sido eliminado del sistema");
			} 
			if (existe == true) {
				listaClientes.remove(clienteEliminado);
			} else {
				System.out.println("No existe un cliente con el id ingresado");
			}
		}
	}
	
	
}

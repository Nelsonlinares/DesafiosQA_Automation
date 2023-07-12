package main;

import entidad.Cliente;
import entidad.Rutina;
import services.ServicioCliente;
import services.ServicioRutina;

public class Main {

	public static void main(String[] args) {
	
	Cliente cliente = new Cliente();
	Rutina rutina = new Rutina();
	ServicioCliente servCliente = new ServicioCliente();
	ServicioRutina servRutina = new ServicioRutina();
	//Crear 5 clientes aleatorios
	Cliente cliente1 = cliente.crearCliente();
	Cliente cliente2 = cliente.crearCliente();
	/*Cliente cliente3 = cliente.crearCliente();
	Cliente cliente4 = cliente.crearCliente();
	Cliente cliente5 = cliente.crearCliente();*/
	
	//Crear 5 rutinas aleatorias
	Rutina rutina1 = rutina.crearRutina();
	Rutina rutina2 = rutina.crearRutina();
	/*Rutina rutina3 = rutina.crearRutina();
	Rutina rutina4 = rutina.crearRutina();
	Rutina rutina5 = rutina.crearRutina();*/
	
	//Registar los clientes en el sistema
		servCliente.registarClientes(cliente1);
		servCliente.registarClientes(cliente2);
		/*servCliente.registarClientes(cliente3);
		servCliente.registarClientes(cliente4);
		servCliente.registarClientes(cliente5);*/
	
	//Agregar las rutinas al sistema
		servRutina.crearRutina(rutina1);
		servRutina.crearRutina(rutina2);
		/*servRutina.crearRutina(rutina3);
		servRutina.crearRutina(rutina4);
		servRutina.crearRutina(rutina5);*/
		
	//Obtener los clientes agregados al sistema
		servCliente.obtenerClientes();
		
	//Obtener las rutinas agregadas al sistema
		servRutina.obtenerRutinas();
		
	//Realizar la actualización de clientes
		servCliente.actualizarCliente(1, "Diego", 40, 190, 56, "Marcar abdomen");
		
	//Realizar la actualización de rutinas
		servRutina.actualizarRutina(1, "Antebrazos", 30, "4", "Corta duración");
		
	//Eliminar cliente y mostrar la nueva lista
		servCliente.eliminarCliente(1);
		servCliente.obtenerClientes();
		
	//Eliminar rutina y mostrar la nueva lista
		servRutina.eliminarRutina(1);
		servRutina.obtenerRutinas();;
	}
	
}

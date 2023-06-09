package sprintfinal;

import java.time.LocalTime;
import java.util.Scanner;

//Sprint final modulo 4

/**
 * 
 * Clase main, definida para generar instancias que son requeridas en la clase contenedor ademas de un menu de interacción con el usuario. 
 * @autor Lino Cortes
 * @autor Sergio Morales
 * @autor Felipe Toro
 * @autor Pedro Urbina
 * 
 */


public class Main {
	/**
	 * Método principal de ejecucion del despliegue del menu e ingreso de datos.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cliente cliente;
		Profesional profesional;
		Capacitacion capacitacion;
		Administrativo administrativo;
		/*
		 * Se llama una nueva instancia de Contenedor 
		 */
		Contenedor contenedor = new Contenedor();
		/**
		 * Atributo String nombre de un usuario
		 */
		String nombre;
		/**
		 * Atributo String con apellido de un usuario
		 */
		String apellido;
		/**
		 * Atributo String con el tipo usuario (Cliente, Administrativo, Profesional)
		 */
		String tipoUsuario;
		/**
		 * Atributo String telefono del usuario
		 */
		String telefono;
		/**
		 * Atributo String direccion del usuario
		 */
		String direccion;
		/**
		 * Atributo String comuna del usuario
		 */
		String comuna;
		/**
		 * Atributo String Afp del usuario
		 */
		String afp;
		/**
		 * Atributo String rut de la capacitacion
		 */
		String rutCapacitacion;
		/**
		 * Atributo String dia de la capacitacion
		 */
		String diaCapacitacion;
		/**
		 * Atributo String duracion de la capacitacion
		 */
		String duracionCapacitacion;
		/**
		 * Atributo String lugar de la capacitacion
		 */
		String lugarCapacitacion;
		/**
		 * Atributo String titulo de profesional
		 */
		String titulo;
		/**
		 * Atributo String area de administrativo
		 */
		String area;
		/**
		 * Atributo String experiencia del administrativo
		 */
		String experienciaPrevia;
		
		
		/**
		 * Atributo LocalTime hora de la capacitacion
		 */
		LocalTime horaCapacitacion;
		/**
		 * Atributo entero opcion del menu
		 */
		int opcion;
		/**
		 * Atributo entero rut capacitacion
		 */
		int rut;
		/**
		 * Atributo entero dia
		 */
		int dia;
		/**
		 * Atributo entero mes
		 */
		int mes;
		/**
		 * Atribuyo entero anio
		 */
		int anio;
		/**
		 * Atributo entero run usuario
		 */
		int run;
		/**
		 * Atributo entero sistema de salud 1 fonasa, 2 isapre
		 */
		int sistemaSalud;
		/**
		 * Atributo entero edad
		 */
		int edad;
		/**
		 * Atributo entero identificador
		 */
		int identificador;
		/**
		 * Atributo entero cantidad de asistentes
		 */
		int cantidadAsistentes;
		
		
		/**
		 * Despliega el menu
		 */
		opcion=desplegarMenu();
		
		do {
			switch(opcion) {
			case 1:
				cliente=new Cliente();
				System.out.println("Almacenando cliente");
				System.out.println("Ingrese un nombre");
				nombre=sc.nextLine();
				cliente.setNombre(nombre);
				System.out.println("Ingrese un apellido");
				apellido=sc.nextLine();
				cliente.setApellido(apellido);
				System.out.println("Ingrese un run en formato númerico");
				run=sc.nextInt();
				sc.nextLine();
				cliente.setRun(run);
				System.out.println("Fecha de nacimiento");
				System.out.println("Ingrese un día (1-31)");
				dia=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese un mes (1-12)");
				mes=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese un anio (mayor a 0)");
				anio=sc.nextInt();
				sc.nextLine();
				cliente.setFechaNacimiento(dia,mes,anio);
				System.out.println("Ingrese el rut del cliente en formato númerico");
				rut = sc.nextInt();
				sc.nextLine();
				cliente.setRut(rut);
				System.out.println("Ingrese un teléfono");
				telefono=sc.nextLine();
				cliente.setTelefono(telefono);
				System.out.println("Ingrese AFP");
				afp=sc.nextLine();
				cliente.setAfp(afp);
				System.out.println("Ingrese sistema de salud (1 Fonasa 2 Isapre)");
				sistemaSalud=sc.nextInt();
				sc.nextLine();
				cliente.setSistemaSalud(sistemaSalud);
				System.out.println("Ingrese dirección");
				direccion=sc.nextLine();
				cliente.setDireccion(direccion);
				System.out.println("Ingrese una comuna");
				comuna=sc.nextLine();
				cliente.setComuna(comuna);
				System.out.println("Ingrese una edad (valor numérico)");
				edad=sc.nextInt();
				sc.nextLine();
				cliente.setEdad(edad);
				contenedor.almacenarCliente(cliente);
				opcion=desplegarMenu();
				break;
			case 2:
				profesional = new Profesional();
				System.out.println("Almacenando profesional");
				System.out.println("Ingrese un nombre");
				nombre=sc.nextLine();
				profesional.setNombre(nombre);
				System.out.println("Ingrese un apellido");
				apellido=sc.nextLine();
				profesional.setApellido(apellido);
				System.out.println("Ingrese un run en formato númerico");
				run=sc.nextInt();
				profesional.setRun(run);
				sc.nextLine();
				System.out.println("Fecha de nacimiento");
				System.out.println("Ingrese un día (1-31)");
				dia=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese un mes (1-12)");
				mes=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese un año (mayor a 0)");
				anio=sc.nextInt();
				sc.nextLine();
				profesional.setFechaNacimiento(dia,mes,anio);
				System.out.println("Ingrese el título del profesional");
				titulo=sc.nextLine();
				profesional.setTitulo(titulo);
				System.out.println("Ingrese la fecha de ingreso del profesional");
				System.out.println("Ingrese el día (1-31)");
				dia=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese el mes (1-12)");
				mes=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese el anio (mayor a 0)");
				anio=sc.nextInt();
				sc.nextLine();
				profesional.setFechaIngreso(dia,mes,anio);
				contenedor.almacenarProfesional(profesional);
				opcion=desplegarMenu();
				break;
			case 3:
				administrativo = new Administrativo();
				System.out.println("Almacenando administrativo");
				System.out.println("Ingrese un nombre");
				nombre=sc.nextLine();
				administrativo.setNombre(nombre);
				System.out.println("Ingrese un apellido");
				apellido=sc.nextLine();
				administrativo.setApellido(apellido);
				System.out.println("Ingrese un rut en formato númerico");
				run=sc.nextInt();
				sc.nextLine();
				administrativo.setRun(run);
				System.out.println("Fecha de nacimiento");
				System.out.println("Ingrese un día (1-31)");
				dia=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese un mes (1-12)");
				mes=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese un anio (mayor a 0)");
				anio=sc.nextInt();
				sc.nextLine();
				administrativo.setFechaNacimiento(dia,mes,anio);
				System.out.println("Ingrese el Area");
				area=sc.nextLine();
				administrativo.setArea(area);
				System.out.println("Ingrese la Experiencia Previa");
				experienciaPrevia=sc.nextLine();
				administrativo.setExperienciaPrevia(experienciaPrevia);
				contenedor.almacenarAdministrativo(administrativo);
				opcion=desplegarMenu();
				break;
			case 4:
				capacitacion=new Capacitacion();
				System.out.println("Almacenando capacitación");
				System.out.println("Ingrese un identificador númerico para la capacitación");
				identificador=sc.nextInt();
				sc.nextLine();
				capacitacion.setIdentificador(identificador);
				System.out.println("Ingrese el rut (valor numérico)");
				rutCapacitacion=sc.nextLine();
				capacitacion.setRut(rutCapacitacion);
				System.out.println("Ingrese el día de la capacitación (Lunes, Martes, Miércoles, Jueves, Viernes, Sábado o Domingo)");
				diaCapacitacion=sc.nextLine();
				capacitacion.setDia(diaCapacitacion);
				System.out.println("Ingrese a que hora es la capacitación (hh:mm)");
				horaCapacitacion=LocalTime.parse(sc.nextLine());
				capacitacion.setHora(horaCapacitacion);
				System.out.println("Ingrese lugar de la capacitación");
				lugarCapacitacion=sc.nextLine();
				capacitacion.setLugar(lugarCapacitacion);
				System.out.println("Ingrese la duracion de la capacitacion en minutos (valor númerico)");
				duracionCapacitacion=sc.nextLine();
				capacitacion.setDuracion(duracionCapacitacion);
				System.out.println("Ingrese la cantidad de asistentes a la capacitación (valor numérico)");
				cantidadAsistentes=sc.nextInt();
				sc.nextLine();
				capacitacion.setCantidadAsistentes(cantidadAsistentes);
				contenedor.almacenarCapacitacion(capacitacion);
				opcion=desplegarMenu();
				break;
			case 5:
				System.out.println("Ingrese un rut para eliminar (valor numérico)");
				run=sc.nextInt();
				sc.nextLine();
				contenedor.eliminarUsuario(run);
				opcion=desplegarMenu();
				break;
			case 6:
				System.out.println("Listando usuarios");
				contenedor.listarUsuarios();
				opcion=desplegarMenu();
				break;
			case 7:
				System.out.println("Ingrese un tipo de usuario (Cliente, Profesional o Administrativo)");
				tipoUsuario=sc.nextLine();
				contenedor.listarUsuarioPorTipo(tipoUsuario);
				opcion=desplegarMenu();
				break;
			case 8:
				System.out.println("Listando capacitaciones");
				contenedor.listarCapacitaciones();
				opcion=desplegarMenu();
				break;
			case 9:
				System.out.println("Finalizando programa");
				sc.close();
				System.exit(0);
		}
		} while (opcion!=9);
	}
	
	/**
	 * 
	 * Métdo estatico que despliega en consola el menú.
	 * @return De tipo entero, retorna la opción del menu al cual deseamos acceder. 
	 * 
	 */
	private static int desplegarMenu() {
		Scanner sc=new Scanner(System.in);
		int opcion;

		System.out.println("----------MENU PRINCIPAL----------\n");
		System.out.println("1- Almacenar cliente");
		System.out.println("2- Almacenar profesional");
		System.out.println("3- Almacenar administrativo");
		System.out.println("4- Almacenar capacitación");
		System.out.println("5- Eliminar usuario");
		System.out.println("6- Listar usuarios");
		System.out.println("7- Listar usuarios por tipo");
		System.out.println("8- Listar capacitaciones");
		System.out.println("9- Salir");
		System.out.println("Ingrese una opción:");
		opcion=sc.nextInt();
		sc.nextLine();
		return opcion;
	}

}
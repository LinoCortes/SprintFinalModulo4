package sprintfinal;

import java.time.LocalDate;

/**
 * 
 * Clase Cliente, genera objeto de tipo cliente que extiende de usuario,
 * constructor vacio y con parámetros  y métodos setter con sus respectivas validaciones y getter.  
 * 
 */
public class Cliente extends Usuario{
	/**
	 * Atributo String correspondientes al telefono del cliente
	 */
	private String telefono;
	/**
	 * Atributo String correspondiente a la AFP del cliente
	 */
	private String afp;
	/**
	 * Atributo String correspondiente a la dirección del cliente
	 */
	private String direccion;
	/**
	 * Atributo String correspondiente a la comuna del cliente
	 */
	private String comuna;
	/**
	 * Atributo entero correspondiente al sistema de salud del cliente
	 */
	private int sistemaSalud;
	/**
	 * Atributo entero correspondiente a la edad del cliente
	 */
	private int edad;
	/**
	 * Atributo entero correspondiente al rut del cliente
	 */
	private int rut;
	
	/**
	 * Constructor de cliente vacío
	 */
	public Cliente () {
		
	}
	/**
	 * Constructor de cliente con todos los atributos de la clase como parámetros
	 * @param nombre Variable String que almacena el nombre
	 * @param apellido De tipo String, almacena el apellido
	 * @param fechaNacimiento De tipo LocalDate, almacena la fecha de nacimiento
	 * @param run De tipo entero, corresponde al run del usuario 
	 * @param rut De tipo entero, corresponde al rut del cliente
	 * @param telefono De tipo String, corresponde al telefono del cliente
	 * @param afp De tipo String, almacena la afp del cliente
	 * @param sistemaSalud De tipo entero, almacena el sistema de salud del cliente (1 Fonasa, 2 Isapre)
	 * @param direccion De tipo String, almacena la dirección del cliente
	 * @param comuna De tipo String, almacena la comuna del cliente 
	 * @param edad De tipo entero, almacena la edad del cliente
	 */
	public Cliente(String nombre, String apellido, LocalDate fechaNacimiento,int run,int rut, String telefono,
			String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombre, apellido, fechaNacimiento,run);
		this.telefono=telefono;
		this.afp=afp;
		this.direccion=direccion;
		this.comuna=comuna;
		this.edad=edad;
		this.rut=rut;
	}
	/**
	 * Método que retorna el teléfono del cliente
	 * @return retorna el teléfono del cliente
	 * 	 
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * Método que modifica el atributo teléfono del cliente
	 * @param telefono recibe el teléfono para modificar el atributo del cliente 
	 */
	public void setTelefono(String telefono) {
		while(telefono.isEmpty()) {
			System.out.println("Favor Ingrese un teléfono válido");
			telefono = sc.nextLine();
		}
	}
	/**
	 * Método que retorna la AFP del cliente
	 * @return retorna la AFP del cliente
	 */
	public String getAfp() {
		return afp;
	}
	/**
	 * Método que modifica el atributo AFP del cliente
	 * @param afp De tipo String, almacena la nueva AFP del cliente 
	 */
	public void setAfp(String afp) {
		while (afp.length()<4 || afp.length()>30) {
			System.out.println("Afp debe tener minimo 4 caracteres y maximo 30");
			afp = sc.nextLine();
		}
		this.afp=afp;
	}
	/**
	 * Método que retorna la dirección del cliente
	 * @return Retorna la dirección del cliente
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Método que modifica la dirección del cliente validando que tenga 70 caracteres como máximo
	 * @param direccion De tipo String, almacena la nueva dirección del cliente
	 */
	public void setDireccion(String direccion) {
		while(direccion.length()>70) {
			System.out.println("Direccion debe tener como maximo 70 caracteres");
			direccion = sc.nextLine();
		}
		this.direccion = direccion;
	}
	/**
	 * Método que retorna la comuna del cliente
	 * @return Retorna un String con la comuna del cliente 
	 */
	public String getComuna() {
		return comuna;
	}
	/**
	 * Método que modifica la comuna del cliente validando que no tenga más de 50 caracteres
	 * @param comuna De tipo String, almacena la nueva dirección del cliente
	 */
	public void setComuna(String comuna) {
		while(comuna.length()>50) {
			System.out.println("Comuna debe tener como maximo 50 caracteres");
			comuna = sc.nextLine();
		}
		this.comuna = comuna;
	}
	/**
	 * Método que retorna el sistema de salud del cliente
	 * @return Retorna entero que almacena el sistema de salud del cliente
	 */
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	/**
	 * Método que modifica el sistema de salud del cliente validando que el número sea 1 o 2
	 * @param sistemaSalud De tipo int, almacena el nuevo sistema de salud del cliente
	 */
	public void setSistemaSalud(int sistemaSalud) {
		while(sistemaSalud != 1 && sistemaSalud != 2) {
			System.out.println("Debe ingresar opcion 1 para fonasa o 2 para isapre");
			sistemaSalud=sc.nextInt();
		}
		this.sistemaSalud= sistemaSalud;
	}
	/**
	 * Método que retorna la edad del cliente
	 * @return Retorna entero que almacena la edad del cliente
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Método que modifica la edad del cliente validando que esta se encuentre entre 0 y 150
	 * @param edad De tipo int, almacena la nueva edad del cliente
	 */
	public void setEdad(int edad) {
		while (edad < 0 || edad > 150) {
			System.out.println("Edad debe ir de 0 a 150 anios");
			edad = sc.nextInt();
		}
		this.edad=edad;
	}
	/**
	 * Método que retorna el rut del cliente
	 * @return Retorna entero que almacena el rut del cliente
	 */
	public int getRut() {
		return rut;
	}
	/**
	 * Método que modifica el rut del cliente validando que este no sea un número superior a 99.999.999
	 * @param rut De tipo int, almacena el nuevo rut del cliente
	 */
	public void setRut(int rut) {
		while(run>99999999) {
			System.out.println("Ingrese un rut válido");
			run=sc.nextInt();
			sc.nextLine();
		}
		this.rut = rut;
	}
	/**
	 * Método que implementa de la interfaz IAsesoria, imprime la dirección y la comuna del cliente
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Direccion: "+direccion+", Comuna:" +comuna+"\n");
	}
	/**
	 * Método que imprime el nombre más el apellido del cliente
	 */
	public void obtenerNombre() {
		System.out.println("El nombre del cliente es:" + nombre + apellido);
	}	
	/**
	 * Método que imprime el sistema de salud, Fonasa si es 1 e Isapre si es 2
	 */
	public void obetenerSistemaSalud() {
		if(sistemaSalud == 1 ) {
			System.out.println("Su sistema de salud es Fonasa");
		}else {
			System.out.println("Su sistema de salud es Isapre");
		}
	}
	/**
	 * Método que retorna un String que contiene la concatenación de los atributos del cliente
	 * @return Retorna un String que contiene los atributos del cliente incluyendo los atributos de la clase padre (Usuario)
	 */
	public String listarCliente() {
		return super.toString()+"Cliente [telefono=" + telefono + ", afp=" + afp + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", sistemaSalud=" + sistemaSalud + ", edad=" + edad + "]";
	}
	
}
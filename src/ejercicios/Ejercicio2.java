package ejercicios;

import java.util.Date;

import ejercicios.Persona.Documentos;

/**
 * A. Crear una clase Persona con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * TipoDocumento - enum (dni/libretacivica) 
 * NroDocumento - Integer
 * Nombre - String
 * Apellido - String
 * FechaNacimiento - Date
 * 
 * B. En el método main de la clase "Ejercicio2" crear una nueva instancia
 * de la clase persona y settearle valores reales con tus datos
 * 
 * 
 * C. En el método main de la clase "Ejercicio 2" imprimir los valores en 
 * consola 
 * (crear método main e imprimir valores) 
 *  
 * @author examen
 *
 */
public class Ejercicio2 {

	/**
	 * 
	 */
	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona people = new Persona();
		people.setNombre("Ramiro");
		people.setApellido("Acoglanis");
		people.setTipoDoc(Documentos.DNI);
		people.setNroDocumento(29973740);
		people.setFechaDeNacimiento(new Date("1983/02/14"));
		
		System.out.println("Nombre: " + people.getNombre());
		System.out.println("Apellido: " + people.getApellido());
		System.out.println("TipoDoc: " + people.getTipoDoc());
		System.out.println("NumeroDoc: " + people.getNroDocumento().toString());
		System.out.println("Fecha de Nacimiento: " + people.getFechaDeNacimiento().toString());
	}

}

class Persona{
	
	private Documentos tipoDoc; 
	private Integer nroDocumento;
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	
	public enum Documentos{
		DNI,
		LIBRETACIVICA
	}
	
	public Documentos getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(Documentos tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public Integer getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
		
}


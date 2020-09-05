/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

/**
 *
 * @author DacksonE
 */
public class Estudiantes {
    private String idEstudiante;
	private String nombreEstudiante;
	private String apellidoEstudiante;
	private char genero;
	private int edad;

    public Estudiantes() {
    }

    
        
        public Estudiantes(String idEstudiante, String nombreEstudiante, String apellidoEstudiante, char genero, int edad) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.genero = genero;
        this.edad = edad;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "idEstudiante=" + idEstudiante + ", nombreEstudiante=" + nombreEstudiante + ", apellidoEstudiante=" + apellidoEstudiante + '}';
    }

    
        
        
    
    
        
        

        
        
    
}

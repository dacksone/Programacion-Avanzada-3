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
public class TestEstudiante {
    
    public static void main(String[] args) {
		Estudiantes unEstudiante = new Estudiantes();
		unEstudiante.setEdad(35);
		System.out.print(unEstudiante.getEdad());
		System.out.print(unEstudiante.toString());
	}
    
}

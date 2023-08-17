/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotabla;

/**
 *
 * @author psg_7
 */
public class Alumno {
   private int matricula;
   private String apellido;
   private String nombre;
   private int Edad;

    public Alumno(int matricula, String apellido, String nombre, int Edad) {
        this.matricula = matricula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
   
   
}

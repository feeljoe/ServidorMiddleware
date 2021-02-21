/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

/**
 *
 * @author joelvalenzuela
 */
public class Alumno {
    private String nombre;
    private String id;
    private String apellido;
    
    public Alumno(){
        
    }
    public Alumno(String id){
        this.id = id;
    }
    public Alumno(String nombre, String apellido, String id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
}

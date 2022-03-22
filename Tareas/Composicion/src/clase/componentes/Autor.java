/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.componentes;

/**
 *
 * @author Jibda
 */
public class Autor {
    private String nombre;
    private int libros;

    public Autor() {
    }

    public Autor(String nombre, int libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public int getLibros() {
        return libros;
    }

    public void setLibros(int libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", libros=" + libros + '}';
    }
    
    public String escribir(int libros){
        libros = libros + 1;
        String mensaje = nombre + " a escrito " + libros + " al día de hoy.";
        return mensaje;
    }
}

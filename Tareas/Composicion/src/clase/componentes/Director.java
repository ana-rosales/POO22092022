/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.componentes;

/**
 *
 * @author Jibda
 */
public class Director {
    String nombre;
    int peliculas;

    public Director() {
    }

    public Director(String nombre, int peliculas) {
        this.nombre = nombre;
        this.peliculas = peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(int peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", peliculas=" + peliculas + '}';
    }
    
    public String dirigir(int peliculas){
        peliculas = peliculas + 1;
        String mensaje = nombre + " ha dirigido " + peliculas + " películas.";        
        return mensaje;
    }   
}

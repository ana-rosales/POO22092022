/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.completa;

import clase.componentes.Actor;
import clase.componentes.Director;
import clase.componentes.Productora;

/**
 *
 * @author Jibda
 */
public class Pelicula {
    private String nombre;
    private int duracion;
    private Director director;
    private Productora productora;
    private Actor actor;

    public Pelicula() {
        director = new Director();
        productora = new Productora();
        actor = new Actor();
    }

    public Pelicula(String nombre, int duracion, Director director, Productora productora, Actor actor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", duracion=" + duracion + ", director=" + director + ", productora=" + productora + ", actor=" + actor + '}';
    }
    
    public void reproducir(){
        System.out.println("La película se está reproduciendo...");
    }
}

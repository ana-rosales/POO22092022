/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.componentes;

/**
 *
 * @author Jibda
 */
public class Productora {
    private String nombre;
    private int proyectos;

    public Productora() {
    }

    public Productora(String nombre, int proyectos) {
        this.nombre = nombre;
        this.proyectos = proyectos;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", proyectos=" + proyectos + '}';
    }
    
    public String producir(int proyectos){
        proyectos = proyectos + 1;
        String mensaje = nombre + " ha producido " + proyectos + " proyectos.";
        return mensaje;
    }
}

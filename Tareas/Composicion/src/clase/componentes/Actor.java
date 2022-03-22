/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.componentes;

/**
 *
 * @author Jibda
 */
public class Actor {
    private String nombre;
    private int premios;

    public Actor() {
    }

    public Actor(String nombre, int premios) {
        this.nombre = nombre;
        this.premios = premios;
    }

    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", premios=" + premios + '}';
    }
    
    public String nominado(int premios){
        premios = premios + 1;
        String mensaje = nombre + " ha sido nominado " + premios + " veces.";
        return mensaje;
    }
}

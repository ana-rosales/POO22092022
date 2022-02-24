/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Jibda
 */
public class Foco {
    //atributos encapsulados
    private String color;
    private String tipo;
    private int tamano;

    //método constructor
    public Foco() {
    }

    //método constructor sobrecargado
    public Foco(String color, String tipo, int tamano) {
        this.color = color;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    //getters and setters
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //si no es generado generar con string builder
    //devuelve en cadena los atributos del objeto
    @Override
    public String toString() {
        return "Foco{" + "color=" + color + ", tipo=" + tipo + ", tamano=" + tamano + '}';
    }
    
    
}

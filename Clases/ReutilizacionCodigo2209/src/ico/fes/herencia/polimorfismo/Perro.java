/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author Jibda
 */
public class Perro extends Animal{
    private String raza;
    private String pedigri;

    public Perro() {
    }

    public Perro(String raza, String pedigri) {
        this.raza = raza;
        this.pedigri = pedigri;
    }

    public Perro(String raza, String pedigri, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
        this.pedigri = pedigri;
    }

    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", pedigri=" + pedigri + '}';
    }
    
    @Override
    public void emitirSonido(){
        System.out.println("Guau Guau!");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author Jibda
 */
public class Alumno {
    private String numeroCuenta;
    private int zoomestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, int zoomestre, float promedio) {
        this.numeroCuenta = numeroCuenta;
        this.zoomestre = zoomestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getZoomestre() {
        return zoomestre;
    }

    public void setZoomestre(int zoomestre) {
        this.zoomestre = zoomestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", zoomestre=" + zoomestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar ( int minutos ){
        System.out.println("Estudiando ..." + minutos + "minuts.");
    }
    
    public String evaluarDesempenio(){
        return this.promedio > 8.0f?"Sobresaliente":"Regular";
    }
}

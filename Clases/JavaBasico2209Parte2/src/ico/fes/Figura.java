/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Jibda
 */
public interface Figura {
    public static final float PI=3.1416F;
    public static final int CUADRADO = 1;
    public static final float CIRCULO = 2;
    public static final int TRIANGULO = 3;
    public static final float RECTANGULO = 4;
    
    public abstract float calcularArea();
}

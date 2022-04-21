/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Jibda
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0] = new Cuentahabiente(1, "Juanito", 45000.5f);
        lista[1] = new Cuentahabiente(2, "Lupita", 700000.45f);
        lista[2] = new Cuentahabiente(3, "Pérez", 5000.0f);
        lista[3] = new Cuentahabiente(4, "Pepe", 13000.5f);
        lista[4] = new Cuentahabiente(5, "Paco", 1000.0f);
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.getNombre() + " es " + cuentahabiente.evaluarNivelCliente());
        }
    }
    
}

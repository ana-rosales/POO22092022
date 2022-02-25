/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

/**
 *
 * @author Jibda
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro mujercitas = new Libro();
        mujercitas.setColor("Azul");
        mujercitas.setCaps(23);
        mujercitas.setAutor("Louisa May Alcott");
        mujercitas.setGenero("Novela");
        mujercitas.setNumpags(394);
        System.out.println(mujercitas.toString());
        System.out.println("Me faltan por leer: " + mujercitas.paginasRestantes(86) + " páginas.");
        System.out.println("Me faltan por leer: " + mujercitas.capitulosRestantes(5) + " capítulos.");
        
    }
    
}

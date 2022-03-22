/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import clase.completa.Libro;
import clase.completa.Pelicula;
import clase.componentes.Actor;
import clase.componentes.Autor;
import clase.componentes.Director;
import clase.componentes.Editorial;
import clase.componentes.Productora;

/**
 *
 * @author Jibda
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Película
        Pelicula peli1 = new Pelicula("Mi Villano Favorito 3", 96,
                new Director("Pierre Coffin", 40), 
                new Productora("Universal", 5000), 
                new Actor("Gru", 5));
        System.out.println( peli1 );
        
        // Libro
        Libro libro1 = new Libro("Cien años de soledad", 300, 
                new Autor("Gabriel García Márquez", 50),
                new Editorial("España", 5000));
        System.out.println( libro1 );
    }
    
}

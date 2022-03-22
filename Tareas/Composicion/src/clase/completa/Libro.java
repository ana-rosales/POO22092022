/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.completa;

import clase.componentes.Autor;
import clase.componentes.Editorial;

/**
 *
 * @author Jibda
 */
public class Libro {
    private String nombre;
    private int paginas;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
        autor = new Autor();
        editorial = new Editorial();
    }

    public Libro(String nombre, int paginas, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", paginas=" + paginas + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public String paginasFaltantes(int leido){
        paginas = paginas - leido;
        String mensaje = "Le falta por leer " + paginas + " páginas.";
        return mensaje;
    }

}

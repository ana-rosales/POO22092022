package tarealibro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jibda
 */
public class Libro {
    private String color;
    private String autor;
    private String genero;
    private int numpags;
    private int caps;

    public Libro() {
    }

    public Libro(String color, String autor, String genero, int numpags, int caps) {
        this.color = color;
        this.autor = autor;
        this.genero = genero;
        this.numpags = numpags;
        this.caps = caps;
    }

    public int getCaps() {
        return caps;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumpags() {
        return numpags;
    }

    public void setNumpags(int numpags) {
        this.numpags = numpags;
    }

    @Override
    public String toString() {
        return "Libro{" + "color=" + color + ", autor=" + autor + ", genero=" + genero + ", numpags=" + numpags + ", caps=" + caps + '}';
    }
    
    //regresa cuántas páginas faltan por leer
    public int paginasRestantes(int pagsLeidas){
        return this.numpags - pagsLeidas;
    }
    
    //regresa cuántos capítulos faltan por leer
    public int capitulosRestantes(int capsLeidos){
        return this.caps - capsLeidos;
    }
}

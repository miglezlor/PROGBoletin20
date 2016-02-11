package boletin20;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Libro implements Comparable {
    private String titulo, autor, ISBN;
    private float prezo;
    private int numUnidades;

    public Libro() {
    }

    public Libro(String título, String autor, String ISBN, float prezo, int numUnidades) {
        this.titulo = título;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
    }

    public String getTítulo() {
        return titulo;
    }

    public void setTítulo(String título) {
        this.titulo = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        String datos = "Libro: " + "t\u00edtulo = " + titulo + " || autor = " + autor + " || ISBN = " + ISBN + " || prezo = " + prezo + " || numUnidades = " + numUnidades + "||";
        return datos+"\n";
    }

    public int compareTo(Object o){
        Libro obx = (Libro)o;
        if(this.titulo.compareToIgnoreCase(obx.titulo)==0)
            return 0;
        else if (this.titulo.compareToIgnoreCase(obx.titulo)>0)
            return 1;
        else
            return -1;
    }
    
     
    
}

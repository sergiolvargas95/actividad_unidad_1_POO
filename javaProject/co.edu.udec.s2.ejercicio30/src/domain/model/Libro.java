package domain.model;

import java.util.List;

public class Libro {
    private int id;
    private String titulo;
    private List<Autor> autores;
    private String genero;
    
    public Libro() {}
    
    public Libro(int id, String titulo, List<Autor> autores, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autores;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro {" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autores=" + autores +
                ", genero='" + genero + '\'' +
                '}';
    }
}

package domain.model;

import java.util.List;

public class BibliotecaDigital {
    private int id;
    private String nombre;
    private int numeroLibros;
    private List<Servidor> servidores;

    public BibliotecaDigital() { }

    public BibliotecaDigital(int id, String nombre, int numeroLibros, List<Servidor> servidores) {
        this.id = id;
        this.nombre = nombre;
        this.numeroLibros = numeroLibros;
        this.servidores = servidores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    public List<Servidor> getServidores() {
        return servidores;
    }

    public void setServidores(List<Servidor> servidores) {
        this.servidores = servidores;
    }

    @Override
    public String toString() {
        return "BibliotecaDigital {" +
                "id = " + id +
                ", nombre = '" + nombre + '\'' +
                ", numeroLibros = " + numeroLibros +
                ", servidores = " + servidores +
                '}';
    }
}

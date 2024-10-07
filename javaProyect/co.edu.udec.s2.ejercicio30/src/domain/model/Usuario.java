package domain.model;

import java.time.LocalDate;
import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private LocalDate fechaNacimiento;
    private List<Libro> librosDescargados;
    
    public Usuario() {}
    
    public Usuario(int id, String nombre, String apellido, String correo, String contrasena, LocalDate fechaNacimiento, List<Libro> librosDescargados) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.librosDescargados = librosDescargados;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Libro> getLibrosDescargados() {
        return librosDescargados;
    }

    public void setLibrosDescargados(List<Libro> librosDescargados) {
        this.librosDescargados = librosDescargados;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", librosDescargados=" + librosDescargados +
                '}';
    }
}

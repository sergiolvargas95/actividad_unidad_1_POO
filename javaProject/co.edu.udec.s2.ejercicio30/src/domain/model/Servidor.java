package domain.model;

public class Servidor {
    private int id;
    private String nombre;
    private String direccionIp;
    
    public Servidor() {}
    
    public Servidor(int id, String nombre, String direccionIp) {
        this.id = id;
        this.nombre = nombre;
        this.direccionIp = direccionIp;
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

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    @Override
    public String toString() {
        return "Servidor {" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccionIp='" + direccionIp + '\'' +
                '}';
    }
}

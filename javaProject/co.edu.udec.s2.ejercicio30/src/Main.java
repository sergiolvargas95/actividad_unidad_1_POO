import domain.model.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static functions.Util.formatoFecha;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("*********************************************");
        System.out.println("7502410050 - SERGIO LUIS VARGAS MELÉNDEZ");
        System.out.println("*********************************************");

        List<Servidor> servidores = new ArrayList<>();
        List<Autor> autores = new ArrayList<>();

        /*
        *******************************************
        * CONSTRUCTOR POR DEFECTO
        *******************************************
        */
        BibliotecaDigital bibliotecaDigital1 = new BibliotecaDigital();

        Servidor servidor = new Servidor();
        servidor.setId(1);
        servidor.setNombre("Servidor Piedra Bolivar");
        servidor.setDireccionIp("192.168.1.1");

        servidores.add(servidor);

        bibliotecaDigital1.setId(1);
        bibliotecaDigital1.setNombre("Biblioteca Digital UdC");
        bibliotecaDigital1.setNumeroLibros(5310);
        bibliotecaDigital1.setServidores(servidores);

        Autor autor = new Autor();
        autor.setId(1);
        autor.setNombre("Gabriel");
        autor.setApellido("García Márquez");

        //Metodo estatico para darle formato a la fecha anio/mes/dia
        String fechaString = "1927-03-06";
        LocalDate fechaNacimiento = formatoFecha(fechaString);

        autor.setFechaNacimiento(fechaNacimiento);
        autor.setNacionalidad("Colombiano");
        autores.add(autor);

        Libro libro = new Libro();
        libro.setId(1);
        libro.setTitulo("Cien años de soledad");
        libro.setGenero("Realismo Mágico");
        libro.setAutores(autores);

        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setNombre("Pedro");
        usuario1.setApellido("Gonzales");
        usuario1.setCorreo("pedro_pablo@gmail.com");
        usuario1.setContrasena("seflkie1233");

        String fechaString3 = "2015-09-07";
        LocalDate fechaNacimiento3 = formatoFecha(fechaString3);
        usuario1.setFechaNacimiento(fechaNacimiento3);

        List<Libro> listaLibrosDescargados = new ArrayList<>();
        listaLibrosDescargados.add(libro);

        usuario1.setLibrosDescargados(listaLibrosDescargados);

        System.out.println(bibliotecaDigital1.toString());
        System.out.println(servidor.toString());
        System.out.println(autor.toString());
        System.out.println(libro.toString());
        System.out.println(usuario1.toString());

        System.out.println("**************************************************");

        servidores.clear();
        autores.clear();

        /*
         *******************************************
         * CONSTRUCTOR CON PARAMETROS
         *******************************************
         */

        Servidor servidor1 = new Servidor(2, "Servidor Nacional de Colombia", "192.168.1.1");
        servidores.add(servidor1);
        BibliotecaDigital bibliotecaDigital2 = new BibliotecaDigital(2, "Biblioteca Digita de la República de Colombia", 10453, servidores);

        String fechaString2 = "1833-11-07";
        LocalDate fechaNacimiento2 = formatoFecha(fechaString2);
        Autor autor1 = new Autor(2, "Rafael", "Pombo", fechaNacimiento2,"Colombiano");

        autores.add(autor1);
        Libro libro1 = new Libro(2, "La pobre viejecita", autores, "Infantil");

        String fechaString4 = "2002-01-27";
        LocalDate fechaNacimiento4 = formatoFecha(fechaString4);

        List<Libro> listaLibrosDescargados2 = new ArrayList<>();
        listaLibrosDescargados.add(libro);

        Usuario usuario2 = new Usuario(2, "Luis", "Rosales", "luisrosales@hotmail.com", "awsoije345", fechaNacimiento4, listaLibrosDescargados2);
        System.out.println(bibliotecaDigital2.toString());
        System.out.println(servidor1.toString());
        System.out.println(autor1.toString());
        System.out.println(libro1.toString());
        System.out.println(usuario2.toString());



    }
}
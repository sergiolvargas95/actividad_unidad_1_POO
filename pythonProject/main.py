from datetime import datetime
from BibliotecaDigital import BibliotecaDigital
from Servidor import Servidor
from Usuario import Usuario
from Autor import Autor
from Libro import Libro
from functions.Util import Util

def main():
    fecha_string = "1927-03-06"
    fecha_formateada = Util.formato_fecha(fecha_string)
    print(f"La fecha formateada es: {fecha_formateada}")

if __name__ == "__main__":
    main()


def main():
    print("*********************************************")
    print("7502410050 - SERGIO LUIS VARGAS MELÉNDEZ")
    print("*********************************************")

    servidores = []
    autores = []

    # Constructor por defecto
    bibliotecaDigital1 = BibliotecaDigital()

    servidor = Servidor(id=1, nombre="Servidor Piedra Bolivar", direccion_ip="192.168.1.1")
    servidores.append(servidor)

    bibliotecaDigital1.id = 1
    bibliotecaDigital1.nombre = "Biblioteca Digital UdC"
    bibliotecaDigital1.numero_libros = 5310
    bibliotecaDigital1.servidores = servidores

    autor = Autor(id=1, nombre="Gabriel", apellido="García Márquez")
    fecha_string = "1927-03-06"
    autor.fecha_nacimiento = Util.formato_fecha(fecha_string)
    autor.nacionalidad = "Colombiano"
    autores.append(autor)

    libro = Libro(id=1, titulo="Cien años de soledad", genero="Realismo Mágico", autores=autores)

    usuario1 = Usuario(id=1, nombre="Pedro", apellido="Gonzales", correo="pedro_pablo@gmail.com", contrasena="seflkie1233")
    fecha_string3 = "2015-09-07"
    usuario1.fecha_nacimiento = Util.formato_fecha(fecha_string3)
    usuario1.libros_descargados = [libro]

    print(bibliotecaDigital1)
    print(servidor)
    print(autor)
    print(libro)
    print(usuario1)

    print("**************************************************")

    servidores.clear()
    autores.clear()

    # Constructor con parámetros
    servidor1 = Servidor(id=2, nombre="Servidor Nacional de Colombia", direccion_ip="192.168.1.1")
    servidores.append(servidor1)
    bibliotecaDigital2 = BibliotecaDigital(id=2, nombre="Biblioteca Digital de la República de Colombia", numero_libros=10453, servidores=servidores)

    fecha_string2 = "1833-11-07"
    autor1 = Autor(id=2, nombre="Rafael", apellido="Pombo", fecha_nacimiento=Util.formato_fecha(fecha_string2), nacionalidad="Colombiano")
    autores.append(autor1)

    libro1 = Libro(id=2, titulo="La pobre viejecita", genero="Infantil", autores=autores)

    fecha_string4 = "2002-01-27"

    usuario2 = Usuario(id=2, nombre="Luis", apellido="Rosales", correo="luisrosales@hotmail.com", contrasena="awsoije345",
                        fecha_nacimiento=Util.formato_fecha(fecha_string4), libros_descargados=[libro1])
    usuario2.libros_descargados = [libro]

    print(bibliotecaDigital2)
    print(servidor1)
    print(autor1)
    print(libro1)
    print(usuario2)

if __name__ == "__main__":
    main()
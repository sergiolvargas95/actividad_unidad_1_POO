from datetime import date

class Usuario:
    def __init__(self, id=None, nombre=None, apellido=None, correo=None, contrasena=None, fecha_nacimiento=None, libros_descargados=None):
        self.id = id
        self.nombre = nombre
        self.apellido = apellido
        self.correo = correo
        self.contrasena = contrasena
        self.fecha_nacimiento = fecha_nacimiento
        self.libros_descargados = libros_descargados

    def __str__(self):
        autores_str = ', '.join(f"{autor.nombre} {autor.apellido}" for autor in self.autores)
        return f"Libro{{id={self.id}, titulo='{self.titulo}', autores=[{autores_str}], genero='{self.genero}'}}"

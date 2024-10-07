from datetime import date

class Autor:
    def __init__(self, id=None, nombre=None, apellido=None, fecha_nacimiento=None, nacionalidad=None):
        self.id = id
        self.nombre = nombre
        self.apellido = apellido
        self.fecha_nacimiento = fecha_nacimiento
        self.nacionalidad = nacionalidad

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_apellido(self):
        return self.apellido

    def set_apellido(self, apellido):
        self.apellido = apellido

    def get_fecha_nacimiento(self):
        return self.fecha_nacimiento

    def set_fecha_nacimiento(self, fecha_nacimiento):
        self.fecha_nacimiento = fecha_nacimiento

    def get_nacionalidad(self):
        return self.nacionalidad

    def set_nacionalidad(self, nacionalidad):
        self.nacionalidad = nacionalidad

    def __str__(self):
        return (f"Autor{{id={self.id}, nombre='{self.nombre}', "
                f"apellido='{self.apellido}', fechaNacimiento='{self.fecha_nacimiento}', "
                f"nacionalidad='{self.nacionalidad}'}}")


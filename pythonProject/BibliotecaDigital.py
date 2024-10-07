class BibliotecaDigital:
    def __init__(self, id=None, nombre=None, numero_libros=None, servidores=None):
        self.id = id
        self.nombre = nombre
        self.numero_libros = numero_libros
        self.servidores = servidores

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_numero_libros(self):
        return self.numero_libros

    def set_numero_libros(self, numero_libros):
        self.numero_libros = numero_libros

    def get_servidores(self):
        return self.servidores

    def set_servidores(self, servidores):
        self.servidores = servidores

    def __str__(self):
        return (f"BibliotecaDigital{{id={self.id}, nombre='{self.nombre}', "
                f"numero_libros={self.numero_libros}, servidores={self.servidores}}}")


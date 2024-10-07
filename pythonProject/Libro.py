class Libro:
    def __init__(self, id=None, titulo=None, autores=None, genero=None):
        self.id = id
        self.titulo = titulo
        self.autores = autores
        self.genero = genero

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_titulo(self):
        return self.titulo

    def set_titulo(self, titulo):
        self.titulo = titulo

    def get_autores(self):
        return self.autores

    def set_autores(self, autores):
        self.autores = autores

    def get_genero(self):
        return self.genero

    def set_genero(self, genero):
        self.genero = genero

    def __str__(self):
        return (f"Libro{{id={self.id}, titulo='{self.titulo}', "
                f"autores={self.autores}, genero='{self.genero}'}}")

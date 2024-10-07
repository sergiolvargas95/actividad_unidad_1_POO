class Servidor:
    def __init__(self, id=None, nombre=None, direccion_ip=None):
        self.id = id
        self.nombre = nombre
        self.direccion_ip = direccion_ip

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_direccion_ip(self):
        return self.direccion_ip

    def set_direccion_ip(self, direccion_ip):
        self.direccion_ip = direccion_ip

    def __str__(self):
        return (f"Servidor{{id={self.id}, nombre='{self.nombre}', "
                f"direccionIp='{self.direccion_ip}'}}")

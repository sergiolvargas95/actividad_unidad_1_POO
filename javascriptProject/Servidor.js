class Servidor {
    constructor(id = null, nombre = null, direccionIp = null) {
        this.id = id;
        this.nombre = nombre;
        this.direccionIp = direccionIp;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getNombre() {
        return this.nombre;
    }

    setNombre(nombre) {
        this.nombre = nombre;
    }

    getDireccionIp() {
        return this.direccionIp;
    }

    setDireccionIp(direccionIp) {
        this.direccionIp = direccionIp;
    }

    toString() {
        return `Servidor{id=${this.id}, nombre='${this.nombre}', direccionIp='${this.direccionIp}'}`;
    }
}

module.exports = Servidor;

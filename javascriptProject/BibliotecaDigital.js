class BibliotecaDigital {
    constructor(id = null, nombre = null, numeroLibros = null, servidores = []) {
        this.id = id;
        this.nombre = nombre;
        this.numeroLibros = numeroLibros;
        this.servidores = servidores;
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

    getNumeroLibros() {
        return this.numeroLibros;
    }

    setNumeroLibros(numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    getServidores() {
        return this.servidores;
    }

    setServidores(servidores) {
        this.servidores = servidores;
    }

    toString() {
        return `BibliotecaDigital{id=${this.id}, nombre='${this.nombre}', numeroLibros=${this.numeroLibros}, servidores=[${this.servidores.join(", ")}]}`;
    }
}

module.exports = BibliotecaDigital;

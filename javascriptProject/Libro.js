class Libro {
    constructor(id = null, titulo = null, autores = [], genero = null) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autores;
        this.genero = genero;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getTitulo() {
        return this.titulo;
    }

    setTitulo(titulo) {
        this.titulo = titulo;
    }

    getAutores() {
        return this.autores;
    }

    setAutores(autores) {
        this.autores = autores;
    }

    getGenero() {
        return this.genero;
    }

    setGenero(genero) {
        this.genero = genero;
    }

    toString() {
        return `Libro{id=${this.id}, titulo='${this.titulo}', autores=[${this.autores.join(", ")}], genero='${this.genero}'}`;
    }
}

module.exports = Libro;
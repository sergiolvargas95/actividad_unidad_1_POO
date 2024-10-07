class Autor {
    constructor(id = null, nombre = null, apellido = null, fechaNacimiento = null, nacionalidad = null) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
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

    getApellido() {
        return this.apellido;
    }

    setApellido(apellido) {
        this.apellido = apellido;
    }

    getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    setFechaNacimiento(fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    getNacionalidad() {
        return this.nacionalidad;
    }

    setNacionalidad(nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    toString() {
        return `Autor{id=${this.id}, nombre='${this.nombre}', apellido='${this.apellido}', fechaNacimiento=${this.fechaNacimiento}, nacionalidad='${this.nacionalidad}'}`;
    }
}

module.exports = Autor;

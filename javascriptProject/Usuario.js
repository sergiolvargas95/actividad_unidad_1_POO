class Usuario {
    constructor(id = null, nombre = null, apellido = null, correo = null, contrasena = null, fechaNacimiento = null, librosDescargados = []) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.librosDescargados = librosDescargados;
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

    getCorreo() {
        return this.correo;
    }

    setCorreo(correo) {
        this.correo = correo;
    }

    getContrasena() {
        return this.contrasena;
    }

    setContrasena(contrasena) {
        this.contrasena = contrasena;
    }

    getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    setFechaNacimiento(fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    getLibrosDescargados() {
        return this.librosDescargados;
    }

    setLibrosDescargados(librosDescargados) {
        this.librosDescargados = librosDescargados;
    }

    toString() {
        return `Usuario{id=${this.id}, nombre='${this.nombre}', apellido='${this.apellido}', correo='${this.correo}', contrasena='${this.contrasena}', fechaNacimiento=${this.fechaNacimiento}, librosDescargados=[${this.librosDescargados.join(", ")}]}`;
    }
}

module.exports = Usuario;
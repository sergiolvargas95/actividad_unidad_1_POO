<?php

class Usuario {
    private $id;
    private $nombre;
    private $apellido;
    private $correo;
    private $contrasena;
    private $fechaNacimiento;
    private $librosDescargados;

    public function __construct($id = null, $nombre = null, $apellido = null, $correo = null, $contrasena = null, $fechaNacimiento = null, $librosDescargados = []) {
        $this->id = $id;
        $this->nombre = $nombre;
        $this->apellido = $apellido;
        $this->correo = $correo;
        $this->contrasena = $contrasena;
        $this->fechaNacimiento = $fechaNacimiento;
        $this->librosDescargados = $librosDescargados;
    }

    public function getId() {
        return $this->id;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function getNombre() {
        return $this->nombre;
    }

    public function setNombre($nombre) {
        $this->nombre = $nombre;
    }

    public function getApellido() {
        return $this->apellido;
    }

    public function setApellido($apellido) {
        $this->apellido = $apellido;
    }

    public function getCorreo() {
        return $this->correo;
    }

    public function setCorreo($correo) {
        $this->correo = $correo;
    }

    public function getContrasena() {
        return $this->contrasena;
    }

    public function setContrasena($contrasena) {
        $this->contrasena = $contrasena;
    }

    public function getFechaNacimiento() {
        return $this->fechaNacimiento;
    }

    public function setFechaNacimiento($fechaNacimiento) {
        $this->fechaNacimiento = $fechaNacimiento;
    }

    public function getLibrosDescargados() {
        return $this->librosDescargados;
    }

    public function setLibrosDescargados($librosDescargados) {
        $this->librosDescargados = $librosDescargados;
    }

    public function __toString() {
        return "Usuario{id={$this->id}, nombre='{$this->nombre}', apellido='{$this->apellido}', correo='{$this->correo}', contrasena='{$this->contrasena}', fechaNacimiento={$this->fechaNacimiento}, librosDescargados=" . implode(", ", $this->librosDescargados) . "}";
    }
}

?>

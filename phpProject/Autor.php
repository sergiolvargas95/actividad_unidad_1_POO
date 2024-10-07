<?php

class Autor {
    private $id;
    private $nombre;
    private $apellido;
    private $fechaNacimiento;
    private $nacionalidad;

    public function __construct($id = null, $nombre = null, $apellido = null, $fechaNacimiento = null, $nacionalidad = null) {
        $this->id = $id;
        $this->nombre = $nombre;
        $this->apellido = $apellido;
        $this->fechaNacimiento = $fechaNacimiento;
        $this->nacionalidad = $nacionalidad;
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

    public function getFechaNacimiento() {
        return $this->fechaNacimiento;
    }

    public function setFechaNacimiento($fechaNacimiento) {
        $this->fechaNacimiento = $fechaNacimiento;
    }

    public function getNacionalidad() {
        return $this->nacionalidad;
    }

    public function setNacionalidad($nacionalidad) {
        $this->nacionalidad = $nacionalidad;
    }

    public function __toString() {
        return "Autor{id={$this->id}, nombre='{$this->nombre}', apellido='{$this->apellido}', fechaNacimiento={$this->fechaNacimiento}, nacionalidad='{$this->nacionalidad}'}";
    }
}

?>

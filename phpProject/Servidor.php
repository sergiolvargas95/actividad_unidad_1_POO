<?php

class Servidor {
    private $id;
    private $nombre;
    private $direccionIp;

    public function __construct($id = null, $nombre = null, $direccionIp = null) {
        $this->id = $id;
        $this->nombre = $nombre;
        $this->direccionIp = $direccionIp;
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

    public function getDireccionIp() {
        return $this->direccionIp;
    }

    public function setDireccionIp($direccionIp) {
        $this->direccionIp = $direccionIp;
    }

    public function __toString() {
        return "Servidor{id={$this->id}, nombre='{$this->nombre}', direccionIp='{$this->direccionIp}'}";
    }
}

?>

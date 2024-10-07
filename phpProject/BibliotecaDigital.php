<?php

class BibliotecaDigital {
    private $id;
    private $nombre;
    private $numeroLibros;
    private $servidores;

    public function __construct($id = null, $nombre = null, $numeroLibros = null, $servidores = []) {
        $this->id = $id;
        $this->nombre = $nombre;
        $this->numeroLibros = $numeroLibros;
        $this->servidores = $servidores;
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

    public function getNumeroLibros() {
        return $this->numeroLibros;
    }

    public function setNumeroLibros($numeroLibros) {
        $this->numeroLibros = $numeroLibros;
    }

    public function getServidores() {
        return $this->servidores;
    }

    public function setServidores($servidores) {
        $this->servidores = $servidores;
    }

    public function __toString() {
        return "BibliotecaDigital{id={$this->id}, nombre='{$this->nombre}', numeroLibros={$this->numeroLibros}, servidores=" . implode(", ", $this->servidores) . "}";
    }
}

?>

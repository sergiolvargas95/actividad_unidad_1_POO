<?php

class Libro {
    private $id;
    private $titulo;
    private $autores;
    private $genero;

    public function __construct($id = null, $titulo = null, $autores = [], $genero = null) {
        $this->id = $id;
        $this->titulo = $titulo;
        $this->autores = $autores;
        $this->genero = $genero;
    }

    public function getId() {
        return $this->id;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function getTitulo() {
        return $this->titulo;
    }

    public function setTitulo($titulo) {
        $this->titulo = $titulo;
    }

    public function getAutores() {
        return $this->autores;
    }

    public function setAutores($autores) {
        $this->autores = $autores;
    }

    public function getGenero() {
        return $this->genero;
    }

    public function setGenero($genero) {
        $this->genero = $genero;
    }

    public function __toString() {
        return "Libro{id={$this->id}, titulo='{$this->titulo}', autores=" . implode(", ", $this->autores) . ", genero='{$this->genero}'}";
    }
}

?>

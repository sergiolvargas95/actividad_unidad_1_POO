<?php

require_once 'BibliotecaDigital.php';
require_once 'Servidor.php';
require_once 'Autor.php';
require_once 'Libro.php';
require_once 'Usuario.php';

echo "*********************************************\n";
echo "7502410050 - SERGIO LUIS VARGAS MELÉNDEZ\n";
echo "*********************************************\n";


$servidores = [];
$autores = [];

$bibliotecaDigital1 = new BibliotecaDigital();

$servidor = new Servidor();
$servidor->setId(1);
$servidor->setNombre("Servidor Piedra Bolivar");
$servidor->setDireccionIp("192.168.1.1");

$servidores[] = $servidor;

$bibliotecaDigital1->setId(1);
$bibliotecaDigital1->setNombre("Biblioteca Digital UdC");
$bibliotecaDigital1->setNumeroLibros(5310);
$bibliotecaDigital1->setServidores($servidores);

$autor = new Autor();
$autor->setId(1);
$autor->setNombre("Gabriel");
$autor->setApellido("García Márquez");
$autor->setFechaNacimiento("1927-03-06");
$autor->setNacionalidad("Colombiano");

$autores[] = $autor;

$libro = new Libro();
$libro->setId(1);
$libro->setTitulo("Cien años de soledad");
$libro->setGenero("Realismo Mágico");
$libro->setAutores($autores);

$usuario1 = new Usuario();
$usuario1->setId(1);
$usuario1->setNombre("Pedro");
$usuario1->setApellido("Gonzales");
$usuario1->setCorreo("pedro_pablo@gmail.com");
$usuario1->setContrasena("seflkie1233");
$usuario1->setFechaNacimiento("2015-09-07");

$listaLibrosDescargados = [];
$listaLibrosDescargados[] = $libro;
$usuario1->setLibrosDescargados($listaLibrosDescargados);

echo $bibliotecaDigital1 . "\n";
echo $servidor . "\n";
echo $autor . "\n";
echo $libro . "\n";
echo $usuario1 . "\n";
echo "**************************************************\n";

$servidores = [];
$autores = [];

// Constructor con parámetros
$servidor1 = new Servidor(2, "Servidor Nacional de Colombia", "192.168.1.1");
$servidores[] = $servidor1;

$bibliotecaDigital2 = new BibliotecaDigital(2, "Biblioteca Digital de la República de Colombia", 10453, $servidores);

$autor1 = new Autor(2, "Rafael", "Pombo", "1833-11-07", "Colombiano");
$autores[] = $autor1;

$libro1 = new Libro(2, "La pobre viejecita", [$autor1], "Infantil");

$listaLibrosDescargados = [];
$listaLibrosDescargados[] = $libro1;

$usuario2 = new Usuario(2, "Luis", "Rosales", "luisrosales@hotmail.com", "awsoije345", "2002-01-27", $listaLibrosDescargados);

echo $bibliotecaDigital2 . "\n";
echo $servidor1 . "\n";
echo $autor1 . "\n";
echo $libro1 . "\n";
echo $usuario2 . "\n";

?>

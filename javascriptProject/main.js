const Util = require('./Util.js');
const Servidor = require('./Servidor.js');
const Autor = require('./Autor.js');
const Libro = require('./Libro.js');
const Usuario = require('./Usuario.js');
const BibliotecaDigital = require('./BibliotecaDigital.js');

function main() {
    console.log("*********************************************");
    console.log("7502410050 - SERGIO LUIS VARGAS MELÉNDEZ");
    console.log("*********************************************");

    const servidores = [];
    const autores = [];

    // Constructor por defecto
    const bibliotecaDigital1 = new BibliotecaDigital();

    const servidor = new Servidor(1, "Servidor Piedra Bolivar", "192.168.1.1");
    servidores.push(servidor);

    bibliotecaDigital1.id = 1;
    bibliotecaDigital1.nombre = "Biblioteca Digital UdC";
    bibliotecaDigital1.numeroLibros = 5310;
    bibliotecaDigital1.servers = servidores;

    const autor = new Autor(1, "Gabriel", "García Márquez", Util.formatoFecha("1927-03-06"), "Colombiano");
    autores.push(autor);

    const libro = new Libro(1, "Cien años de soledad", autores, "Realismo Mágico");

    const usuario1 = new Usuario(1, "Pedro", "Gonzales", "pedro_pablo@gmail.com", "seflkie1233", Util.formatoFecha("2015-09-07"), [libro]);

    console.log(bibliotecaDigital1.toString());
    console.log(servidor.toString());
    console.log(autor.toString());
    console.log(libro.toString());
    console.log(usuario1.toString());

    console.log("**************************************************");

    servidores.length = 0;
    autores.length = 0;

    // Constructor con parámetros
    const servidor1 = new Servidor(2, "Servidor Nacional de Colombia", "192.168.1.1");
    servidores.push(servidor1);
    const bibliotecaDigital2 = new BibliotecaDigital(2, "Biblioteca Digital de la República de Colombia", 10453, servidores);

    const autor1 = new Autor(2, "Rafael", "Pombo", Util.formatoFecha("1833-11-07"), "Colombiano");
    autores.push(autor1);
    const libro1 = new Libro(2, "La pobre viejecita", autores, "Infantil");

    const usuario2 = new Usuario(2, "Luis", "Rosales", "luisrosales@hotmail.com", "awsoije345", Util.formatoFecha("2002-01-27"), [libro1]);

    console.log(bibliotecaDigital2.toString());
    console.log(servidor1.toString());
    console.log(autor1.toString());
    console.log(libro1.toString());
    console.log(usuario2.toString());
}

main();

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php

        class Persona {

            private $nombre;
            private $apellido;

            function __construct($nombre, $apellido) {
                $this->nombre = $nombre;
                $this->apellido = $apellido;
            }

            function saludar() {
                echo("Hola " + nombre + " " + apellido);
            }

        }
        ?>

        <h1><?php
            $persona = new Persona("Carlos", "Gijon");
            $persona->saludar();
            ?></h1>
        <?php
        $bbdd = new mysqli("127.0.0.1", "root", "root", "sakila");
        if($bbdd->errno) {
            echo('<p style="color:red">No se ha podido conectar con la BBDD</p>');
        }
        else {
            echo('<p style="color:green">Se ha conectado correctamente a la BBDD</p>');
        }
        ?>
        <script src="newjavascript.js"></script>
    </body>
</html>

var persona1 = {
    nombre = "carlos",
    apellido = "Gijon"
};

console.log("hola ${persona1.nombre} ${persona1.apellido}");

var person = function(nombre, apellidos) {
    console.log("Hola ${nombre}  ${apellidos}");
}

person("carlos", "Gijon Fernandez");


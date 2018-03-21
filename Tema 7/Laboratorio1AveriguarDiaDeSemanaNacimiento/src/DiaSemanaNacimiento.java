import java.io.*;

class DiaSemanaNacimiento {
    private int dia, mes, anyo, posicionPrimeraBarra, posicionSegundaBarra;
    private String resultadoDia;

    private DiaSemanaNacimiento(String fecha) {
        posicionPrimeraBarra = fecha.indexOf("/");
        posicionSegundaBarra = fecha.lastIndexOf("/");

        dia = Integer.parseInt(fecha.substring(0,posicionPrimeraBarra));
        mes = Integer.parseInt(fecha.substring((posicionPrimeraBarra + 1), posicionSegundaBarra));
        anyo = Integer.parseInt(fecha.substring((posicionSegundaBarra + 1)));
        cambiarEneroFebrero();
    }

    private void cambiarEneroFebrero() {
        if(mes == 1) {
            mes = 13;
            anyo--;
        }
        else if(mes == 2) {
            mes = 14;
            anyo--;
        }
    }

    public int operacion1() {  // Mes más 1 por 3 y dividirlo entre 5
        return ((mes + 1) * 3) / 5;
    }

    public int operacion2() {  // Dividir el año entre 4
        return anyo / 4;
    }

    public int operacion3() {  // Dividir el año entre 100
        return anyo / 100;
    }

    public int operacion4() {  // Dividir el año entre 400
        return anyo / 400;
    }

    public int operacion5() {
        return dia + (mes * 2) + anyo + operacion1() + operacion2() - operacion3() + operacion4() + 2;
    }

    public int operacion6() {  // Dividir el resultado de operacion5 entre 7
        return operacion5() / 7;
    }

    public int numeroDiaSemana() {
        return operacion5() - (operacion6() * 7);
    }

    public String DiaSemana() {
        switch (numeroDiaSemana()){
            case 0:
                resultadoDia = "Sábado";
                break;
            case 1:
                resultadoDia = "Domingo";
                break;
            case 2:
                resultadoDia = "Lunes";
                break;
            case 3:
                resultadoDia = "Martes";
                break;
            case 4:
                resultadoDia = "Miércoles";
                break;
            case 5:
                resultadoDia = "Jueves";
                break;
            case 6:
                resultadoDia = "Viernes";
                break;
        }

        return resultadoDia;
    }

    public static void main(String[] args) throws IOException{
        // Creamos el objeto para introducir datos por teclado
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));

        String fechaIntroducida;

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/yyyy):");
        fechaIntroducida = entradaTeclado.readLine();
        DiaSemanaNacimiento objeto = new DiaSemanaNacimiento(fechaIntroducida);
        System.out.println("El día que naciste (" +fechaIntroducida+ ") era " + objeto.DiaSemana());
    }
}

package pruebawaitnotify;

import java.io.*;

public class PruebaWaitNotify {

    public static void main(String[] args) {
        Ficha f1 = new Ficha("Piolin", "Gijón", "Balsain 6", 926466085);
        Ficha[] fichas = {f1};
        Actualiza ac = new Actualiza(fichas);
        Leer le = new Leer(fichas,ac);
        ac.start();
        le.start();
    }
}

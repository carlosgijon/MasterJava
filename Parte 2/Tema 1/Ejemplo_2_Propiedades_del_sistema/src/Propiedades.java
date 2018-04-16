import java.io.IOException;

public class Propiedades {
    public static void main(String[] args) throws IOException {
        String propSO = "Nombre: " +System.getProperty("os.name");
        propSO += System.getProperty("line.separator") + "Versión: " + System.getProperty("os.version");
        propSO += System.getProperty("line.separator") + "Arquitectura: " + System.getProperty("os.arch");
        propSO += System.getProperty("line.separator") + "Directorio temporal: " + System.getProperty("java.io.tmpdir");
        propSO += System.getProperty("line.separator") + "Separador de ficheros: " + System.getProperty("file.separator");
        propSO += System.getProperty("line.separator") + "Separador de Path: " + System.getProperty("path.separator");
        propSO += System.getProperty("line.separator") + "Usuario: " + System.getProperty("user.name");

        System.out.println(propSO);
    }
}

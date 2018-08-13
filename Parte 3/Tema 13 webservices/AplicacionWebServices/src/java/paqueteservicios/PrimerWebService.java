package paqueteservicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.jws.WebService;
import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "PrimerWebService")  // Identifica la clase como un web service
public class PrimerWebService {

    @WebMethod(operationName = "GetDiaNacimiento")
    public String GetDiaNacimiento(@WebParam(name = "fecha") String fecha) throws ParseException {
        Date obj_fecha;
        Calendar calendario = GregorianCalendar.getInstance();
        SimpleDateFormat formato_fecha = new SimpleDateFormat("dd/MM/yyyy");
        obj_fecha = formato_fecha.parse(fecha);
        calendario.setTime(obj_fecha);
        
        int dia, mes, anyo;
        int op1, op2, op3, op4, op5, op6, resultado;
        
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH);
        mes++;
        anyo = calendario.get(Calendar.YEAR);
        System.out.println("dia " +dia);
        System.out.println("mes" +mes);
        System.out.println("año " +anyo);
        
        if(mes == 1) {
            mes = 13;
            anyo -= 1;
        }
        else if(mes == 2) {
            mes = 14;
            anyo -= 1;
        }
        
        // Se hacen las operaciones para sacar el dia de la semana
        op1 = ((mes + 1) * 3 / 5);
        System.out.println("operacion 1: " +op1);
        op2 = anyo / 4;
        System.out.println("operacion 2: " +op2);
        op3 = anyo / 100;
        System.out.println("operacion 3: " +op3);
        op4 = anyo / 400;
        System.out.println("operacion 4: " +op4);
        op5 = dia + (mes *2) + anyo + op1 + op2 + op4 + 2 - op3;
        System.out.println("operacion 5: " +op5);
        op6 = op5 / 7;
        System.out.println("operacion 6: " +op6);
        resultado = op5 - (op6 * 7);
        System.out.println("resultado: " +resultado);
        
        String dia_nacimiento = "";
        
        switch(resultado) {
            case 0:
                dia_nacimiento = "sabado";
                break;
            case 1:
                dia_nacimiento = "domingo";
                break;
            case 2:
                dia_nacimiento = "lunes";
                break;
            case 3:
                dia_nacimiento = "martes";
                break;
            case 4:
                dia_nacimiento = "miercoles";
                break;
            case 5:
                dia_nacimiento = "jueves";
                break;                
            case 6:
                dia_nacimiento = "viernes";
                break;                  
        }
        return dia_nacimiento;
    }
}

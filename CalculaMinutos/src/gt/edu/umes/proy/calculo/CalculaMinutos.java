package gt.edu.umes.proy.calculo;

/**
 * Recibe meses, semanas, dias, horas y minutos por linea de comandos
 * y despliega el total en segundos.
 */
public class CalculaMinutos {

    public static void main(String[] args) {
        if (!LogicaDelNegocio.validarParametros(args)) {
            System.out.println("Error: debe ingresar exactamente 5 numeros enteros "
                    + "(meses semanas dias horas minutos).");
            return;
        }
        long total = LogicaDelNegocio.calcularSegundos(args);
        System.out.println("Total en segundos: " + total);
    }
}
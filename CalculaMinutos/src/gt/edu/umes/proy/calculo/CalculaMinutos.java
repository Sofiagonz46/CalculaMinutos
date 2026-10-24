package gt.edu.umes.proy.calculo;

public class CalculaMinutos {

    public static void main(String[] args) {
    	
    	System.out.println("Clase Principal");
        if (!LogicaDelNegocio.validarParametros(args)) {
        	
            System.out.println("Error: debe ingresar exactamente 5 numeros enteros "
                    + "(meses semanas dias horas minutos).");
            return;
        }
        long total = LogicaDelNegocio.calcularSegundos(args);
        System.out.println("Total en segundos: " + total);
    }
}
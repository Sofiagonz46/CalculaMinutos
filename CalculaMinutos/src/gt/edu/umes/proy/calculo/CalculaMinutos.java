package gt.edu.umes.proy.calculo;

public class CalculaMinutos {

    public static void main(String[] args) {

        System.out.println("Clase Principal");

        try {
            long total = LogicaDelNegocio.calcularSegundos(args);
            System.out.println("Total en segundos: " + total);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
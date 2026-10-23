package gt.edu.umes.proy.calculo;

/**
 * Contiene la validacion de los parametros y el calculo del tiempo en segundos.
 */
public class LogicaDelNegocio {

    private static final int CANTIDAD_PARAMETROS = 5;

    // Equivalencias en segundos.
    // SUPUESTO: 1 mes = 30 dias (se deduce del ejemplo del enunciado, no esta escrito).
    private static final long SEGUNDOS_POR_MINUTO = 60L;
    private static final long SEGUNDOS_POR_HORA = 3600L;
    private static final long SEGUNDOS_POR_DIA = 86400L;
    private static final long SEGUNDOS_POR_SEMANA = 604800L;
    private static final long SEGUNDOS_POR_MES = 2592000L;

    /**
     * Valida que existan exactamente 5 parametros y que todos sean enteros.
     */
    public static boolean validarParametros(String[] parametros) {
        if (parametros == null || parametros.length != CANTIDAD_PARAMETROS) {
            return false;
        }
        for (String parametro : parametros) {
            try {
                Integer.parseInt(parametro);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calcula el total en segundos. Orden de los parametros:
     * meses, semanas, dias, horas, minutos.
     * Debe llamarse despues de validarParametros().
     */
    public static long calcularSegundos(String[] parametros) {
        long meses = Integer.parseInt(parametros[0]);
        long semanas = Integer.parseInt(parametros[1]);
        long dias = Integer.parseInt(parametros[2]);
        long horas = Integer.parseInt(parametros[3]);
        long minutos = Integer.parseInt(parametros[4]);

        return meses * SEGUNDOS_POR_MES
                + semanas * SEGUNDOS_POR_SEMANA
                + dias * SEGUNDOS_POR_DIA
                + horas * SEGUNDOS_POR_HORA
                + minutos * SEGUNDOS_POR_MINUTO;
    }
}
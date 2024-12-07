package EjIntermedio;

public class Test {
    public static void main(String[] args) {

        String mesIngresado = "febrero";
        mesIngresado = mesIngresado.toUpperCase();

        Mes mesSeleccionado = obtenerMes(mesIngresado);

        if (mesSeleccionado != null) {
            System.out.println(mesSeleccionado+ " tiene "+mesSeleccionado.getDias()+" dias");
        } else {
            System.out.println("El valor dado no corresponde a ningún mes");
        }
    }

    private static Mes obtenerMes(String nombreMes) {
        for(Mes mes : Mes.values()) {
            if (mes.name().equalsIgnoreCase(nombreMes)) {
                return mes;
            }
        }
        return null;
    }
}
